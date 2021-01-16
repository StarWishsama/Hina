package io.github.starwishsama.hina.event.events.meta

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.event.HinaEvent

data class MetaHeartbeatEvent(
    @SerializedName("post_type")
    @Expose
    override val postType: String,

    @SerializedName("self_id")
    @Expose
    override val selfId: Long,

    override val hina: Hina
): HinaEvent(postType, selfId, hina) {

}