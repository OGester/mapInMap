package org.example;

public class Income {
    private String id;
    private double amount;
    private String date;
    private EIncomeCategory category;

    public Income(String id, double amount, String date, EIncomeCategory category) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public EIncomeCategory getCategory() {
        return category;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCategory(EIncomeCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Income{" +
                "amount=" + amount +
                ", date='" + date + '\'' +
                ", category=" + category +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
