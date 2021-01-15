package io.github.starwishsama.hina.api

/**
 * [OneBotRouteURL]
 *
 * 用于储存 OneBot (V11) 可调用的 API 子链接
 *
 * @author StarWishsama
 */
enum class OneBotRouteURL(val subUrl: String, val isAsync: Boolean) {
    SEND_PRIVATE_MSG("send_private_msg", true),
    SEND_GROUP_MSG(
        "send_group_msg",
        true
    ),
    SEND_DISCUSS_MSG("send_discuss_msg", true),
    SEND_LIKE("send_like", true),
    DELETE_MSG(
        "delete_msg",
        true
    ),
    SEND_GROUP_NOTICE("_send_group_notice", true),

    GET_MSG("get_msg", true),

    SET_GROUP_KICK("set_group_kick", true),
    SET_GROUP_BAN(
        "set_group_ban",
        true
    ),
    SET_GROUP_ANONYMOUS_BAN("set_group_anonymous_ban", true),
    SET_GROUP_WHOLE_BAN(
        "set_group_whole_ban",
        true
    ),
    SET_GROUP_ADMIN("set_group_admin", true),
    SET_GROUP_ANONYMOUS(
        "set_group_anonymous",
        true
    ),
    SET_GROUP_CARD("set_group_card", true),
    SET_GROUP_LEAVE(
        "set_group_leave",
        true
    ),
    SET_GROUP_SPECIAL_TITLE("set_group_special_title", true),
    SET_DISCUSS_LEAVE(
        "set_discuss_leave",
        true
    ),
    SET_FRIEND_ADD_REQUEST("set_friend_add_request", true),
    SET_GROUP_ADD_REQUEST(
        "set_group_add_request",
        true
    ),

    CLEAN_PLUGIN_LOG("clean_plugin_log", true),

    GET_STRANGER_INFO(
        "get_stranger_info",
        false
    ),
    GET_GROUP_LIST("get_group_list", false),
    GET_GROUP_MEMBER_INFO(
        "get_group_member_info",
        false
    ),
    GET_GROUP_MEMBER_LIST("get_group_member_list", false),
    GET_FRIEND_LIST_NEW(
        "get_friend_list",
        false
    ),
    GET_FRIEND_LIST_OLD("_get_friend_list", false),
    GET_GROUP_INFO_NEW(
        "get_group_info",
        false
    ),
    GET_GROUP_INFO_OLD("_get_group_info", false),
    GET_VIP_INFO("_get_vip_info", false),
    GET_RECORD(
        "get_record",
        false
    ),
    GET_IMAGE("get_image", false),
    GET_GROUP_NOTICE("_get_group_notice", false),

    CAN_SEND_IMAGE("can_send_image", false),
    CAN_SEND_RECORD("can_send_record", false),
    GET_VERSION_INFO("get_version_info", false),
    GET_STATUS("get_status", false),
}