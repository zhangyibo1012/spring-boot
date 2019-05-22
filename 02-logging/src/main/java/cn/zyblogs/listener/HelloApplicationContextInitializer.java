package cn.zyblogs.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Yibo Zhang
 * @date 2019/05/22
 *
 * 监听 IOC 容器
 */
public class HelloApplicationContextInitializer  implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("HelloApplicationContextInitializer.initialize...");
    }
}
