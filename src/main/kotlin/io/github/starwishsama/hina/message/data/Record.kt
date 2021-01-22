package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Record(
    @SerializedName("file")
    @Expose
    val file: String,

    @SerializedName("magic")
    @Expose
    val useMagic: Int?,

    @SerializedName("url")
    @Expose
    val url: String,

    @SerializedName("cache")
    val useCache: Boolean = false
): MessageData() {
    override fun toOneBotCode(): String {
        return "[CQ:record,file=${file}" +
                "${if (useCache) ",cache=0" else ""}]"
    }

}