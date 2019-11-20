可以将一类的配置文件存放在单独的properties文件中。
这个properties文件可以存放在包里(InConfig)，也可以存放在包外的config文件夹中(OutConfig)。

Attention:
1. 配置文件不能缺失，否则服务不能启动。
2. 配置文件名大小写不敏感。(InConfig)
3. 配置项可以缺失，没有默认值的情况下，该配置内容为null。(InConfig.InConfigK3)
4. 配置项一定要有set方法，否则配置内容不能装载进去。(InConfig.InConfigK2)
5. 不同配置文件中的配置项不能重名,否则配置内容会混乱(InConfig.OutConfigK1)
6. 支持加载List类型的配置文件(ListConfig)
7. 支持加载Map类型的配置文件(MapConfig),需要lombok-@RequiredArgsConstructor的支持(MapConfig)

还有一种场景是用程序自己处理配置.这个有个好处是当配置文件缺失的时候，程序启动不受影响(SelfOutConfig)。还有当有些bean不是依赖spring启动的时候，也需要用到这种方式读取配置