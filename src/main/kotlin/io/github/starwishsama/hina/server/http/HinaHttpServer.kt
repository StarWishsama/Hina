package io.github.starwishsama.hina.server.http

import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.logger.HinaLogger
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.util.*

@Suppress("MemberVisibilityCanBePrivate", "CanBeParameter")
@OptIn(KtorExperimentalAPI::class)
open class HinaHttpServer(val hina: Hina, val logger: HinaLogger = HinaLogger("HinaNet")) {
    lateinit var server: ApplicationEngine

    init {
        try {
            server = embeddedServer(CIO, environment = applicationEngineEnvironment {
                module {
                    hinaService(hina)
                }
                connector {
                    this.port = hina.config.incomingSocketPort
                }
            })
        } catch (e: Exception) {
            logger.warning("Hina 服务端启动失败", e)
        }
    }

    fun start() {
        server.start(false)
    }

    fun close() {
        server.stop(5_000, 5_000)
    }
}