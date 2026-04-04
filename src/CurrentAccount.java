public class CurrentAccount extends BankAccount implements Transferable{
    public CurrentAccount(int accNo , String owner , double balance){
        super(accNo , owner , balance);
    }

    public boolean withdraw(double amount){
        if(amount<=0) return false;

        if(balance - amount >= -10000){
            balance-= amount;
            return true;
        }
        return false;
    }


    public boolean transfer(BankAccount target , double amount){
        if(target == null || amount<=0) return false;
        if(this.withdraw(amount)){
            target.deposit(amount);
            return true;
        }
        return false;
    }
}
