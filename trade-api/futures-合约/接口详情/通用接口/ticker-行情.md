**/fapi/v1/ticker（当前可交易合约列表查询）**

请求类型：GET

接口权限：读取

### 请求参数

|参数| 数据类型 | 是否必填 | 描述 |
|--------|--------|--------|--------|
|contractName| String | 是 | 参考[可交易合约列表](https://github.com/bib-exchange/doc/blob/waynee-refact/trade-api/futures-%E5%90%88%E7%BA%A6/%E6%8E%A5%E5%8F%A3%E8%AF%A6%E6%83%85/%E9%80%9A%E7%94%A8%E6%8E%A5%E5%8F%A3/contracts-%E5%BD%93%E5%89%8D%E5%8F%AF%E4%BA%A4%E6%98%93%E5%90%88%E7%BA%A6%E5%88%97%E8%A1%A8.md) |

备注：

此接口不接受任何参数

### 响应参数

| 参数 | 数据类型   | 是否必填 | 描述         |
| ---- | ---------- | -------- | ------------ |
| high | BigDecimal | 是       | 最高价       |
| low  | BigDecimal | 是       | 最低价       |
| last | BigDecimal | 是       | 收盘         |
| vol  | BigDecimal | 是       | 成交量（张） |
| buy  | BigDecimal | 是       | 买一价       |
| sell | BigDecimal | 是       | 卖一价       |
| rose | BigDecimal | 是       | 涨跌幅       |
| time | TimeStamp  | 是       | 时间戳       |

### 请求示例

~~~shell
curl -X GET 'https://futures-open-api.bibk8suat.com/fapi/v1/ticker?contractName=E-BTC-USDT'
~~~

响应示例

```json
{
	"high": 28382.35,
	"vol": 7418638,
	"last": 26398.05,
	"low": 26340.68,
	"buy": 26397.81,
	"sell": 26398.46,
	"rose": -0.0009,
	"time": "1692858473589"
}
```

### 错误码解释
