### url:www.***.com(例)

## 接口地址:/api/account

## 接口说明:(post请求)资产

#### HEADER

| Key          | Value                          | 填写类型 | 说明                                                         |
| ------------ | ------------------------------ | -------- | ------------------------------------------------------------ |
| Content-Type | application/json;charset=utf-8 | 必填     |                                                              |
| X-CH-APIKEY  |                                | 必填     | 密钥                                                         |
| X-CH-TS      |                                | 必填     | 请求时间戳：毫秒（13位）                                     |
| X-CH-SIGN    |                                | 必填     | 签名：详见[接入说明](https://github.com/Raistwen/doc/blob/main/trade-api/futures-%E5%90%88%E7%BA%A6/%E6%8E%A5%E5%85%A5%E8%AF%B4%E6%98%8E.md) |

#### BODY

|参数|	填写类型|	说明|
|--------|--------|--------|

返回值:

	{
	    "account": [
	        {
	            "marginCoin": "USDT",
	            "accountNormal": 500000.0000000000000000,
	            "accountLock": 0E-16,
	            "partPositionNormal": 0E-16,
	            "totalPositionNormal": 0,
	            "achievedAmount": 0,
	            "unrealizedAmount": 0,
	            "totalMarginRate": 0,
	            "totalEquity": 500000.0000000000000000,
	            "partEquity": 0E-16,
	            "totalCost": 0,
	            "sumMarginRate": 0,
	            "openRealizedAmount": 0,
	            "totalKeepMarginNormal": 0,
	            "positionVos": [],
	            "totalHisRealizeAmount": null,
	            "accountAmount": null,
	            "totalShareAmount": null
	        },
	        {
	            "marginCoin": "EXUSDT",
	            "accountNormal": 0,
	            "accountLock": 0,
	            "partPositionNormal": 0,
	            "totalPositionNormal": 0,
	            "achievedAmount": 0,
	            "unrealizedAmount": 0,
	            "totalMarginRate": 0,
	            "totalEquity": 0,
	            "partEquity": 0,
	            "totalCost": 0,
	            "sumMarginRate": 0,
	            "openRealizedAmount": 0,
	            "totalKeepMarginNormal": 0,
	            "positionVos": [],
	            "totalHisRealizeAmount": null,
	            "accountAmount": null,
	            "totalShareAmount": null
	        }
	    ]
	}
