package com.c.ifor.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consume
 * 作用: 消费某个对象
 */

/**
 * @author: cjianping on 2021/1/22 15:22
 */
public class TConsumer {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new User("" + i, i));
        }
        list.forEach(
                user -> user.growUp(i -> {
                    i.age++;
                }));
    }

    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void growUp(Consumer<User> consumer) {
            if ("2".equals(name)) {
                System.out.println("2不允许长大");
            } else {
                System.out.println(name + "开始长大");
                consumer.accept(this);
            }
        }
    }

}
