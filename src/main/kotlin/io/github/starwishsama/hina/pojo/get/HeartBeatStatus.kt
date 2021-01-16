package io.github.starwishsama.hina.pojo.get

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class HeartBeatStatus(
    @SerializedName("app_enabled")
    val appEnabled: Boolean,

    @SerializedName("app_good")
    val appGood: Boolean,

    @SerializedName("app_initialized")
    val appInitialized: Boolean,

    @SerializedName("good")
    val good: Boolean,

    @SerializedName("online")
    val online: Boolean,

    @SerializedName("plugins_good")
    val pluginGood: PluginGoodStatus
) {
    @Serializable
    data class PluginGoodStatus(
        @SerializedName("async_actions")
        val asyncActions: Boolean
    )
}