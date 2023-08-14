### url:www.***.com(例)

## 接口地址:/fapi/v1/selfTrade

## 接口说明:(post请求)自成交画k线

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
|price| BigDecimal | 必填 | 成交价格 |
|volume| BigDecimal | 必填 | 成交量 |


返回值:

```json
{
	"buy": 0,
	"sell": 0,
	"order_id": 0
}
```
