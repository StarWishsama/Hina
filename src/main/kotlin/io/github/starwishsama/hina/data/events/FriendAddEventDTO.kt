package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.BotEventDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
@SerialName("CQFriendAddEvent")
data class FriendAddEventDTO(
    @SerializedName("self_id")
    override var selfId: Long,
    override var time: Long
): BotEventDTO() {
    @SerializedName("post_type")
    override var postType: String = "notice"
    @SerializedName("notice_type")
    val noticeType: String = "friend_add"
}