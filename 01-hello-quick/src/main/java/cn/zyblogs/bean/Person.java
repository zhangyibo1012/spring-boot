package cn.zyblogs.bean;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Yibo Zhang
 * @date 2019/05/16
 *
 *  将配置文件中配置的属性值映射到 Person 中
 *  @ConfigurationProperties : 告诉 SpringBoot 将本类中的所有属性和配置文件中
 *  相关的配置进行绑定
 *      prefix = "person" 配置文件中哪个下面的所有属性进行一一映射
 *  只有这个组件是容器中的组件 才能使用容器提供的功能
 *
 *  配置文件优先级最高
 *  @ConfigurationProperties 默认从全局配置文件中获取  批量注入 支持校验JSR303
 *  @Value 一个一个绑定  不能解析map
 *
 *  如果在某个业务逻辑中需要获取一下配置文件的值  使用 @Value
 *  如果专门编写一个 JavaBean 来和配置文件进行映射 就直接使用 ConfigurationProperties
 *
 * @PropertySource(value = {classpath:person.properties}) 读取指定的配置文件 value 值 数组
 *
 * @ImportResource 导入 Spring 的配置文件 标注在某个配置类上ImportResource(locations = {classpath:})
 *                  让配置文件里面的内容生效
 *
 *  配置文件可以使用随机数 随机uuid ，占位符获取之前配置的值，如果没有可以使用：
 *                                                          指定默认值 ${person.hello:hello}
 *
 *
 */
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

    @Value("${person.last-name}")
    @Length(max = 100)
    private String lastName;

    @Value("#{2 * 11}")
    private Integer age;

    @Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String , Object> maps;
    private List<Object> lists;
    private Dog dog;
}
