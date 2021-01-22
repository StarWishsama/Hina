package io.github.starwishsama.hina.message.data

class Dice: MessageData() {
    override fun toOneBotCode(): String = "[CQ:dice]"
}