package io.github.starwishsama.hina

import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import net.mamoe.yamlkt.Comment

/**
 * [HinaConfig]
 *
 * 用于储存 [Hina] 的配置文件
 *
 * 你可以使用 [HinaConfig.HinaConfigBuilder] 来快速构建一个配置文件
 * 但推荐使用 Kotlin 的 apply() 方法
 */
@Suppress("unused")
@Serializable
data class HinaConfig constructor(
    /** Hina 服务端接收端口 */
    @Comment("Hina 服务端接收端口")
    @Transient var incomingSocketPort: Int = 0,

    /** 调试模式 */
    @Comment("调试模式")
    var debugMode: Boolean = false,

    /** 维护模式 */
    @Comment("维护模式")
    var maintenanceMode: Boolean = false,

    /** 当处于维护模式时机器人回复的消息 */
    @Comment("当处于维护模式时机器人回复的消息")
    var maintenanceMessage: String = "< 机器人维护中 >",

    /** 与 OneBot API 通信时使用的验证密钥, 设为空禁用验证 */
    @Comment("与 OneBot API 通信时使用的验证密钥 (Secret), 设为空禁用验证")
    @Transient var secret: String = "",

    /** 与 OneBot API 通信时使用的访问令牌 (Access Token), 设为空禁用验证 */
    @Comment("与 OneBot API 通信时使用的访问令牌 (Access Token), 设为空禁用验证")
    @Transient var accessToken: String = "",

    /** 是否使用异步 API */
    @Comment("是否使用异步 API")
    var useAsyncApi: Boolean = false,

    /** 是否使用限速调用功能 (enable_rate_limited_actions=true 时) */
    @Comment("是否使用限速调用功能 (enable_rate_limited_actions=true 时)")
    var apiRateLimitedMode: Boolean = false,

    /** 用于解析指令中参数的正则表达式 */
    @Comment("用于解析指令中参数的正则表达式")
    var defaultArgsSplitRegex: String = " ",

    /** 日志文件夹名 */
    @Comment("日志文件夹名")
    val logFolderName: String = "logs",

    /** 日志文件名 */
    @Comment("日志文件名")
    val logFileName: String = "HinaLog",

    /** 不要输出日志啦 */
    @Comment("是否停用日志输出")
    val noLogOutput: Boolean = false
) {
    class HinaConfigBuilder {
        private var incomingSocketPort: Int = 0
        private var debugMode: Boolean = false
        private var maintenanceMode: Boolean = false
        private var maintenanceMessage: String = "< 机器人维护中 >"
        private var secret: String = ""
        private var accessToken: String = ""
        private var useAsyncApi: Boolean = false
        private var apiRateLimitedMode: Boolean = false
        private var defaultArgsSplitRegex: String = " "
        private var logFolderName: String = "logs"
        private var logFileName: String = "HinaLog"
        private var noLogOutput: Boolean = false

        fun build(): HinaConfig {
            return HinaConfig(incomingSocketPort, debugMode, maintenanceMode, maintenanceMessage, secret, accessToken, useAsyncApi, apiRateLimitedMode, defaultArgsSplitRegex, logFolderName, logFileName, noLogOutput)
        }

        fun incomingSocketPort(port: Int): HinaConfigBuilder {
            this.incomingSocketPort = port
            return this
        }

        fun debugMode(switch: Boolean): HinaConfigBuilder {
            this.debugMode = switch
            return this
        }

        fun maintenanceMode(switch: Boolean): HinaConfigBuilder {
            this.maintenanceMode = switch
            return this
        }

        fun maintenanceMessage(message: String): HinaConfigBuilder {
            this.maintenanceMessage = message
            return this
        }

        fun secret(secret: String): HinaConfigBuilder {
            this.secret = secret
            return this
        }

        fun accessToken(token: String): HinaConfigBuilder {
            this.accessToken = token
            return this
        }

        fun useAsyncApi(useAsyncApi: Boolean): HinaConfigBuilder {
            this.useAsyncApi = useAsyncApi
            return this
        }

        fun apiRateLimitedMode(apiRateLimitedMode: Boolean): HinaConfigBuilder {
            this.apiRateLimitedMode = apiRateLimitedMode
            return this
        }

        fun defaultArgsSplitRegex(defaultArgsSplitRegex: String): HinaConfigBuilder {
            this.defaultArgsSplitRegex = defaultArgsSplitRegex
            return this
        }

        fun logFolderName(logFolderName: String): HinaConfigBuilder {
            this.logFolderName = logFolderName
            return this
        }

        fun logFileName(logFileName: String): HinaConfigBuilder {
            this.logFolderName = logFileName
            return this
        }

        fun noLogOutput(noLogOutput: Boolean): HinaConfigBuilder {
            this.noLogOutput = noLogOutput
            return this
        }
    }
}