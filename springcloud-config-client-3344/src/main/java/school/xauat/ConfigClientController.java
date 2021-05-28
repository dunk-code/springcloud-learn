package school.xauat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zsy
 * @date ：Created 2021/5/28 0:33
 * @description：服务接口
 */
@RestController
public class ConfigClientController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;
    @RequestMapping("/config")
    public String getConfig(){
        return "applicationNmae：" + applicationName
                +"\teurekaServer："+eurekaServer
                +"\tport"+ port;
    }
}
