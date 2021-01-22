package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.SerializedName

data class PlainText(
    @SerializedName("text")
    val text: String
): MessageData() {
    // 纯文本不需要转换为 OneBot 码
    override fun toOneBotCode(): String = text
}