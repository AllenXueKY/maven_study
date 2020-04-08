package com.allen.test;

import com.allen.dao.ItemsDao;


import com.allen.domain.Items;
import com.allen.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById(){
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需的dao代理对象
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items.getName());
    }

    @Test
    public void findById1() {
        //获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中拿到所需的dao代理对象
        ItemsService itemsService = (ItemsService) ac.getBean("itemsService");
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
