package com.rfapi;

public final class RFApi {
    public static void main(String[] args) {
        System.out.println(new RFApi().test("world"));
    }

    public String test(String name) {
        return "Hello " + name;
    }
}
