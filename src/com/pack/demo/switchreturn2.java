package com.pack.demo;

public class switchreturn2 {

    static double getDouble(Object o) {
        return switch (o) {
            case Integer j -> Double j;
			j.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }

    public static void main(String[] args) {
        System.out.println("Match Pattern for switch..");
        System.out.println("Integer: " + getDouble(33));
        System.out.println("Float: " + getDouble(33.33f));
        System.out.println("String: " + getDouble("4.5"));
    }
}
