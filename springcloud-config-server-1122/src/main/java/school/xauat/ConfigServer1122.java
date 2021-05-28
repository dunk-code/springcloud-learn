package school.xauat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：zsy
 * @date ：Created 2021/5/27 23:37
 * @description：ConfigServer启动类
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer1122 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer1122.class, args);
    }
}
