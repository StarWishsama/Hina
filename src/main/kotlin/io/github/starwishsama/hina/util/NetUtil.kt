package io.github.starwishsama.hina.util

import java.net.URI

internal object NetUtil {
    /**
     * 用主机地址和端口创建URL
     *
     * @param host 主机地址
     * @param port 端口
     * @return URL 字符串
     */
    fun createApiUrl(host: String, port: Int): String {
        return URI("http", null, host, port, "/", null, null).toURL().toString()
    }
}