package Week4;

public class SavingAccount {
    public double balance = 100;
    public double interestRate;
    public String name;

    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }//end method displayCustomer  
    
    public int deposit(int x) {
    	balance +=x;
    return (int) balance;
    }
}
