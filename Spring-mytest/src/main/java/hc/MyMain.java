package hc;

import hc.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }
}
