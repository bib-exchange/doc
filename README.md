##BIB交易所提供三类API  

1.交易API：域名是https://open-api.bibvip.com/  ，此API用于下单、撤单、交易等功能；目前只对合作伙伴开放，需要IP加白才能访问；文档见cmcapi目录；  

2.行情API：域名是https://quotation.bibvip.com/ ，此API用于提供给CoinMarketCap、CoinGecko、非小号等三方网站，做币对列表和交易统计信息抓取，对公网开放；文档见trade-api目录；  

例如提供给CoinMarketCap的API：https://quotation.bibvip.com/cmcv3/summary  

3.websocket API：文档见ws-api目录；