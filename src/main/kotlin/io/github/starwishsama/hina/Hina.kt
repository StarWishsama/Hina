package io.github.starwishsama.hina

import io.github.starwishsama.hina.command.CommandExecutor
import io.github.starwishsama.hina.server.HinaHttpServer
import io.ktor.application.*
import io.ktor.client.engine.okhttp.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

class Hina(val config: HinaConfig) {
    lateinit var server: HinaHttpServer
    private lateinit var eventManager: EventManager
    private lateinit var accountManager: AccountManager
    private lateinit var GroupCacheManager: GroupCacheManager
    private lateinit var commandExecutor: CommandExecutor
    private lateinit var logger: HinaLogger

    constructor(config: HinaConfig, initNow: Boolean) : this(config) {
        if (initNow) {
            init()
        }
    }

    private fun init() {
        logger.disabled = config.noLogOutput
        logger.outputFile = config.logFileName
    }
}

fun main() {
    embeddedServer(ApplicationEngineFactory<OkHttp, {}>())
}