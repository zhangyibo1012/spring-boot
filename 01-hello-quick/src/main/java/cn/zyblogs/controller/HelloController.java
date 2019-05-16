package cn.zyblogs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yibo Zhang
 * @date 2019/05/16
 *
 * @RestController 是 @Controller 和 @ResponseBody 的组合。
 *
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
