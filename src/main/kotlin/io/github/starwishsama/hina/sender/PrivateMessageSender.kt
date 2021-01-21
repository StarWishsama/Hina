package io.github.starwishsama.hina.sender

import com.google.gson.annotations.SerializedName

class PrivateMessageSender(
    @SerializedName("user_id")
    override val userId: Long,

    @SerializedName("nickname")
    override val nickName: String,

    @SerializedName("sex")
    override val sex: UserSex,

    @SerializedName("age")
    override val age: Int,
): MessageSender(userId, nickName, sex, age)