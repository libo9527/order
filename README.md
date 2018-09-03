# Eureka服务发现
## 服务间通信
### RestTemplate
#### 自定义负载均衡策略
> [](http://cloud.spring.io/spring-cloud-static/Finchley.M2/#_customizing_default_for_all_ribbon_clients)
![](https://i.loli.net/2018/09/03/5b8d2fe458ec5.jpg)
### Feign
1. 添加依赖
    ```xml
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-feign</artifactId>
    </dependency>
    ```
2. 启动类上添加注解`@EnableFeignClients`
3. 配置接口
    ```java
    @FeignClient(name = "product")
    public interface ProductClient {
        
        @GetMapping("/msg")
        String productMsg();
    }
    ```
4. 调用
    ```java
    public class ClientController {
        @Autowired
        ProductClient productClient;
    
        @GetMapping("/getProductMsg")
        public String getProductMsg() {
            
            return productClient.productMsg();
         }
      }
    ```