package com.c.ifor.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: cjianping on 2021/1/22 16:19
 */
public class PredicateAddSalaryCondition implements Predicate<User> {
    @Override
    public boolean test(User user) {
        // 公司设置的不调薪名单
        List<String> blackUsers = new ArrayList<>();
        blackUsers.add("001");
        blackUsers.add("007");
        return !blackUsers.contains(user.getName());
    }
}
