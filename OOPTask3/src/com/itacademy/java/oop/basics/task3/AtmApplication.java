package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.InsuficientAtmFundsException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughBalanceException;
import com.itacademy.java.oop.basics.task3.exceptions.NotEnoughtCreditException;

public class AtmApplication {
    public static void main(String[] args) {
        //   CreditCard creditCard = new CreditCard();
        DebitCard debitCard = new DebitCard(10000, "John Wick", "XYZ00000000007");
        DebitCard debitCardRich = new DebitCard(100000000, "John Rembo", "XYZ00000000008");

        MyBankAtm myBankAtm = new MyBankAtm(50000);

        //to reduce code wont use try catch on methods without errors:
        debitCard = myBankAtm.withdraw(debitCard, AtmOperation.CREDIT, 4999);
        debitCard = myBankAtm.withdraw(debitCard, AtmOperation.DEBIT, 9999);


        //trying to withdraw more than have on balance
        try{
            debitCard = myBankAtm.withdraw(debitCard,AtmOperation.DEBIT, 10000);
        }catch (InsuficientAtmFundsException ex){
            System.out.println(ex.getMessage());
        }catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
        }
        //trying to withdraw more than Atm has on balance
        try{
            debitCardRich = myBankAtm.withdraw(debitCardRich,AtmOperation.DEBIT, 100000);
        }catch (InsuficientAtmFundsException ex){
            System.out.println(ex.getMessage());
        }catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
        }

        CreditCard creditCard = new CreditCard(10000, "John Travolta", "XYZ00000000009",10,5000);
        CreditCard creditCardRich = new CreditCard(100000, "John Doe", "XYZ00000000010",10,50000);

        //to reduce code wont use try catch on methods without errors:
        creditCard = myBankAtm.withdraw(creditCard,AtmOperation.CREDIT,500);
        creditCard = myBankAtm.withdraw(creditCard,AtmOperation.DEBIT,11000);

        //trying to withdraw more than have on balance with credit
        try{
            creditCard = myBankAtm.withdraw(creditCard,AtmOperation.DEBIT, 7000);
        }catch (InsuficientAtmFundsException ex){
            System.out.println(ex.getMessage());
        }catch (NotEnoughtCreditException e){
            System.out.println(e.getMessage());
        }
        //trying to withdraw more than Atm has on balance
        try{
            creditCardRich = myBankAtm.withdraw(creditCardRich,AtmOperation.DEBIT, 70000);
        }catch (InsuficientAtmFundsException ex){
            System.out.println(ex.getMessage());
        }catch (NotEnoughtCreditException e){
            System.out.println(e.getMessage());
        }
    }
}
