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

返回值:

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
	
