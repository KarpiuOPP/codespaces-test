package com.example.codespacestest;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MainTest {

    private final String name;
    private final String surname;

    public String sayMyName() {
        return name + " " + surname;
    }
}
