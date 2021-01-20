package io.github.starwishsama.hina.sender

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.event.events.message.PrivateMessageEvent
import kotlinx.serialization.Serializable

open class MessageSender(
    @SerializedName("user_id")
    open val userId: Long,

    @SerializedName("nickname")
    open val nickName: String,

    @SerializedName("sex")
    open val sex: UserSex,

    @SerializedName("age")
    open val age: Int
) {

    @Serializable
    enum class UserSex {
        MALE, FEMALE, UNKNOWN
    }
}