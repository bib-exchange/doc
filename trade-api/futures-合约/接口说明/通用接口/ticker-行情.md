### url:www.***.com(例)

## 接口地址:/fapi/v1/ticker

## 接口说明:(get请求)获取某个币对的深度

Content-Type:application/x-www-form-urlencoded

|参数|	填写类型|	说明|
|--------|--------|--------|
|contractName|	必填| 合约名称，例如：E-BTC-USDT，E表示永续合约。当前可交易列表可以从/contracts接口获取，其中的symbol字段就是这里的参数 |

返回值:

```json
{
    "high": 30524.5,
    "vol": 27548939,
    "last": 30492.67,
    "low": 30197.6,
    "buy": 30492.71,
    "sell": 30492.83,
    "rose": -0.0008,
    "time": "1689239692788"
}
```
