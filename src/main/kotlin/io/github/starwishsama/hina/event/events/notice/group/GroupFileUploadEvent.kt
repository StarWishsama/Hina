package io.github.starwishsama.hina.event.events.notice.group

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.event.events.notice.NoticeEvent

data class GroupFileUploadEvent(
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
    override val noticeType: String = "group_upload",

    @SerializedName("group_id")
    @Expose
    val groupId: Long,

    @SerializedName("user_id")
    @Expose
    val userId: Long,

    @SerializedName("file")
    @Expose
    val fileInfo: FileInfo
): NoticeEvent(time, postType, selfId, hina, noticeType) {
    data class FileInfo(
        @SerializedName("id")
        val fileId: String,

        @SerializedName("name")
        val fileName: String,

        @SerializedName("size")
        val fileSize: Long,

        @SerializedName("busid")
        val busId: Long
    )
}