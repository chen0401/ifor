package com.c.ifor.function;

/**
 * @author: cjianping on 2021/1/22 16:28
 */
public class CaiWu {
    // 调薪策略
    static FunctionOfAddSalaryStrategy functionOfAddSalaryStrategy = new FunctionOfAddSalaryStrategy();

    public static void addSalary(User user) {
        double stage = functionOfAddSalaryStrategy.apply(user);
        user.setSalary(user.getSalary() * (1 + stage));
    }
}
