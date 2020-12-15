package example.zookeeper.world;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by wansoo.
 * User: accomplishlee
 * Date: 2020/12/15
 * Time: 3:00 오후
 */

@FeignClient("hello-service")
public interface HelloClient {

    @GetMapping("/hello/test")
    String sayHello();
}
