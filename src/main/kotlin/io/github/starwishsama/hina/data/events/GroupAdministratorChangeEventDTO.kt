package io.github.starwishsama.hina.data.events

import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.data.BotEventDTO

data class GroupAdministratorChangeEventDTO(
    @SerializedName("self_id")
    override var selfId: Long,
    @SerializedName("sub_type")
    val subType: String,
    @SerializedName("group_id")
    val groupId: Long,
    @SerializedName("user_id")
    val userId: Long,
    override var time: Long
): BotEventDTO() {
    @SerializedName("post_type")
    override var postType: String = "notice"
    @SerializedName("notice_type")
    val noticeType: String = "group_admin"
}