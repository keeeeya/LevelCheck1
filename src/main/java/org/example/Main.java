package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("1番目の数字を入力してください");
    int firstNumber = scanner.nextInt();
    System.out.println("演算子を入力してください(+,-,*,/)");
    String operator = scanner.next();
    System.out.println("2番目の数字を入力してください");
    int secondNumber = scanner.nextInt();

    int plus = firstNumber + secondNumber;
    int minus = firstNumber - secondNumber;
    int multiply = firstNumber * secondNumber;
    double divide = (double) firstNumber / secondNumber;
    if (operator.equals("+")) {
      System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + plus);
    } else if (operator.equals("-")) {
      System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + minus);
    } else if (operator.equals("*")) {
      System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + multiply);
    } else if (operator.equals("/") && secondNumber == 0) {
      System.out.println("計算できません（解なし）");
    } else if (operator.equals("/")) {
      System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + divide);
    } else {
      System.out.println("演算子が誤っています");
    }

  }
}