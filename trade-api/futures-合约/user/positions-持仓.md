### url:www.***.com(例)

## 接口地址:/fapi/v1/position

## 接口说明:(get请求)持仓

#### HEADER

| Key          | Value                                          | 填写类型 | 说明                                                         |
| ------------ | ---------------------------------------------- | -------- | ------------------------------------------------------------ |
| Content-Type | Content-Type:application/x-www-form-urlencoded | 必填     |                                                              |
| X-CH-APIKEY  |                                                | 必填     | 密钥                                                         |
| X-CH-TS      |                                                | 必填     | 请求时间戳：毫秒（13位）                                     |
| X-CH-SIGN    |                                                | 必填     | 签名：详见[接入说明](https://github.com/Raistwen/doc/blob/main/trade-api/futures-%E5%90%88%E7%BA%A6/%E6%8E%A5%E5%85%A5%E8%AF%B4%E6%98%8E.md) |



| 参数         | 填写类型 | 说明                                                         |
| ------------ | -------- | ------------------------------------------------------------ |
| contractName | 必填     | 合约名称，例如：E-BTC-USDT，E表示永续合约。当前可交易列表可以从/contracts接口获取，其中的symbol字段就是这里的参数 |

#### BODY

|参数|	填写类型|	说明|
|--------|--------|--------|

##### 请求示例：

~~~
curl --location --request GET 'http://futures-open-api.bibk8suat.com/fapi/v1/positions?contractName=E-BTC-USDT' \
--header 'X-CH-APIKEY: 06833aff9e695f50edd31137923f79d8' \
--header 'X-CH-TS: 1690172300000' \
--header 'X-CH-SIGN: c94693a01fc3aa452b76ed4e31bc300970b267b5810f04b4f1cb08770a4b994c' \
--header 'Cookie: http_waf_cookie=2bd6d51f-90e2-46dc5b02de9db91545cde6732946763a8e1e'
~~~

##### 加密字符串

~~~
将时间毫秒数+请求方法+path+参数拼接成以下字符串，然后使用HmacSha256进行计算，以E-BTC-USDT举例如下
签名字符串：1690172300000GET/fapi/v1/positions?contractName=E-BTC-USDT
签名结果：c94693a01fc3aa452b76ed4e31bc300970b267b5810f04b4f1cb08770a4b994c
~~~



##### 返回值:

	 [
	    {
	        "symbol": "BTC-USDT",
	        "positionType": 1,
	        "leverage": 50,
	        "positionSide": "BUY",
	        "positionVolume": 10,
	        "canCloseVolume": 10,
	        "openPrice": 30000.00000000,
	        "avgPrice": 30000.00000000,
	        "holdAmount": 300000.000000,
	        "realizedAmount": 0.000000
	    }
	]

