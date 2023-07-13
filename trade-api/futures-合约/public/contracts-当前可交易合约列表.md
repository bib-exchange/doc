### url:www.***.com(例)

## 接口地址:/fapi/v1/index

## 接口说明:(get请求)获取某个币对的深度

Content-Type:application/x-www-form-urlencoded

|参数|	填写类型|	说明|
|--------|--------|--------|

返回值:

```json
[
	{
        "symbol": "E-BTC-USDT",
        "pricePrecision": 4,
        "side": 1,
        "maxMarketVolume": 000,
        "multiplier": 0.00010000000,
        "minOrderVolume": 1,
        "maxMarketMoney": 000,
        "type": "E",
        "maxLimitVolume": 3000000,
        "maxValidOrder": 10,
        "multiplierCoin": "BTC",
        "minOrderMoney": 000,
        "maxLimitMoney": 000,
        "status": 1
    }
]
```
