package cn.coderap.springframework.test;

import cn.coderap.springframework.BeanDefinition;
import cn.coderap.springframework.BeanFactory;
import cn.coderap.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        //1、初始化BeanFactory容器
        BeanFactory beanFactory = new BeanFactory();

        //2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("UserService", beanDefinition);

        //3、获取bean
        UserService userService = (UserService)beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }
}
