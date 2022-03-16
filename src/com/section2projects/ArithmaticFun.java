package com.section2projects;

public class ArithmaticFun {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int result=a+b;
        int difference=a-b;
        int product=a*b;
        int quotient=a/b;
        int remainder=b%a;

        System.out.println("result is "+result);
        System.out.println("diff is "+difference);
        System.out.println("product is "+product);
        System.out.println("quotient is "+quotient);
        System.out.println("remainder is "+remainder);

        result+=20;
        System.out.println("result is now "+result);

        result++;
        System.out.println("result++ is "+result);

        result--;
        System.out.println("result-- is "+result);

        product*=2;
        System.out.println("Product after multiplying by 2 "+ product);

    }
}
