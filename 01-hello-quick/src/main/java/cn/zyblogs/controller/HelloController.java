package cn.zyblogs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yibo Zhang
 * @date 2019/05/16
 *
 * @RestController 是 @Controller 和 @ResponseBody 的组合。
 *
 */
@Slf4j
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
