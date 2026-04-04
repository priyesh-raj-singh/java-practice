import java.util.*;

public class Main {
    public static void main(String[] args){

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101 , "Priyesh" , 100000));

        accounts.add(new CurrentAccount(103 , "Raj" , 400000));

        accounts.add(new SavingsAccount(105 , "Aman" , 3400000));

        //Iterate
        for(BankAccount acc : accounts){
            System.out.println(acc.getOwner() + " : Rs." + acc.getBalance());
        }

        accounts.sort((a,b) -> Double.compare(a.getBalance() , b.getBalance()));

        for(BankAccount acc : accounts){
            System.out.println(acc.getOwner() + " : Rs." + acc.getBalance());
        }



    }



}