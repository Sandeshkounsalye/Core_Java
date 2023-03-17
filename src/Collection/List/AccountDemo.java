package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountDemo {
    public static void main(String[] args) {
        List<Account> accountList=new ArrayList();
        Account account1=new Account(1,"Ram",100);
        Account account2=new Account(12,"Shyam",10);
        Account account3=new Account(9,"Sandesh",15);
        Account account4=new Account(3,"Mahesh",30);
        Account account5=new Account(5,"Yash",60);
        Account account6=new Account(4,"Om",105);

        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account5);
        accountList.add(account6);

        accountList.forEach(System.out::println);

        System.out.println("After Sorting Balance  ");
        Collections.sort(accountList, Comparator.comparingInt(Account::getBalance));
        accountList.forEach(System.out::println);

        System.out.println("After sorting by Name");
        Collections.sort(accountList,Comparator.comparing(Account::getAccountHolderName));
        accountList.forEach(System.out::println);

        System.out.println("After sorting by Account Number");
//        Collections.sort(accountList,Comparator.comparingInt(Account::getAccountNumber));
        Collections.sort(accountList,(p1,p2)->p1.getAccountNumber()-p2.getAccountNumber());
        accountList.forEach(System.out::println);
        System.out.println(accountList);

        System.out.println("After sorting by Account Number");
        Collections.sort(accountList,(a1,a2)->a1.getBalance()-a2.getBalance());
        accountList.forEach(System.out::println);

    }
}
