package com.c.ifor.function;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cjianping on 2021/1/22 17:07
 */
public class M {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("00" + i);
            user.setRuSiYear(2 + i);
            user.setSalary(i * 1000);
            users.add(user);
        }
        users.forEach(user -> {
            System.out.println(user.getName() + " - " + user.getRuSiYear() + " - " + user.getSalary());
            CaiWu.addSalary(user);
            System.out.println(user.getName() + " - " + user.getRuSiYear() + " - " + user.getSalary());
            System.out.println("----------------------------------------------------");
        });
    }

}
