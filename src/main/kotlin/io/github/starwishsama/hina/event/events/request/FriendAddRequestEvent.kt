package io.github.starwishsama.hina.event.events.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina

data class FriendAddRequestEvent(
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
    override val postType: String = "notice",

    @SerializedName("self_id")
    @Expose
    override val selfId: Long,

    override val hina: Hina,

    /**
     * 通知类型
     */
    @SerializedName("request_type")
    @Expose
    override val requestType: String = "friend",

    @SerializedName("user_id")
    @Expose
    val userId: Long,

    @SerializedName("comment")
    @Expose
    val comment: String,

    @SerializedName("flag")
    @Expose
    val flag: String,

    /**
     * 是否同意请求
     */
    @SerializedName("approve")
    @Expose
    val approve: Boolean?,

    /**
     * 添加后的好友备注（仅在同意时有效）
     */
    @SerializedName("remark")
    @Expose
    val remark: String?
): RequestEvent(time, postType, selfId, hina, requestType)