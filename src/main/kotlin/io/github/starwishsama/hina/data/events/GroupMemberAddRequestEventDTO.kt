package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.BotEventDTO
import kotlinx.serialization.Serializable

@Serializable
data class GroupMemberAddRequestEventDTO(
    @SerializedName("self_id")
    override var selfId: Long,
    @SerializedName("sub_type")
    val subType: String,
    @SerializedName("group_id")
    val groupId: Long,
    @SerializedName("user_id")
    val userId: Long,
    val comment: String,
    val flag: String,
    override var time: Long
): BotEventDTO() {
    @SerializedName("post_type")
    override var postType: String = "request"
    @SerializedName("request_type")
    val requestType: String = "group"
}