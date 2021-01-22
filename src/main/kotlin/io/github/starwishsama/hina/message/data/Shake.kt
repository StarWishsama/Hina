package io.github.starwishsama.hina.message.data

class Shake: MessageData() {
    override fun toOneBotCode(): String = "[CQ:shake]"
}