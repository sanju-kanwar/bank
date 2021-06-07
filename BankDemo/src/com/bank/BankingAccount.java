package com.bank;

import java.util.Scanner;

public class BankingAccount {

	public static void main(String[] args) {
		BankAccount ob= new BankAccount("san code","sn001");
		ob.showMenu();
			}

		}
		class BankAccount{
			int balance;
		int previousTransation;
			String customerName;
			String customerId;
			 BankAccount( String cname, String cid) {
				customerName= cname;
				customerId = cid;
			}
			void deposit(int amount) {
				if(amount !=0) {
					balance = balance + amount;
					previousTransation = amount;
				}
			}

		void withdraw(int amount) {
			if(amount !=0) {
				balance = balance - amount;
				previousTransation = -amount;
			}
		}
		void getPreviousTransation() {
			if(previousTransation >0) {
				System.out.println("deposit :"+ previousTransation);
			}
			else if(previousTransation <0) {
				System.out.println("withdraw:" + Math.abs(previousTransation));
			}
			else {
				System.out.println("No transation occured");
			}
		}
		void showMenu() {
			char option = '\0';
			Scanner scan= new Scanner(System.in);
			System.out.println("welcome "+ customerName);
			System.out.println("your id"+ customerId);
			System.out.println("\n");
			System.out.println("a: cheack balance ");
			System.out.println("b: deposit");
			System.out.println("c: withdraw");
			System.out.println("d: previoustransation");
			System.out.println("e: exit the system");
			do {
				System.out.println("=____________________________,,____");
				System.out.println("enter your option");
				System.out.println("______________________");
				option = scan.next().charAt(0);
				System.out.println("\n");
				switch (option) {
				case 'a':
					System.out.println("___________________");
					System.out.println("balance=" +balance);
					System.out.println("_________________");
					System.out.println("\n");
				case 'b':
					System.out.println("___________________");
					System.out.println("enter an amount to deposit ");
					System.out.println("_________________");
					int amount= scan.nextInt();
					deposit(amount);
					System.out.println("\n");
		break;
				case 'c':
					System.out.println("___________________");
					System.out.println("enter an amount to withdraw ");
					System.out.println("_________________");
					int amount2= scan.nextInt();
					withdraw(amount2);
					System.out.println("\n");
		break;
				case 'd':
					System.out.println("___________________");
					getPreviousTransation();
		     			System.out.println("_________________");
					System.out.println("\n");
		break;
				case 'e':
					System.out.println("__________________");
					break;
		default:
			System.out.println("invalid option plz enter correct option ");
			break;
				}
			}
			while(option != 'e') ;
			System.out.println("thank you for using our servies");
				
			
		}
		
			
			
			
			
			
			
			
			
			

	}


