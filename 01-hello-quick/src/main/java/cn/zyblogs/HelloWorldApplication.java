package cn.zyblogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yibo Zhang
 * @date 2019/05/16
 *
 * @SpringBootApplication : 标注在某个类上就说明这个类是 SpringBoot 主配置类，Spring Boot
 *                          就应该运行这个类的 main 方法来启动 SpringBoot 应用。
 *
 * @SpringBootConfiguration : Spring Boot 的配置类，标注在某个类上，表示这是一个 Spring
 *                            Boot 的配置类。它使用的注解是 Spring 的 @Configuration ，
 *                            配置类---配置文件 ，配置类也是容器中的一个组件。
 *
 * @EnableAutoConfiguration ：开启自动配置功能。
 * @AutoConfigurationPackage : 自动配置包。使用
 *                              @Import(AutoConfigurationPackages.Registrar.class) 完成功能。
 *                              register(registry, new PackageImport(metadata).
 *                              getPackageName());
 *                              将主配置类 @SpringBootApplication 标注的类 的所在包以及下面的
 *                              所有子包里面的所有组件 扫描到 Spring 容器。
 *
 * @Import ：Spring 底层注解 ，给容器导入一个组件，导入组件由 class 参数决定。
 *
 * @Import(AutoConfigurationImportSelector.class) ：开启自动配置类的导包选择器，导入哪些组件的
 *                                                  选择器。
 *                                                  将所有需要导入的组件以全类名方式返回 ，这些
 *                                                  组件就会被添加到容器中。会给容器中导入非
 *                                                  常多的自动配置类(xxxAutoConfiguration)，就
 *                                                  是给容器中导入这个场景所有组件并配置。
 *                                                  有了自动配置类，就不需要手动编写配置注入
 *                                                  功能组件。
 *   从类路径下的 META-INF/spring.factories 中获取 EnableAutoConfiguration
 * 指定的值。将这些值作为自动配置类导入到容器中，自动配置类就生效了，帮我们
 * 进行自动配置工作。J2EE 的整合和自动配置都在
 * spring-boot-autoconfigure-2.1.4.RELEASE.jar 下。
 *
 *
 */
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class , args);
    }
}
