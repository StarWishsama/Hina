package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.BotEventDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CQMemberLeaveEvent")
data class MemberLeaveEventDTO(
    @SerializedName("self_id")
    override var selfId: Long,
    /** 如 leave、kick、kick_me */
    @SerializedName("sub_type")
    val subType: String,
    @SerializedName("group_id")
    val groupId: Long,
    @SerializedName("operator_id")
    val operatorId: Long,
    @SerializedName("user_id")
    val userId: Long,
    override var time: Long
): BotEventDTO() {
    @SerializedName("post_type")
    override var postType: String = "notice"
    @SerializedName("notice_type")
    val noticeType: String = "group_decrease"
}