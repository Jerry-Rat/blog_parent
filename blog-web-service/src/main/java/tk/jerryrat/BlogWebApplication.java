package tk.jerryrat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: BlogWebApplication
 * @author: Bing
 * @Description
 * @date: 2021/9/17 15:05
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients
public class BlogWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogWebApplication.class,args);
    }
}
