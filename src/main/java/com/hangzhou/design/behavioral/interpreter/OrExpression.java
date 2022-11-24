package com.hangzhou.design.behavioral.interpreter;

/**
 * 非终结表达式
 */
public class OrExpression extends Expression {

    // 组合两个终结表达式。最终的判断结果是终结表达式判断出来的，这个表达式只是一个桥梁
    private Expression cityExp;
    private Expression typeExp;

    public OrExpression(Expression cityExp, Expression typeExp) {
        this.cityExp = cityExp;
        this.typeExp = typeExp;
    }

    @Override
    boolean interpret(String expression) {

        // 定义所有终结表达式的合并逻辑
        return cityExp.interpret(expression) || typeExp.interpret(expression);
    }
}
