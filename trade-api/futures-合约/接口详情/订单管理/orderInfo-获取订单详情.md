**/fapi/v1/orderInfo（获取订单详情）**

请求类型：GET

接口权限：读取

### 请求参数

|参数| 数据类型 | 是否必填 | 描述 |
|--------|--------|--------|--------|
| contractName | String | 是 | 合约名称 |
| orderId | Long | 是 | 订单ID |

### 响应参数

| 参数         | 数据类型   | 是否必填 | 描述            |
| ------------ | ---------- | -------- | --------------- |
| code         | Integer    | 是       | 响应码：0：成功 |
| msg          | String     | 是       | 计价币种        |
| <data>       |            | 是       |                 |
| side         | String     | 是       | 方向            |
| executedQty  | Integer    | 是       | 成交数量        |
| orderId      | Integer    | 是       | 订单ID          |
| price        | BigDecimal | 是       | 挂单价格        |
| origQty      | Integer    | 是       | 挂单数量        |
| avgPrice     | BigDecimal | 是       | 成交均价        |
| transactTime | Long       | 是       | 成交时间        |
| action       | String     | 是       | 开平仓          |
| contractName | String     | 是       | 合约名称        |
| type         | String     | 是       | 订单类型        |
| timeInForce  | String     | 是       | 撮合策略        |
| status       | String     | 是       | 订单状态        |
| </data>      |            |          |                 |
|              |            |          |                 |

### 请求示例

~~~shell
curl -X GET -H 'X-CH-APIKEY: ' -H 'X-CH-SIGN: ' -H 'X-CH-TS: ' 'https://futures-open-api.bibk8suat.com/fapi/v1/account?contractName="E-BTC-USDT"'
~~~

响应示例

```json
{
	"code": "0",
	"msg": "成功",
	"data": {
		"side": "BUY",
		"executedQty": 200,
		"orderId": "1758259102872786927",
		"price": 29700.0,
		"origQty": 200.0,
		"avgPrice": 29700.0,
		"transactTime": "1690187300000",
		"action": "OPEN",
		"contractName": "E-BTC-USDT",
		"type": "LIMIT",
		"timeInForce": "",
		"status": "FILLED"
	}
}
```

### 错误码解释
