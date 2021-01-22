package com.c.ifor.function;

import java.util.function.Function;

/**
 * @author: cjianping on 2021/1/22 16:29
 */
public class FunctionOfAddSalaryStrategy implements Function<User, Double> {
    /**
     * 满足调薪的条件
     */
    private final PredicateAddSalaryCondition predicateAddSalaryCondition = new PredicateAddSalaryCondition();

    private final int RUSIYEAR_01 = 5;
    private final int RUSIYEAR_02 = 10;

    @Override
    public Double apply(User user) {
        if (predicateAddSalaryCondition.test(user)) {
            if (user.getRuSiYear() <= RUSIYEAR_01) {
                return 0.1;
            } else if (user.getRuSiYear() <= RUSIYEAR_02) {
                return 0.2;
            } else {
                return 0.3;
            }
        } else {
            return 0.0;
        }
    }
}
