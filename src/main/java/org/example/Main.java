package org.example;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(mathFunction(1,2,3));
        System.out.println(mathFunction(3,1,2));
        System.out.println(mathFunction(3,1,3));
        System.out.println(mathFunction(3,0,3));
    }
    /*
    Write a function that takes three Integer numbers Number1, Number2, and Number3, and
    determines if there is a mathematical operation that will make Number1 (operation) Number2
    equal to Number3. If one or more of the 4 common mathematical operations (+,-,*,/) can
    complete the function, return the String representation of the mathematical function. If none of
    the 4 mathematical operations can make the statement true, return the String "None".
    */
    public static String mathFunction(Integer Number1, Integer Number2, Integer Number3) {
        List<String> expressions = new ArrayList<>();

        if (Number1 + Number2 == Number3) {
            expressions.add("+");
        }

        if (Number1 - Number2 == Number3) {
            expressions.add("-");
        }

        if (Number1*Number2 == Number3) {
            expressions.add("*");
        }

        if (Number2 != 0 && Number1/Number2 == Number3) {
            expressions.add("/");
        }

        if (expressions.isEmpty()) {
            return "None";
        }

        return String.join("", expressions); // Return the stack content as a String
    }
}