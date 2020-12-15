package example.zookeeper.hello;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wansoo.
 * User: accomplishlee
 * Date: 2020/12/15
 * Time: 2:58 오후
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public String test() {
        return "This is Hello Service!!";
    }
}
