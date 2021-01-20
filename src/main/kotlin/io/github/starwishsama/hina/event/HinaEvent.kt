package io.github.starwishsama.hina.event

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

open class HinaEvent(
    /**
     * 事件发生的时间戳
     */
    @SerializedName("time")
    @Expose
    open val time: Long,

    /**
     * 事件类型, 可以有以下几种:
     * message, notice, request, meta_event
     */
    @SerializedName("post_type")
    @Expose
    protected open val postType: String,

    @SerializedName("self_id")
    @Expose
    open val selfId: Long,

    protected open val hina: Hina
)