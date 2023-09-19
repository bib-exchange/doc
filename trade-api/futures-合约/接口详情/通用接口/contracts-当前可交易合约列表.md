**/fapi/v1/contracts（当前可交易合约列表查询）**

请求类型：GET

接口权限：读取

### 请求参数

|参数| 数据类型 | 是否必填 | 描述 |
|--------|--------|--------|--------|
||	|	|	|

备注：

此接口不接受任何参数

### 响应参数

| 参数            | 数据类型   | 是否必填 | 描述                                         |
| --------------- | ---------- | -------- | -------------------------------------------- |
| symbol          | String     | 是       | 合约名称                                     |
| pricePrecision  | Integer    | 是       | 价格精度                                     |
| side            | Integer    | 是       | 合约方向(反向：0，1：正向)                   |
| maxMarketVolume | Integer    | 是       | 市价单最大下单数量                           |
| multiplier      | BigDecimal | 是       | 合约面值                                     |
| minOrderVolume  | Integer    | 是       | 最小下单量                                   |
| maxMarketMoney  | BigDecimal | 是       | 市价最大下单金额                             |
| type            | String     | 是       | 合约类型，E:永续合约 W:周 N:次周 M:月 Q:季度 |
| maxLimitVolume  | Integer    | 是       | 限价单最大下单数量                           |
| maxValidOrder   | Integer    | 是       | 最大有效委托的订单数量                       |
| multiplierCoin  | String     | 是       | 合约面值单位                                 |
| minOrderMoney   | BigDecimal | 是       | 最小下单金额                                 |
| maxLimitMoney   | BigDecimal | 是       | 限价最大下单金额                             |
| status          |            | 是       | 合约状态（0：不可交易，1：可交易）           |

### 请求示例

~~~shell
curl -X GET 'http://futures-open-api.bibk8suat.com/fapi/v1/contracts'
~~~

响应示例

```json
[
	{
        "symbol": "E-QTUM-USDT",
        "pricePrecision": 4,
        "side": 1,
        "maxMarketVolume": 3000000,
        "multiplier": 1.0000000000000000,
        "minOrderVolume": 1,
        "maxMarketMoney": 40000000.0000000000000000,
        "type": "E",
        "maxLimitVolume": 3000000,
        "maxValidOrder": 10,
        "multiplierCoin": "QTUM",
        "minOrderMoney": 35.0000000000000000,
        "maxLimitMoney": 40000000.0000000000000000,
        "status": 1
    }
]
```

错误码解释
