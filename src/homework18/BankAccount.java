package homework18;

public class BankAccount {
    private int money;

    public BankAccount(int money) {
        this.money = money;
    }
    public synchronized void pay(int amount, String name) {
        if (money >= amount) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            money -= amount;
            System.out.println(name + " gets: " + amount);
        } else {
            System.out.println(name + " sorry, not money: " + money);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "money=" + money +
                '}';
    }
}
