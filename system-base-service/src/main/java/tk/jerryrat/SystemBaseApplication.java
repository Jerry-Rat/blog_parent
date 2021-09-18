package tk.jerryrat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: SystemBaseApplication
 * @author: Bing
 * @Description
 * @date: 2021/9/17 15:07
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"tk.jerryrat.mapper"})
public class SystemBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemBaseApplication.class,args);
    }
}
