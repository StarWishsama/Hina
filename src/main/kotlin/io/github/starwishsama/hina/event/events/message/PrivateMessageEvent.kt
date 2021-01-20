package io.github.starwishsama.hina.event.events.message

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.event.HinaEvent
import io.github.starwishsama.hina.sender.MessageSender
import kotlinx.serialization.Serializable

data class PrivateMessageEvent(
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
    override val postType: String,

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
    val messageType: String,

    @SerializedName("sub_type")
    @Expose
    val subType: String,

    @SerializedName("message_id")
    @Expose
    val messageId: Long,

    @SerializedName("user_id")
    @Expose
    val userId: Long,

    @SerializedName("message")
    @Expose
    val message: String,

    @SerializedName("raw_message")
    @Expose
    val rawMessage: String,

    @SerializedName("font")
    @Expose
    val font: Int,

    @SerializedName("sender")
    @Expose
    val sender: MessageSender
): HinaEvent(time, postType, selfId, hina)