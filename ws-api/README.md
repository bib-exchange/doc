# spot-wsc-open-api

spot-wsc-open-api - 现货-做市商推送服务

### spot-wsc-open-api package:
- config      -- 配置bean
- constant    -- 常量
- dao         -- 持久化  
- entity      -- 实体
- enums       -- 枚举
- exception   -- 自定义业务异常  
- handler     -- 业务处理handler
- mq          -- mq consumer
- service     -- 服务实现
- util        -- 公共服务
- vo          -- 输入、输出对象
- websocket   -- websocket服务端

### 业务说明
1. 推送服务包含消息类型

   | 消息类型 | action    req：请求 sub：订阅 unsub：取消订阅 pong:ping                                |
         |--------------------------------------------|----------|
   | 消息业务类型类型 | ch   
   | 鉴权 | auth       |
   | 下撤单 | orders       |
   | 清算 | trade.clearing |
   | 账户信息变更   | accounts.update |

2. 消息推送方式
- 账户变更  监听MQ accounts_ws_api topic信息，推送给对应用户
- 下撤单    监听MQ orders_ws_api topic信息，推送给对应用户
- 清算成交  监听MQ trade_clearing_ws_api，推送给对应用户

### 数据格式
1.鉴权
```
订阅
{"ch":"auth","action":"req","params":{"accessKey":"7fb28369-d286-473d-b508-d3a6371a29d3","signature":"2b37c556-7c9d-4c7e-bd70-5fc22749d27e","signatureMethod":"MD5","signatureVersion":"2.0","timestamp":"1696931641686"}}
订阅成功后返回
{"code":200,"data":{},"ch":"auth","action":"req"}
```

2.下撤单
```
订阅
{"ch":"orders#bibusdt","action":"req","params":{}}
订阅成功返回
{"code":200,"data":{},"ch":"orders#bibusdt","action":"sub"}
MQ监听到消息推送:
{"symbol":"btc3susdt","accountId":1178987,"orderId":1707365103067987968,"orderPrice":"0.475","orderSize":"3203.1","orderValue":null,"type":"limit","orderStatus":"submitted","orderCreateTime":1695902536538}
```

3.账户变更
```
订阅
{"ch":"accounts.update","action":"sub","params":{}}
订阅成功返回
{"code":200,"data":{},"ch":"accounts.update","action":"sub"}
MQ监听到消息推送:
{"symbol":"bibusdt","accountId":1178987,"accountType":null,"balance":"109092","changeType":null,"changeTime":1695902536538,"seqNum":"7F000001000605A104118EC96872B9DE"}
```

4.订单清算成交
```
订阅
{"ch":"trade.clearing","action":"sub","params":{}}
订阅成功返回
{"code":200,"data":{},"ch":"trade.clearing","action":"sub"}
MQ监听到消息推送:
        订单取消 ：{"symbol":"ethusdt","orderType":"LIMIT","accountId":1178987,"orderId":"1707365103067987968","orderCreateTime":1695902536538,"orderSize":"233.4","orderStatus":"canceled","orderPrice":"1790","orderSide":"BUY","orderValue":"123456"}
        订单成交 ：{"tradeVolume":"1","symbol":"ethusdt","orderType":"LIMIT","aggressor":true,"orderId":1707365103067987968,"orderCreateTime":1695902536538,"orderSize":"237.32","feeCurrency":0.67666,"orderStatus":"filled","orderSide":"BUY","orderValue":"9898777.23","tradeTime":1695902536538,"accountId":19898779,"orderPrice":"3222.34","transactFee":0.90900,"tradePrice":"1782.90","tradeId":1707365103067987968}
```