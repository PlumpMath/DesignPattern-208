package com.zqp2sh.designpattern.简单工厂模式.version1;

/**
 * 作者 @sh2zqp
 * 时间 @2016年11月08日 20:40
 */
// 运算类
public class Operation {
    public static double computer(double number1, double number2, String operation) throws Exception {
        double result = 0.0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
               result = -1;
                throw new Exception("不合法的操作符");
        }
        return result;
    }
}
