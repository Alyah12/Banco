package entities;

public class Conta {

    private int number;
    private String name;
    private double balance;

    public Conta(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Conta(int number, String name, double initialValue) {
        this.number = number;
        this.name = name;
        deposit(initialValue);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "number=" + number +
                ", nome='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
