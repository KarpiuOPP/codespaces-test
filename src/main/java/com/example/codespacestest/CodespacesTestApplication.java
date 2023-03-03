package com.example.codespacestest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodespacesTestApplication {


    public static void main(String[] args) {
        SpringApplication.run(CodespacesTestApplication.class, args);

        MainTest mainTest1 = new MainTest("Marcin", "Karpiński");

        String result = mainTest1.sayMyName();
        System.out.println(result);
    }

}
