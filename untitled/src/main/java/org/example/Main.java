package org.example;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        SaveToFile.saveToJson(order);
    }
}