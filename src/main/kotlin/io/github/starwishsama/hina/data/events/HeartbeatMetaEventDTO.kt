package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.BotEventDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CQHeartbeatMetaEvent")
data class HeartbeatMetaEventDTO(
    @SerializedName("self_id")
    override var selfId: Long,
    override var time: Long,
    val status: RunningStatus,
    val interval: Long,
) : BotEventDTO() {
    @SerializedName("post_type")
    override var postType: String = "meta_event"
    @SerializedName("meta_event_type")
    val metaEventType: String = "heartbeat"

    @Serializable
    data class RunningStatus(
        val online: Boolean,
        val good: Boolean
    )
}