### url:www.***.com(例)

## 接口地址:/fapi/v1/batchRobot

## 接口说明:(post请求)批量机器人

#### HEADER

| Key          | Value                          | 填写类型 | 说明                                                         |
| ------------ | ------------------------------ | -------- | ------------------------------------------------------------ |
| Content-Type | application/json;charset=utf-8 | 必填     |                                                              |
| X-CH-APIKEY  |                                | 必填     | 密钥                                                         |
| X-CH-TS      |                                | 必填     | 请求时间戳：毫秒（13位）                                     |
| X-CH-SIGN    |                                | 必填     | 签名：详见[接入说明](https://github.com/Raistwen/doc/blob/main/trade-api/futures-%E5%90%88%E7%BA%A6/%E6%8E%A5%E5%85%A5%E8%AF%B4%E6%98%8E.md) |

#### BODY

|参数| 数据类型 |	填写类型|	说明|
|--------|--------|--------|--------|
|contractName| String | 必填 | 合约名称，例如：E-BTC-USDT，E表示永续合约。当前可交易列表可以从/contracts接口获取，其中的symbol字段就是这里的参数 |
|orders| List<OpenOrderParam> | 选填 | 批量下单列表 |
|orderIds| List<Long> | 选填 | 批量撤单列表 |

##### OpenOrderParam

| 参数          | 数据类型   | 填写类型 | 说明                                                         |
| ------------- | ---------- | -------- | ------------------------------------------------------------ |
| clientOrderId | String     | 选填     | 客户端下单标识ID,小于32的字符串                              |
| contractName  | String     | 必填     | 合约名称，例如：E-BTC-USDT，E表示永续合约。当前可交易列表可以从/contracts接口获取，其中的symbol字段就是这里的参数 |
| open          | String     | 必填     | 做市商固定"OPEN"                                             |
| positionType  | Integer    | 必填     | 持仓类型(1 全仓，2 仓逐)                                     |
| price         | BigDecimal | 必填     | 下单价格                                                     |
| side          | String     | 必填     | 买卖方向：买单：“BUY”，卖单：“SELL”                          |
| timeInForce   | String     | 必填     | 委托有效期：普通市价单：”MARKET“，限价单：”LIMIT“，只铺单：”POST_ONLY“，”IOC“，”FOK“ |
| volume        | BigDecimal | 必须     | 委托数量，单位：张                                           |

##### 请求参数BODY举例

~~~json
{
	"contractName": "E-BTC-USDT",
	"orderIds": [1743618606841780157],
	"orders": [{
		"clientOrderId": "1679750388189806593",
		"contractName": "E-BTC-USDT",
		"open": "OPEN",
		"positionType": 1,
		"price": 31288.79,
		"side": "BUY",
		"timeInForce": "POST_ONLY",
		"type": "LIMIT",
		"volume": 1520
	}]
}
~~~

##### 请求示例：

~~~
curl --location --request POST 'http://futures-open-api.bibk8suat.com/fapi/v1/batchRobot' \
--header 'X-CH-APIKEY: 06833aff9e695f50edd31137923f79d8' \
--header 'X-CH-TS: 1690187300000' \
--header 'X-CH-SIGN: 7acda88bea9107253a5f406bbd966ac7da9dd95cabc645991b775e3578341286' \
--header 'Content-Type: application/json' \
--data-raw '{"contractName":"E-BTC-USDT","orders":[{"clientOrderId":"waynee","contractName":"E-BTC-USDT","open":"OPEN","positionType":1,"price":29700.00,"side":"BUY","type":"LIMIT","volume":200}]}'
~~~

##### 加密字符串

~~~
将时间毫秒数+请求方法+path+参数拼接成以下字符串，然后使用HmacSha256进行计算，以E-BTC-USDT举例如下
签名字符串：1690187300000POST/fapi/v1/batchRobot{"contractName":"E-BTC-USDT","orders":[{"clientOrderId":"waynee","contractName":"E-BTC-USDT","open":"OPEN","positionType":1,"price":29700.00,"side":"BUY","type":"LIMIT","volume":200}]}
签名结果：7acda88bea9107253a5f406bbd966ac7da9dd95cabc645991b775e3578341286
~~~

##### 返回值:

```json
{
	"ids": ["111"],
	"cancelIds": ["222"]
}
```
