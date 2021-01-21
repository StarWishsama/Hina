package io.github.starwishsama.hina.event.events.notice.group

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.event.events.notice.NoticeEvent

data class GroupHonorChangedEvent(
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

    @SerializedName("notice_type")
    @Expose
    override val noticeType: String = "notify",

    @SerializedName("sub_type")
    @Expose
    val subType: String = "honor",

    @SerializedName("group_id")
    @Expose
    val groupId: Long,

    @SerializedName("user_id")
    @Expose
    val userId: Long,

    @SerializedName("honor_type")
    @Expose
    val honorType: HonorType
): NoticeEvent(time, postType, selfId, hina, noticeType) {
    enum class HonorType(val display: String) {
        TALKATIVE("龙王"), PERFORMER("群聊之火"), EMOTION("快乐源泉")
    }
}