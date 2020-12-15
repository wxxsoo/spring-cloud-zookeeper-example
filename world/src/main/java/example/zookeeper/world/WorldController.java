package example.zookeeper.world;

import lombok.RequiredArgsConstructor;
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
 * Time: 3:12 오후
 */
@RestController
@RequestMapping("/world")
@RequiredArgsConstructor
public class WorldController {
    private final HelloClient helloClient;

    @GetMapping("/test")
    public String test() {
        return helloClient.sayHello();
    }

}
