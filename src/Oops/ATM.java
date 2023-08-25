package Oops;


import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ATMop obj = new ATMop();


    }
}

class Data {
    float balance;
}

class ATMop {
    Scanner scan = new Scanner(System.in);
    HashMap<Integer, Data> map = new HashMap<>();


    ATMop() {
        System.out.println("welcome to our ATM");
        op();
    }

    public void op() {
        System.out.println("enter your pin");
        int pin = scan.nextInt();
        if (map.containsKey(pin) == true) {
            Data obj = map.get(pin);
            menu(obj);
        } else {
            System.out.println("create  your account ");
            System.out.println("Set your pin");
            int pin1 = scan.nextInt();
            Data obj = new Data();
            map.put(pin, obj);
            menu(obj);


        }
    }

    public void menu(Data obj) {

        System.out.println("inter your choice");
        System.out.println("1. check balance");
        System.out.println("2. deposit money");
        System.out.println("3. withdraw money");
        System.out.println("4. check another account");
        System.out.println("5. exit");

        int choice = scan.nextInt();

        if (choice == 1) {
            check_balance(obj);

        } else if (choice == 2) {
deposit(obj);

        } else if (choice == 3) {
            withDraw(obj);

        } else if (choice == 4) {
op();
        } else if (choice == 5) {
            System.out.println("THANK YOU");

        } else {
            System.out.println("invalid entry");
            menu(obj);
        }
    }

    public void check_balance(Data obj) {
        System.out.println("your tatol banlance= " + obj.balance);
        menu(obj);
    }

    public void deposit(Data obj) {
        System.out.println("enter your amount");
        float a = scan.nextFloat();
        obj.balance = obj.balance + a;

menu(obj);
    }

    public void withDraw(Data obj) {
        System.out.println("enter your amount how many u want to withdraw");
        float withdraw = scan.nextInt();
        if (obj.balance >= withdraw) {
            obj.balance = obj.balance - withdraw;
            System.out.println("amount withdraw succesfully");
            menu(obj);
        } else {
            System.out.println("insufficiate balance");
        }

        System.out.println("*******************");
    }
}
