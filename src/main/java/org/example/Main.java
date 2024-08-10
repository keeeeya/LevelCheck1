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
    switch (operator) {
      case "+" ->
          System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + plus);
      case "-" ->
          System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + minus);
      case "*" ->
          System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + multiply);
      case "/" ->
          System.out.println("計算結果：" + firstNumber + operator + secondNumber + "=" + divide);
      default -> System.out.println("計算できませんでした");
    }

  }
}