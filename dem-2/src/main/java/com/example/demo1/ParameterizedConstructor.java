package com.example.demo1;

public class ParameterizedConstructor {
int number;

ParameterizedConstructor(int num) {
number = num;
}

public static void main(String[] args) {
ParameterizedConstructor obj = new ParameterizedConstructor(5);
System.out.println(obj.number);
}
}


