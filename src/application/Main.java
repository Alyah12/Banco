package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta cont;

        System.out.println("Enter account number");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n) ?");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.println("Enter inicial deposit value ");
            int initialValue = sc.nextInt();
             cont = new Conta(number, name, initialValue);
        }
        else {
            cont = new Conta(number, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(cont);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        cont.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(cont);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        cont.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(cont);

    }
}