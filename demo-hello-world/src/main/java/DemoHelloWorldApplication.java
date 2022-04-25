import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * 启动类
 *
 * @author: Zhuyf
 * @version: 2022/4/24
 **/
@EnableAutoConfiguration
public class DemoHelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoHelloWorldApplication.class, args);
    }

}
