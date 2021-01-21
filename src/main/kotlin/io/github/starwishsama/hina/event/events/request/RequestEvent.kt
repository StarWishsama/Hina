package io.github.starwishsama.hina.event.events.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.event.HinaEvent

open class RequestEvent(
    /**
     * 事件发生的时间戳
     */
    @SerializedName("time")
    @Expose
    override val time: Long,

    /**
     * 事件类型, 可以有以下几种:
     * message, notice, request, meta_event
     */
    @SerializedName("post_type")
    @Expose
    override val postType: String = "request",

    @SerializedName("self_id")
    @Expose
    override val selfId: Long,

    override val hina: Hina,

    /**
     * 通知类型
     */
    @SerializedName("request_type")
    @Expose
    open val requestType: String,
): HinaEvent(time, postType, selfId, hina)