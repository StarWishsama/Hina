package io.github.starwishsama.hina.event

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.github.starwishsama.hina.Hina

open class HinaEvent(
    @SerializedName("post_type")
    @Expose
    protected open val postType: String,

    @SerializedName("self_id")
    @Expose
    open val selfId: Long,

    protected open val hina: Hina
)