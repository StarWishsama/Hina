package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.BotEventDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CQMemberJoinEvent")
data class MemberJoinEventDTO(
    @SerializedName("self_id")
    override var selfId: Long,
    /** 如 approve、invite */
    @SerializedName("sub_type")
    val subType: String,
    val group_id: Long,
    val operator_id: Long,
    val user_id: Long,
    override var time: Long
) : BotEventDTO() {
    @SerializedName("post_type")
    override var postType: String = "notice"
    @SerializedName("notice_type")
    val noticeType: String = "group_increase"
}