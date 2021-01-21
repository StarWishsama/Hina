package io.github.starwishsama.hina.event.events.meta

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina

data class MetaLifecycleEvent(
    @SerializedName("time")
    @Expose
    override val time: Long,

    @SerializedName("post_type")
    @Expose
    override val postType: String = "meta_event",

    @SerializedName("self_id")
    @Expose
    override val selfId: Long,

    override val hina: Hina,

    @SerializedName("meta_event_type")
    @Expose
    override val metaEventType: String = "lifecycle",

    /**
     * 事件子类型，分别表示 OneBot 启用、停用、WebSocket 连接成功
     *
     * 可能的值: enable、disable、connect
     *
     * 注意，目前生命周期元事件中，只有 HTTP POST 的情况下可以收到 enable 和 disable，只有正向 WebSocket 和反向 WebSocket 可以收到 connect。
     */
    @SerializedName("sub_type")
    @Expose
    val subType: String
): MetaEvent(time, postType, selfId, hina, metaEventType)