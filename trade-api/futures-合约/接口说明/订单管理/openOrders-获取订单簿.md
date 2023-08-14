### url:www.***.com(例)

## 接口地址:/fapi/v1/openOrders

## 接口说明:(get请求)获取订单簿

#### HEADER

| Key          | Value                                          | 填写类型 | 说明                                                         |
| ------------ | ---------------------------------------------- | -------- | ------------------------------------------------------------ |
| Content-Type | Content-Type:application/x-www-form-urlencoded | 必填     |                                                              |
| X-CH-APIKEY  |                                                | 必填     | 密钥                                                         |
| X-CH-TS      |                                                | 必填     | 请求时间戳：毫秒（13位）                                     |
| X-CH-SIGN    |                                                | 必填     | 签名：详见[接入说明](https://github.com/Raistwen/doc/blob/main/trade-api/futures-%E5%90%88%E7%BA%A6/%E6%8E%A5%E5%85%A5%E8%AF%B4%E6%98%8E.md) |

|参数| 数据类型 |	填写类型|	说明|
|--------|--------|--------|--------|
|contractName| String | 必填 | 合约名称，例如：E-BTC-USDT，E表示永续合约。当前可交易列表可以从/contracts接口获取，其中的symbol字段就是这里的参数 |



返回值:

```json
[
    {
		"orderId": 123,
		"contractName": ”E-BTC-USDT“,
        "price": 30000.000000,
        "origQty": 10,
        "executedQty": 8,
        "avgPrice": 30000.0000,
        "status": 3,
        "type": 1,
        "timeInForce": 5,
        "side": "BUY",
        "action": "OPEN"
	}
]

```
