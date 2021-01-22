package io.github.starwishsama.hina.message.data

import com.google.gson.annotations.SerializedName

data class Poke(
    @SerializedName("type")
    val type: Long,

    @SerializedName("id")
    val id: Long,

    @SerializedName("name")
    val faceName: String = ""
): MessageData() {
    override fun toOneBotCode(): String = "[CQ:poke,type=${type},id=${id}]"
}

sealed class PokeTypes(private val display: String, val type: Long, val id: Long) {
    object Poke: PokeTypes("戳一戳", 1, -1)
    object ShowLove: PokeTypes("比心", 2, -1)
    object Like: PokeTypes("点赞", 3, -1)
    object HeartBreak: PokeTypes("心碎", 4, -1)
    object SixSixSix: PokeTypes("666", 5, -1)
    object FangDaZhao: PokeTypes("放大招", 6, -1)
    object GouYin : PokeTypes("勾引", 126, 2003)

    // 以下类型需要 SVIP

    /** 宝贝球 (SVIP) */
    object BaoBeiQiu: PokeTypes("宝贝球", 126, 2011)

    /** 玫瑰花 (SVIP) */
    object Rose : PokeTypes("玫瑰花", 126, 2007)
    
    /** 召唤术 (SVIP) */
    object ZhaoHuanShu : PokeTypes("召唤术", 126, 2006)

    /** 让你皮 (SVIP) */
    object RangNiPi : PokeTypes("让你皮", 126, 2009)

    /** 结印 (SVIP) */
    object JieYin : PokeTypes("结印", 126, 2005)

    /** 手雷 (SVIP) */
    object ShouLei : PokeTypes("手雷", 126, 2004)
    
    /** 抓一下 (SVIP) */
    object ZhuaYiXia : PokeTypes("抓一下", 126, 2001)

    /** 碎屏 (SVIP) */
    object SuiPing : PokeTypes("碎屏", 126, 2002)

    /** 敲门 (SVIP) */
    object QiaoMen : PokeTypes("敲门", 126, 2002)

    fun convert(): io.github.starwishsama.hina.message.data.Poke {
        return Poke(type, id, display)
    }
}