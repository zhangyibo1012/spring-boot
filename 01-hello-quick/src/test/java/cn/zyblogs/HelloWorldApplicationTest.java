package cn.zyblogs;

import cn.zyblogs.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Yibo Zhang
 * @date 2019/05/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTest {

    @Autowired
    Person person;

    @Test
    public void main() {
        System.out.println(person);
    }
}