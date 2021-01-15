package io.github.starwishsama.hina.server

import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.logger.HinaLogger
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.util.*

@OptIn(KtorExperimentalAPI::class)
open class HinaHttpServer(val port: Int, val hina: Hina) {
    val logger: HinaLogger
    lateinit var server: ApplicationEngine

    init {
        logger = HinaLogger()
        try {
            server = embeddedServer(CIO, environment = applicationEngineEnvironment {
                connector {
                    this.port = hina.config.incomingSocketPort
                }
            })
            server.start(false)
        } catch (e: Exception) {
            logger // "Hina 服务端启动失败"
        }
    }

    fun close() {
        server.stop(5_000, 5_000)
    }
}