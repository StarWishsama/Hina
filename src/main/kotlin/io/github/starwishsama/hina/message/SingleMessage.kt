package io.github.starwishsama.hina.message

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.message.data.MessageData

class SingleMessage(
    @SerializedName("type")
    val type: String,

    @SerializedName("data")
    val data: MessageData
)