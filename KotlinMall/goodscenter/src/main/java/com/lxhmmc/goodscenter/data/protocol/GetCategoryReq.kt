package com.lxhmmc.goodscenter.data.protocol

/*
    获取分类列表请求，parentId为0是一级分类
 */
data class GetCategoryReq (val parentId: Int)
