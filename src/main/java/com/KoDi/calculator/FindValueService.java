package com.KoDi.calculator;

public class FindValueService {

    public String plus(Integer num1, Integer num2) {
        if (isThereAnythingNums(num1, num2)) {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        } else {
            return "Вы не ввели все данные!";
        }
    }

    public String minus(Integer num1,Integer num2) {
        if (isThereAnythingNums(num1, num2)) {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        } else {
            return "Вы не ввели все данные!";
        }
    }

    public String multiply(Integer num1,Integer num2) {
        if (isThereAnythingNums(num1, num2)) {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        } else {
            return "Вы не ввели все данные!";
        }
    }

    public String divide(Integer num1,Integer num2) {
        if (isThereAnythingNums(num1, num2)) {
            if (num2 != 0) {
                return num1 + " / " + num2 + " = " + ((float)num1 / (float) num2);
            } else {
                return "На ноль делить нельзя!";
            }
        } else {
            return "Вы не ввели все данные!";
        }
    }

    private boolean isThereAnythingNums(Integer num1, Integer num2) {
        return num1 != null & num2 != null;
    }
}
