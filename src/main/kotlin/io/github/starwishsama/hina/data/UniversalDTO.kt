package io.github.starwishsama.hina.data

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

interface UniversalDTO

@Serializable
abstract class UniversalEventDTO : UniversalDTO {
    // 序列化成 post_type
    abstract var postType: String
    // 序列化成 self_id
    abstract var selfId: Long
    // 序列化成 time
    abstract var time: Long
}

@Serializable
abstract class CQEventDTO {
    // 序列化成 post_type
    abstract var postType: String
    // 序列化成 self_id
    abstract var selfId: Long
    // 序列化成 time
    abstract var time: Long
}

@Serializable
class IgnoredEventDTO(@SerializedName("self_id") override var selfId: Long) : CQEventDTO() {
    @SerializedName("post_type")
    override var postType = "忽略"
    override var time = System.currentTimeMillis()
}