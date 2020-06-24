package org.gec.test;

import org.gec.entity.User;

public class Testuesr {
    public static void main(String[] args) {
       User user = new User();
       user.setName("小白");
       user.setPassword("123456");
       user.say();

    }
}
