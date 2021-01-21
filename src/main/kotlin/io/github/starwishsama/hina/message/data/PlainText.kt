package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.SerializedName

data class PlainText(
    @SerializedName("text")
    val text: String
): MessageData