比较简单的几个配置是可以直接放到application.properties中的。(AppConfig)

Attention:
1. 没有set函数也可以加载配置内容
2. 配置项不能缺失，否则整个程序不能启动，即使有默认值也不行
3. 只能是String类型的配置,不支持List和Map类型的配置
