package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.BotEventDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CQGroupMuteChangeEvent")
data class GroupMuteChangeEventDTO(
    @SerializedName("self_id")
    override var selfId: Long,
    @SerializedName("sub_type")
    val subType: String,
    @SerializedName("group_id")
    val groupId: Long,
    @SerializedName("operator_id")
    val operatorId: Long,
    @SerializedName("user_id")
    val userId: Long,
    val duration: Int,
    override var time: Long
): BotEventDTO() {
    @SerializedName("ost_type")
    override var postType: String = "notice"
    @SerializedName("notice_type")
    val noticeType: String = "group_ban"
}