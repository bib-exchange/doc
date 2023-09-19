**/fapi/v1/depth（当前可交易合约列表查询）**

请求类型：GET

接口权限：读取

### 请求参数

|参数| 数据类型 | 是否必填 | 描述 |
|--------|--------|--------|--------|
|contractName| String | 是 | 参考[可交易合约列表](https://github.com/bib-exchange/doc/blob/waynee-refact/trade-api/futures-%E5%90%88%E7%BA%A6/%E6%8E%A5%E5%8F%A3%E8%AF%A6%E6%83%85/%E9%80%9A%E7%94%A8%E6%8E%A5%E5%8F%A3/contracts-%E5%BD%93%E5%89%8D%E5%8F%AF%E4%BA%A4%E6%98%93%E5%90%88%E7%BA%A6%E5%88%97%E8%A1%A8.md) |

备注：

此接口不接受任何参数

### 响应参数

| 参数 | 数据类型 | 是否必填 | 描述     |
| ---- | -------- | -------- | -------- |
| asks | List     | 是       | 卖盘深度 |
| bids | List     | 是       | 买盘深度 |
| time | DateTime | 否       | 时间     |

### 请求示例

~~~shell
curl -X GET 'https://futures-open-api.bibk8suat.com/fapi/v1/depth?contractName=E-BTC-USDT'
~~~

响应示例

```json
{
	”asks“: [
		[26385.53, 641.0],
		[26385.86, 26493.0],
		[28656.63, 341.0]
	],
	“bids”: [
		[26384.95, 1488.0],
		[26384.39, 177.0],
		[26378.66, 235.0]
	],
	”time“: None
}
```

### 错误码解释
