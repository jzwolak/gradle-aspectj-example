package com.example;

public aspect MannersAspect {
    pointcut callSayMessage() : call(public static void MyApp.say*(..));
    before() : callSayMessage() {
        System.out.println("Good day!");
    }
    after() : callSayMessage() {
        System.out.println("Thank you!");
    }
}
