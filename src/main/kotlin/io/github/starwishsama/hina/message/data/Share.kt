package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Share(
    @SerializedName("url")
    val url: String,

    @SerializedName("title")
    val title: String,

    @SerializedName("content")
    val description: String = "",

    @SerializedName("image")
    val imageURL: String
): MessageData() {
    override fun toOneBotCode(): String {
        return buildString {
            append("[CQ:share,url=${url},title=${title}")

            if (description.isNotEmpty()) append(",content=$description")
            if (imageURL.isNotEmpty()) append(",image=${imageURL}")

            append("]")
        }
    }
}