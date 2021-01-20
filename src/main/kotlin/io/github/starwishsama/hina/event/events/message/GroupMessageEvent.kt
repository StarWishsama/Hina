package io.github.starwishsama.hina.event.events.message

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.event.HinaEvent
import kotlinx.serialization.Serializable

data class GroupMessageEvent(
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

    @SerializedName("group_id")
    @Expose
    val groupId: Long,

    @SerializedName("user_id")
    @Expose
    val userId: Long,

    @SerializedName("anonymous")
    @Expose
    val anonymous: AnonymousInfo,

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
    val sender: GroupMessageSender
): HinaEvent(time, postType, selfId, hina) {

    data class AnonymousInfo(
        /**
         * 匿名用户 ID
         */
        @SerializedName("id")
        val id: Long,

        /**
         * 匿名用户名称
         */
        @SerializedName("name")
        val name: String,

        /**
         * 匿名用户 flag，在调用禁言 API 时需要传入
         */
        @SerializedName("flag")
        val flag: String
    )

    data class GroupMessageSender(
        @SerializedName("user_id")
        val userId: Long,

        @SerializedName("nickname")
        val nickName: String,

        @SerializedName("sex")
        val sex: UserSex,

        @SerializedName("age")
        val age: Int
    )

    @Serializable
    enum class UserSex {
        MALE, FEMALE, UNKNOWN
    }
}