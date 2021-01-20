package io.github.starwishsama.hina.sender

import com.google.gson.annotations.SerializedName

class GroupMessageSender(
    @SerializedName("user_id")
    override val userId: Long,

    @SerializedName("nickname")
    override val nickName: String,

    @SerializedName("sex")
    override val sex: UserSex,

    @SerializedName("age")
    override val age: Int,

    @SerializedName("card")
    val card: String,

    @SerializedName("area")
    val area: String,

    @SerializedName("level")
    val level: String,

    /**
     * 角色，见 [GroupPermission]
     */
    @SerializedName("role")
    val role: GroupPermission,

    /**
     * 专属头衔
     */
    @SerializedName("title")
    val title: String
): MessageSender(userId, nickName, sex, age) {
    enum class GroupPermission {
        OWNER, ADMIN, MEMBER
    }
}