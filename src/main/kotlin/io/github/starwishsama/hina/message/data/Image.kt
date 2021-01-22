package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Image(
    /**
     * 图片文件名
     */
    @SerializedName("file")
    @Expose
    val file: String,

    @SerializedName("type")
    @Expose
    val imageType: String = "",

    @SerializedName("cache")
    val useCache: Boolean = true
): MessageData() {
    @SerializedName("url")
    var imageUrl: String = ""

    fun isFlashImage() = imageType.isEmpty()
    override fun toOneBotCode(): String = "[CQ:image,${if (useCache) "cache=0," else ""}" +
            "file=${if (imageUrl.isNotEmpty()) imageUrl else file}]"
}