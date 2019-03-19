dc-backend 接口

[TOC]

### 说明

主要功能：小程序《次元讯息》接口文档

### Part1 接口部分

请求路径：https://mhd.tangzhengxiong.com/dc-backend/


#####获取历史信息

接口功能： 获取历史信息

URL: `/base/policy/get`

http请求方式： `get`

```
Content-Type: application/x-www-form-urlencoded
```

请求参数：
```
无
```

返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ------- | ------- | ------------------------------ |
| errcode | Integer | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg  | String  | 描述                             |
| data    | Object  | 具体数据                         |

data内字段：

| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| id        | Long  | 条款id  |
| content 	   | String  | 条款内容|


结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        {
            "id": 1,
            "content": "条款1:"
        }
    ]
}
```
#####添加资源接口

功能：添加资源接口

URL: `/base/resource/add`

http请求方式：post

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| title             	  | String    | 资源标题                            | 是   |
|desc                   | String     | 描述  |否   |
|content                   | String     | 内容 | 是   |
|imageFileId                   | int     | 上传图像返回的id | 否   |
|price                   | int     | 价格  | 是   |
|expireTime                   | Long     | 过期时间 | 是   |
|refund                   | Byte     | 是否退款 | 是   |
|policyId                   | Long     | 条款id | 是   |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：

无


结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": ""
}
```
#####微信登录接口
功能：微信登录接口

URL: `/wx/login`

http请求方式：post

Content-Type: application/x-www-form-urlencoded

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| code             	  | String    |   用户标识                       |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：


| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| sessionKey        | String  | 用户标识  |

结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        {
            "sessionKey": "abcdefghijklmnopqrstuvwxyz"
        }
    ]
}
```

#####微信取款列表
功能：微信取款列表

URL: `/withdraw/list`

http请求方式：post

Content-Type: application/x-www-form-urlencoded

请求参数：

无


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：


| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| withdrawMoney        |int| 取款值  |
| cTime        |String| 取款时间  |

结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        {
            "withdrawMoney": 88，
            "cTime":"2018-12-19 18:19:22"
        }
    ]
}
```

#####添加资源
功能：添加资源

URL: `/base/resource/add`

http请求方式：post

Content-Type: application/json

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| title             	  | String    |   标题                | 是|
| desc             	  | String    |   描述          |否             |
| content             	  | String    |   内容                 |是      |
|imageFileId          	  | Long    |   上传图片Id    |     否      |
| price             	  | int    |   价格              |是    |
| expireTime        	  | String    |   过期时间 2018-12-19  |    是          |
| refund             	  | byte    |   是否退款                       |
| templateId             	  | String    |   模板                       |
| policyId             	  | Long    |   条约id                       |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：


无

结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
    ]
}

#####我买的资源
功能：微信登录接口

URL: `/base/resource/buy`

http请求方式：post

请求参数：
无


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：
| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| id        |Long| 主键  | 
| title        |String| 标题  |
| price        |int| 价格  |
| cTime        |String| 创建时间  |




结果示例：

​```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        {
            [
            "id": "123",
            "title":"asdf",
            "price":234,
            "cTime":"2018-12-19"
            ],[
             "id": "123",
            "title":"asdf",
            "price":234,
            "cTime":"2018-12-19"
            ]
        }
    ]
}
```

#####拉取创建的资源列表
功能：拉取创建的资源列表

URL: `/base/resource/create`

http请求方式：post

请求参数：
无


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：
| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| id        |Long| 主键  |
| title        |String| 标题  |
| price        |int| 价格  |
| cTime        |String| 创建时间  |




结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        {
            [
            "id": "123",
            "title":"asdf",
            "price":234,
            "cTime":"2018-12-19"
            ],[
             "id": "123",
            "title":"asdf",
            "price":234,
            "cTime":"2018-12-19"
            ]
        }
    ]
}
```

#####拉取删除创建的资源列表
功能：拉取删除创建的资源列表

URL: `/base/resource/delete/create`

http请求方式：post

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| resourceId             	  | Long    |   资源主键          |是             |



返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：


无

结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
       
    ]
}
```

#####删除我购买的资源
功能：删除我购买的资源

URL: `/base/resource/delete/buy`

http请求方式：post

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| resourceId             	  | Long    |   资源主键          |是             |



返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：


无

结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
       
    ]
}
```


#####完善用户信息
功能：完善用户信息

URL: `/wx/user/add/info`

http请求方式：post
Content-Type: application/json

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| encryptedData    	  | String    |   编码          |是             |
| iv    	  | String    |   偏移量          |是             |



返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：


无

结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
       "wxUserId": null,
               "nickName": null,
               "avatarUrl": null,
               "followStatus": null,
               "title": "我是好人",
               "resourceDesc": "他不是好人",
               "content": "他为啥不是好人",
               "imageFile": "",
               "price": 12.23,
               "expireTime": "1970-01-01 07:59:59",
               "refund": 1,
               "templateId": 1,
               "policyId": 2,
               "twoDimensionFile": null,
               "online": 0,
               "overdue": false,
               "ctime": "2019-01-09 18:10:51"
    ]
}
```


#####用户信息统计
功能：用户信息统计

URL: `/wx/user/static`

http请求方式：post

请求参数：

无



返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：

| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| balance        |int| 余额  |
| total        |int| 总额  |
| followNum        |int| 关注数  |
| fansNum        |int| 粉丝数  |
| income        |int| 收益  |
| followUserInfo        |List| 关注详情  |
| fansUserInfo        |List| 粉丝详情  |


结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
            "balance": "123",
            "total":"asdf",
            "followNum":234,
            "fansNum":"2018-12-19"，
             "income":"2018-12-19"
             "followUserInfo":[
                 "nickName":"",
                 "avatarUrl":""
             ],
            "fansUserInfo":[
                 "nickName":"",
                 "avatarUrl":""
             ]
        ]
}
```

#####获取关注状态
功能：获取关注状态

URL: `/wx/user/follow/status`

http请求方式：get
Content-Type: application/x-www

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| wxFollowUserId    	  | Long    |   操作对象          |是             |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：

data内容：

| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| wxUserId        |Long| 用户id  |
| wxFollowUserId        |Long| 关注用户id  |
| status        |Boolean| 关注状态：true 已关注，false 未关注  |



结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        "wxUserId":11,
        "wxFollowUserId":12,
        "status":true
    ]
}
```

#####修改关注状态
功能：修改关注状态

URL: `/wx/user/follow/update`

http请求方式：put
Content-Type: application/x-www

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| wxFollowUserId    	  | Long    |   操作对象          |是             |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |

data内容：

data内容：

| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| wxUserId        |Long| 用户id  |
| wxFollowUserId        |Long| 关注用户id  |
| status        |Boolean| 关注状态：true 已关注，false 未关注  |



结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        "wxUserId":11,
        "wxFollowUserId":12,
        "status":true
    ]
}
```

#####获取资源推荐列表（关注的用户发布的资源）
功能：获取资源推荐列表（关注的用户发布的资源）

URL: `/base/recom/list`

http请求方式：put
Content-Type: application/x-www

请求参数：

无

返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |


data内容：

| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| id        |Long| 资源id  |
| title        |String| 标题  |
| price        |BigDecimal|价格  |
| cTime        |String| 创建时间 |


结果示例：

```json
{
    "errcode": 0,
    "errmsg": "success.",
    "data": [
        "id":11,
        "title":"我是一个小仙女",
        "price":12.23,
        "price":"2018-12-3"
    ]
}
```


#####获取详情（关注的用户发布的资源）
功能：获取详情（关注的用户发布的资源）

URL: `/base/resource/info/get`

http请求方式：put
Content-Type: application/x-www

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| resourceId    	  | Long    |  资源id          |是             |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |


data内容：

| 返回字段         | 字段类型     | 说明      |
| ------------ | -------- | ------- |
| title        |String| 标题  |
| resourceDesc        |String|资源描述  |
| content        |String| 内容 |
| imageFile        |String| 图片url |
| price        |String| 价格 |
| expireTime        |String| 过期时间 |
| refund        |String| 支持退款 |
| templateId        |long| 模板id |
| policyId        |long| 协议id |
| twoDimensionFile        |String| 创建时间 |
| online        |byte| 是否上架0：上架，1 下架 |
| cTime        |String| 创建时间 |



结果示例：

```json
{
    "errcode": 0,
       "errmsg": "success.",
       "data": {
           "title": "我是好人",
           "resourceDesc": "他不是好人",
           "content": "他为啥不是好人",
           "imageFile": "",
           "price": 12.23,
           "expireTime": "2019-02-10 00:00:00",
           "refund": 1,
           "templateId": 1,
           "policyId": 2,
           "twoDimensionFile": "",
           "online": 0,
           "ctime": "2019-01-07 10:13:36"
       }
}
```

#####修改上架状态
功能：修改上架状态

URL: `/base/resource/online/update`

http请求方式：put
Content-Type: application/x-www

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| resourceId    	  | Long    |  资源id          |是             |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |


data内容：



结果示例：

```json
{
    "errcode": 0,
       "errmsg": "success.",
       "data": {
          "wxUserId":123,
          "id":123,,
          "title":"12312",
          "price":123.1,
          "expireTime":"2015-23-12",
          "overdue":true,
          "cTime":"2018-23-2"
       }
       
}
```

#####预支付
功能：预支付

URL: `/pay/unified/order`

http请求方式：post
Content-Type: application/json

请求参数：

| 参数名                     | 类型      | 说明              | 必填   |
| ----------------------- | ------- | -----  ------------|--|
| resourceId    	  | Long    |  资源id          |是             |


返回字段：

| 返回字段    | 字段类型    | 说明                             |
| ----------- | ----------- | -------------------------------- |
| errcode     | Integer     | 状态码（0=成功,1=系统错误,2=参数错误,3=沒有登录） |
| errmsg      | String      | 描述                             |
| data        | Object      | 具体数据                         |


data内容：



结果示例：

```json
{
    "errcode": 0,
       "errmsg": "success.",
       "data": {
          "prepayId":"123",
          "paySign":"123"
       }
       
}
```

