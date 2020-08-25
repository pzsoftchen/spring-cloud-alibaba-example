# spring-cloud-alibaba-example

## nacos
- 不同group下的dataId可以相同
- 不同group下的dataId可以通过spring.cloud.nacos.config.extension-configs配置进行聚合复用
- 在spring.cloud.nacos.config.extension-configs[x].data-id 配置是要特别注意由于其需要添加后缀名，因此要求nacos配置时的dataId也需要带有后缀
   - 如 spring.cloud.nacos.config.extension-configs[x].data-id=nacos-mul.properties 则nacos的配置如下图：
   ![](img/nacos-data-id.jpg)
   


