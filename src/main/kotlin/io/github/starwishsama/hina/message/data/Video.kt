package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Video(
    @SerializedName("file")
    @Expose
    val file: String,

    @SerializedName("url")
    @Expose
    val url: String,

    @SerializedName("cache")
    val useCache: Boolean = true
): MessageData() {
    override fun toOneBotCode(): String =
        "[CQ:video,file=${file},${if (useCache) ",cache=0" else ""}]"

}