### url:www.***.com(例)

## 接口地址:/fapi/v1/index

## 接口说明:(get请求)获取某个币对的深度

Content-Type:application/x-www-form-urlencoded

|参数|	填写类型|	说明|
|--------|--------|--------|
|contractName|	必填| 合约名称，例如：E-BTC-USDT，E表示永续合约。当前可交易列表可以从/contracts接口获取，其中的symbol字段就是这里的参数 |

返回值:

```json
{
    "currentFundRate": -0.0000312131081587,
    "indexPrice": 30516.6100000000000000,
    "tagPrice": 30493.88,
    "nextFundRate": -0.0001750198836678
}
```
