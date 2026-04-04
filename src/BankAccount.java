public abstract class BankAccount {

     private int accountNumber;

    protected double balance;

    private String owner;

    //Create constructor of this class

    public BankAccount(int accountNumber, String owner, double balance){
        this.accountNumber  = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public  double deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Invalid deposite amount");
        }
        balance+= amount;
        return balance;
    }

    public abstract boolean withdraw(double amount);

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }








}
