**/fapi/v1/account（当前可交易合约列表查询）**

请求类型：GET

接口权限：读取

### 请求参数

|参数| 数据类型 | 是否必填 | 描述 |
|--------|--------|--------|--------|
|      |          |          |      |

备注：

此接口不接受任何参数

### 响应参数

| 参数                | 数据类型   | 是否必填 | 描述           |
| ------------------- | ---------- | -------- | -------------- |
| <account>           |            |          |                |
| marginCoin          | String     | 是       | 计价币种       |
| accountNormal       | BigDecimal | 是       | 账户余额       |
| accountLock         | BigDecimal | 是       | 冻结保证金     |
| partPositionNormal  | BigDecimal | 是       | 逐仓保证金余额 |
| totalPositionNormal | BigDecimal |          | 全仓保证金余额 |

### 请求示例

~~~shell
curl -X GET -H 'X-CH-APIKEY: ' -H 'X-CH-SIGN: ' -H 'X-CH-TS: ' 'https://futures-open-api.bibk8suat.com/fapi/v1/account'
~~~

响应示例

```json
{
	"account": [{
		"marginCoin": "USDT",
		"accountNormal": 3630.7585977883305,
		"accountLock": 8.088,
		"partPositionNormal": 0.0,
		"totalPositionNormal": 15.8640284,
		"achievedAmount": 0.0,
		"unrealizedAmount": -0.1121,
		"totalMarginRate": 4.577206250826341,
		"totalEquity": 3630.6464977883306,
		"partEquity": 0.0,
		"totalCost": 15.9761284,
		"sumMarginRate": 4.587402904281652,
		"openRealizedAmount": 42.7591476,
		"totalKeepMarginNormal": 3.89838068,
		"positionVos": [{
			"contractId": "1600404030819643392",
			"contractName": "E-BTC-USDT",
			"contractSymbol": "BTC-USDT",
			"positions": [{
				"id": "1692798474830901248",
				"uid": "1678679025342255104",
				"contractId": "1600404030819643392",
				"positionType": 1,
				"side": "BUY",
				"volume": 19.0,
				"openPrice": 25804.33,
				"avgPrice": 26478.08,
				"closePrice": 0.0,
				"leverageLevel": 50,
				"openAmount": 9.8056454,
				"holdAmount": 10.0594284,
				"closeVolume": 0.0,
				"pendingCloseVolume": 0.0,
				"realizedAmount": 0.0,
				"historyRealizedAmount": 12.14391295079628,
				"tradeFee": -0.441254043,
				"capitalFee": -0.21608300620372,
				"closeProfit": 0.0,
				"shareAmount": 0.0,
				"freezeLock": 0,
				"status": 1,
				"ctime": 1692429581000,
				"mtime": 1692859697000,
				"brokerId": 1000,
				"lockTime": 1692429581000,
				"traderId": "0",
				"orderType": 0,
				"isShare": 0,
				"shareTraderAmount": 0.0,
				"traderPositionId": "0",
				"userType": 2,
				"totalOpenPrice": 25804.33,
				"contractType": 1,
				"marginRate": 4.574827920490019,
				"reducePrice": -165250.06509731,
				"returnRate": 1.294065763381572,
				"unRealizedAmount": -0.1121,
				"openRealizedAmount": 12.68915,
				"positionBalance": 502.97142,
				"settleProfit": 12.80125,
				"indexPrice": 26472.18,
				"keepRate": 0.004,
				"maxFeeRate": 0.0009
			}],
			"contractOtherName": "BTCUSDT"
		}]
}
```

### 错误码解释
