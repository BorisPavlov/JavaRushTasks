package com.javarush.task.task14.task1417;

public class Ruble extends Money {
    public String getCurrencyName() { return "RUB"; }
    public Ruble(double amount) { super(amount); }
    public double getAmount() {
        return 33.44;
    }
}
