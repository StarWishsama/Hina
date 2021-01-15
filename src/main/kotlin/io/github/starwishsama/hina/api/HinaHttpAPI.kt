package io.github.starwishsama.hina.api

import io.github.starwishsama.hina.Hina
import io.github.starwishsama.hina.util.NetUtil

class HinaHttpAPI(val bot: Hina, val postURL: String, val postPort: Int) {
    val routeUrl: String = NetUtil.createApiUrl(postURL, postPort)
}