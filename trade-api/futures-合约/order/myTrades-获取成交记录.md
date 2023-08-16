### url:www.***.com(例)

## 接口地址:/fapi/v1/myTrades

## 接口说明:(get请求)获取成交记录

#### HEADER

| Key          | Value                                          | 填写类型 | 说明                                                         |
| ------------ | ---------------------------------------------- | -------- | ------------------------------------------------------------ |
| Content-Type | Content-Type:application/x-www-form-urlencoded | 必填     |                                                              |
| X-CH-APIKEY  |                                                | 必填     | 密钥                                                         |
| X-CH-TS      |                                                | 必填     | 请求时间戳：毫秒（13位）                                     |
| X-CH-SIGN    |                                                | 必填     | 签名：详见[接入说明](https://github.com/Raistwen/doc/blob/main/trade-api/futures-%E5%90%88%E7%BA%A6/%E6%8E%A5%E5%85%A5%E8%AF%B4%E6%98%8E.md) |

#### 请求参数

|参数| 数据类型 |	填写类型|	说明|
|--------|--------|--------|--------|
|contractName| String | 必填 | 合约名称，例如：E-BTC-USDT，E表示永续合约。当前可交易列表可以从/contracts接口获取，其中的symbol字段就是这里的参数 |
|limit| Integer | 非必填 | 查询条数最大1000条 |

查询示例

~~~shell
curl --request GET 'http://futures-open-api.bibk8suat.com/fapi/v1/myTrades?contractName=E-BTC-USDT&limit=5' \
--header 'X-CH-APIKEY: 06833aff9e695f50edd31137923f79d8' \
--header 'X-CH-TS: 1692155032000' \
--header 'X-CH-SIGN: be2f383fea7047d6d37790a0f757ba649f1d11c92b0e9adfe93d12807ec5be54' \
~~~



响应示例

	[
	    {
	        "amount": 2938.45100000000000000000000000000000,
	        "side": "SELL",
	        "fee": "2.6446059",
	        "isMaker": false,
	        "isBuyer": false,
	        "bidId": "1788255516228355339",
	        "bidUserId": "1681140385316356096",
	        "price": 29384.5100000000000000,
	        "qty": 100,
	        "askId": "1788255516228355350",
	        "contractName": "E-BTC-USDT",
	        "time": "1692068561000",
	        "tradeId": "1691284244248031232",
	        "askUserId": "1678679025342255104"
	    }
	]
