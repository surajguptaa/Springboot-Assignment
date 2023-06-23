package com.userManage.userManagementSystem.configuration;


import com.userManage.userManagementSystem.model.Type;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
   public  List<User> getInitializedList()
    {
        User initUser = new User(0, "sraj", "sraj@gmail.com", "abcd", "9852689653", 1997-02-05, "sultanpur", Type.ADMIN)
        List<User> initList = new ArrayList<>();
        initList.addAll(initUser);

    }

}
