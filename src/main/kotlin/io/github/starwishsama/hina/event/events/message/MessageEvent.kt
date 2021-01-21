package io.github.starwishsama.hina.event.events.message

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.event.HinaEvent
import io.github.starwishsama.hina.sender.MessageSender

open class MessageEvent(
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
    override val postType: String = "message",

    @SerializedName("self_id")
    @Expose
    override val selfId: Long,

    override val hina: Hina,

    /**
     * 消息类型
     * 例如 private
     */
    @SerializedName("message_type")
    @Expose
    open val messageType: String,

    @SerializedName("sub_type")
    @Expose
    open val subType: String,

    @SerializedName("message_id")
    @Expose
    open val messageId: Long,

    @SerializedName("user_id")
    @Expose
    open val userId: Long,

    @SerializedName("message")
    @Expose
    open val message: String,

    @SerializedName("raw_message")
    @Expose
    open val rawMessage: String,

    @SerializedName("font")
    @Expose
    open val font: Int,

    @SerializedName("sender")
    @Expose
    open val sender: MessageSender
): HinaEvent(time, postType, selfId, hina)