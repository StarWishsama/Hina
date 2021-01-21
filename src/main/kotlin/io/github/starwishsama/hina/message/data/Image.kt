package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.SerializedName

data class Image(
    /**
     * 图片文件名
     */
    @SerializedName("file")
    val file: String,

    @SerializedName("type")
    val imageType: String,

    @SerializedName("url")
    val imageUrl: String,

    @SerializedName("cache")
    val cache: Int?,

    @SerializedName("proxy")
    val proxy: Int?,

    @SerializedName("timeout")
    val timeout: Int?
): MessageData {
    fun isFlashImage() = imageType.isEmpty()
}