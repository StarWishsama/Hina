package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.SerializedName

data class Face(
    @SerializedName("id")
    val id: Long
): MessageData