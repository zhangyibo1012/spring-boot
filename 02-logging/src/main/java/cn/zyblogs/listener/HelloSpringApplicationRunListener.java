package cn.zyblogs.listener;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author Yibo Zhang
 * @date 2019/05/22
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

    /**
     *  容器开始
     */
    @Override
    public void starting() {
        System.out.println("HelloSpringApplicationRunListener.starting");
    }

    /**
     *  环境准备完成
     * @param environment
     */
    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        Object o = environment.getSystemProperties().get("os.name");

        System.out.println("HelloSpringApplicationRunListener.environmentPrepared" + o);
    }

    /**
     *  ioc 容器准备好
     * @param context
     */
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener.contextPrepared");
    }

    /**
     * 容器加载完成
     * @param context
     */
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("HelloSpringApplicationRunListener.contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    /**
     *  容器创建完成
     * @param context
     * @param exception
     */
    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("HelloSpringApplicationRunListener.failed");
    }
}
