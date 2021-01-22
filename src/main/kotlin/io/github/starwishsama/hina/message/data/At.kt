package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class At(
    @SerializedName("at")
    @Expose
    val id: String
): MessageData() {
    companion object {
        fun atAll(): At {
            return At("all")
        }
    }

    override fun toOneBotCode(): String = "[CQ:at,qq=${id}]"
}