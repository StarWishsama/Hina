package io.github.starwishsama.hina.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

interface UniversalDTO

@Serializable
abstract class UniversalEventDTO : UniversalDTO {
    @SerialName("post_type")
    abstract var postType: String
    @SerialName("self_id")
    abstract var selfId: Long
    @SerialName("time")
    abstract var time: Long
}

@Serializable
abstract class CQEventDTO {
    @SerialName("post_type")
    abstract var postType: String
    @SerialName("self_id")
    abstract var selfId: Long
    @SerialName("time")
    abstract var time: Long
}

@Serializable
class IgnoredEventDTO(@SerialName("self_id") override var selfId: Long) : CQEventDTO() {
    @SerialName("post_type")
    override var postType = "忽略"
    override var time = System.currentTimeMillis()
}