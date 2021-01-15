package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.CQEventDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("CQLifecycleMetaEvent")
data class LifeCycleMetaEventDTO(
    override var selfId: Long,
    val sub_type: String, // enable、disable、connect
    override var time: Long
) : CQEventDTO() {
    override var postType: String = "meta_event"
    @SerializedName("meta_event_type")
    val metaEventType: String = "lifecycle"
}