package io.github.starwishsama.hina.server.http

import com.google.gson.JsonElement
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.api.OneBotRouteURL
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.util.pipeline.*

fun Application.hinaService(hina: Hina) {
    install(CallLogging)
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
            disableHtmlEscaping()
        }
    }

    routing {
        OneBotRouteURL.values().forEach {
            oneBotApi("/${it}") {
                call.respond("WIP")
            }
        }
    }
}

internal inline fun Routing.oneBotApi(
    path: String,
    crossinline body: suspend PipelineContext<Unit, ApplicationCall>.(Pair<Map<String, JsonElement>, Boolean>) -> Unit
) {
    // 标准调用
    route(path) {
        get {
            TODO()
        }
        post {
            TODO()
        }
    }

    // 异步调用
    route("${path}_async") {
        get {
            TODO()
        }
        post {
            TODO()
        }
    }
}