package com.wzl.jspmvc;

import java.math.BigDecimal;

public class CalculatorBean {

    private double firstNum;
    private double secondNum;
    private char operation = '+';
    private double result;

    public  void calculate(){
        System.out.println("firstNum:"+firstNum);
        System.out.println("operation:"+operation);
        System.out.println("secondNum:"+secondNum);

        switch (operation){
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if(secondNum == 0){
                    throw new ArithmeticException("除数不能为0");
                }
                result = firstNum / secondNum;
                result = new BigDecimal(result).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
                break;
            default:
                throw new RuntimeException("对不起,你传入的参数非法");
        }
        System.out.println("result:"+result);
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getSecondNum() {

        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
}
