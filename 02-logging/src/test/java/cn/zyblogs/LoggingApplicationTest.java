package cn.zyblogs;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Yibo Zhang
 * @date 2019/05/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggingApplicationTest {

    @Test
    public void main() {

        /**
         *  由底到高  trace < debug < info < warn < error
         *  可以调整输出的日志级别 日志就只会在这个级别以及大于这个级别生效
         */
        log.trace("这是 trace 日志...");
        log.debug("这是 debug 日志...");
//        SpringBoot 默认使用的是 Info 级别  没有指定级别就使用默认级别， root 级别。
        log.info("这是 info 日志...");
        log.warn("这是 warn 日志...");
        log.error("这是 error 日志...");
    }
}