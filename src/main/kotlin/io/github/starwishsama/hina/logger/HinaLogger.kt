package io.github.starwishsama.hina.logger

import java.lang.StringBuilder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val defaultPattern: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss")

class HinaLogger(
    val loggerName: String,
    val loggerFileName: String = "$loggerName + ${defaultPattern.format(LocalDateTime.now())}.txt",
    val logAction: (String) -> Unit = {
        println(it)
    },
) {
    fun log(level: HinaLogLevel, message: String, stacktrace: Throwable? = null) {

    }

    fun info(content: String) {

    }
}

enum class HinaLogColor

/**
 * https://github.com/Polar-Pumpkin/ParrotX/blob/master/src/main/java/org/serverct/parrot/parrotx/utils/i18n/PLogger.java#L126
 * 快速向控制台输出错误的堆栈跟踪。
 *
 * @param exception     Throwable 类型的异常.
 * @param packageFilter 包名关键词过滤, 不需要可以填写 null.
 * @param simpleMode    不进行格式化, 直接输出默认格式的堆栈文本.
 *
 * @author Polar-Pumpkin
 */
fun formatStacktrace(exception: Throwable, packageFilter: String? = null, simpleMode: Boolean): String {
    if (simpleMode) return exception.stackTraceToString()

    val msg = exception.localizedMessage
    return buildString {
        append("========================= 发生了错误 =========================")
        append("异常类型 ▶")
        append(HinaLogColor.RED.toString() + exception.javaClass.name)
        append(HinaLogColor.RED.toString() + if (msg == null || msg.isEmpty()) "没有详细信息" else msg)
        // org.serverct.parrot.plugin.Plugin
        var currentPackage = ""
        for (elem in exception.stackTrace) {
            val key = elem.className
            var pass = true
            if (packageFilter != null) {
                pass = key.contains(packageFilter)
            }
            val nameSet = key.split("[.]").toTypedArray()
            val className = nameSet[nameSet.size - 1]
            val packageSet = arrayOfNulls<String>(nameSet.size - 2)
            System.arraycopy(nameSet, 0, packageSet, 0, nameSet.size - 2)
            val packageName = StringBuilder()
            for ((counter, nameElem) in packageSet.withIndex()) {
                packageName.append(nameElem)
                if (counter < packageSet.size - 1) {
                    packageName.append(".")
                }
            }
            if (pass) {
                if (packageName.toString() != currentPackage) {
                    currentPackage = packageName.toString()
                    append("")
                    append("包 $packageName ▶")
                }
                append("  ▶ 在类 ${className}, 方法 ${elem.methodName} (${elem.fileName}) 行 ${elem.lineNumber}")
            }
        }
        append("========================= 发生了错误 =========================")
    }
}

sealed class HinaLogLevel(val display: String) {
    object Verbose: HinaLogLevel("VERBOSE")
    object Info: HinaLogLevel("INFO")
    object Debug: HinaLogLevel("DEBUG")
    object Error: HinaLogLevel("ERROR")
    object Warn: HinaLogLevel("WARN")
}