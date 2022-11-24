package com.hangzhou.design.behavioral.interpreter;

import java.util.Set;

/**
 * 终结符表达式
 * <p>
 * 多少种解析规则就需要定义多少种规则类
 */
public class TerminalExpression extends Expression {
    /**
     * 数据
     */
    Set<String> data;

    /**
     * 定义解析用的符号如  ： -
     */
    String symbol;

    public TerminalExpression(Set<String> data, String symbol) {
        this.data = data;
        this.symbol = symbol;
    }

    @Override
    boolean interpret(String expression) {
        //上海市：张文宏-医生
        //1、先按照指定符号分割
        String[] split = expression.split(symbol);

        // 冒号：  上海市              张文宏-医生
        // 短横线  上海市：张文宏       医生
        boolean result = false;
        for (String s : split) {
            if (data.contains(s)) {
                return true;
            }
        }
        // 不在免费行列
        return false;
    }
}
