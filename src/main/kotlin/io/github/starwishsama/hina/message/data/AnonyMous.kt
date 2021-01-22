package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.SerializedName

class AnonyMous(
    @SerializedName("ignore")
    val ignoreFail: Boolean = false
): MessageData() {
    override fun toOneBotCode(): String =
        "[CQ:anonymous${if (ignoreFail) ",ignore=0" else ""}]"
}