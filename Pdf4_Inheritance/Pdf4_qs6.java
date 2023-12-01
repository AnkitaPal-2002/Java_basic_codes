/*
 * 	Assume that a Bank maintains two kinds of accounts for its customers, one called savings
	account and the other current account. The savings account provides compound interest and
	withdrawal facilities. The current account provides no interest. Current account holders
	should maintain balance and if the balance falls below this level, a service charge is imposed.
		o Create a class Account that stores customers name, account number and type of the
		account. From this derive the classes CurAccount and SavAccount to make them
		more specific to their requirements.
		o Include the necessary methods in order to achieve the following tasks:
				Assign initial values
				Accept deposit from a customer and update the balance
				Permit withdrawal and update the balance
				Compute and deposit interest
				Check for the minimum balance, impose penalty, if necessary, and update it.
				Display the balance
		o Write a program that creates an array of Bank Account and displays a menu that lets a
		new account to be created, perform deposit and withdrawal transactions on the basis
		of account number, display the balance of account holder for whom the account
		number is provided.
 */

package Pdf4;
import java.util.*;
abstract class Account{
	protected String name;
	protected int accno;
	protected String acctype;
	protected double bal;
	
	
	//Constructor
	public Account(String name, int accno, String acctype, double bal) {
		super();
		this.name = name;
		this.accno = accno;
		this.acctype = acctype;
		this.bal = bal;
	}
	
	//Methods to perform tasks
	public void deposit(double b) {
		if(b>0) {
			this.bal+=b;
			System.out.println(b+"is depositied successfully...");
			System.out.println("Update balance : "+this.bal);
		}else {
			System.out.println("Invalid amount!!!!Please enter valid amount next time.....");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public void withdraw(double b) {
		if(b>0 && b<=this.bal) {
			this.bal-=b;
			System.out.println(b+"is withdrawn successfully....");
			System.out.println("Updated balance is : "+this.bal);
		}else {
			System.out.println("Insufficient funds for withdrawal...........");
		}
	}
	
	
	public void display() {
		System.out.println("Account holder : "+name);
		System.out.println("Account number : "+accno);
		System.out.println("Account type : "+acctype);
		System.out.println("Balance : "+bal);
	}
	
	abstract void checkminbal();
	abstract void depositinterest();
	
	
	
}

class CurAccount extends Account{
	final double minbal = 500;
	final double charge = 100;
	public CurAccount(String name, int accno, String acctype, double bal) {
		super(name, accno, acctype, bal);
		
	}
	@Override
	public void depositinterest() {
		System.out.println("This is a current account...there is no interest");
	}
	 public void checkminbal() {
		 if(this.bal<minbal) {
			 this.bal-=charge;
			 System.out.println("Service charge imposed .... ");
			 System.out.println("Updated balance : "+this.bal);
		 }
	 }
	public double getMinbal() {
		return minbal;
	}
	public double getCharge() {
		return charge;
	}
	
	
}

class SavAccount extends Account{
	final double interest = 4;
	public SavAccount(String name, int accno, String acctype, double bal) {
		super(name, accno, acctype, bal);
		
	}
	
	public double getInterest() {
		return interest;
	}
	@Override
	public void checkminbal() {
		 System.out.println("This is a savings account. There is no service charge.....");
	 }

	//Method to compute and deposit interest
	public void depositinterest() {
		double i = (this.bal*interest)/100;
		this.bal+=i;
		System.out.println("Interest deposited. Updated balance : "+this.bal);
	}
	
}
public class Pdf4_qs6 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int accno = 1000, i=0;
		int op,z,c;
		System.out.print("Enter the total no of the customer capacity of the bank : ");
		int n = sc.nextInt();
		Account ac[] = new Account[n];
		
		do {
			System.out.println("****MENU****");
			System.out.println("1. Create new account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Display balance");
			System.out.println("5. Exit");
			System.out.print("Enter your choice : ");
			op = sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1: //Create new account
				System.out.print("Enter your name : ");
				String name = sc.nextLine();
				System.out.print("Enter balance : ");
				double bal = sc.nextDouble();
				do {
					System.out.println("Please choose account type");
					System.out.println("1. Savings");
					System.out.println("2. Current");
					System.out.print("Enter your option : ");
					z = sc.nextInt();
					if(z==1) {
						ac[i] = new SavAccount(name,accno,"Savings",bal);
						
						accno++;
					}else if(z==2) {
						ac[i] = new CurAccount(name,accno,"Current",bal);
						
						accno++;
					}else {
						System.out.println("Please enter valid option.....");
					}
				}while(z<1 || z>2);
				
				//Display the account details
				System.out.println("Please note down your account details : ");
				ac[i].display();
				i++;
				break;
				
			case 2:
				//Deposit an amount
				System.out.print("Enter your account no : ");
				int sacc = sc.nextInt();
				boolean f = false;
				for (int j=0;j<i;j++) {
					if(sacc==ac[j].getAccno()) {
						System.out.println("Account is found successfully....");
						f = true;
						System.out.println("Welcome "+ac[j].getName());
						System.out.print("Enter the amount which you want to deposit : ");
						double dbal = sc.nextDouble();
						ac[j].deposit(dbal);
						ac[j].depositinterest();
						
					}
				}
				if(f == false) {
					System.out.println("Account is not found.......");
				}
				
				break;
			case 3:
				//Withdraw an amount
				System.out.print("Enter your account no : ");
				int swacc = sc.nextInt();
				boolean fl = false;
				for (int j=0;j<i;j++) {
					if(swacc==ac[j].getAccno()) {
						System.out.println("Account is found successfully....");
						fl = true;
						System.out.println("Welcome "+ac[j].getName());
						System.out.print("Enter the amount which you want to withdraw : ");
						double wbal = sc.nextDouble();
						ac[j].withdraw(wbal);
						ac[j].checkminbal();
					}
				}
				if(fl == false) {
					System.out.println("Account is no found.......");
				}
				break;
			case 4:
				//Display the account details
				System.out.print("Enter your account no : ");
				int dacc = sc.nextInt();
				boolean flag = false;
				for(int j =0;j<i;j++) {
					if(dacc==ac[j].getAccno()) {
						System.out.println("Account is found successfully....");
						flag = true;
						ac[j].display();
					}
				}
				if(flag == false) {
					System.out.println("Account is not found.....");
				}
				break;
			case 5: 
				//Exiting 
				System.out.println("Thank you for using this page.....");
				System.exit(0);
			default : System.out.println("Wrong choice!!!! Please enter valid choice next time....");
			
			}
			System.out.println("If you continue this program press 1 otherwise press any digit.");
			System.out.print("Please enter your choice : ");
			c=sc.nextInt();
			if(c!=1) {
				System.out.println("Thank you visit again.........");
			}
		}while(c==1);
		

	}

}


/*
 * 
 * Output:
 * 
 * Enter the total no of the customer capacity of the bank : 100
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 1
Enter your name : A Pal
Enter balance : 2000
Please choose account type
1. Savings
2. Current
Enter your option : 1
Please note down your account details : 
Account holder : A Pal
Account number : 1000
Account type : Savings
Balance : 2000.0
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 2
Enter your account no : 1000
Account is found successfully....
Welcome A Pal
Enter the amount which you want to deposit : 1000
1000.0is depositied successfully...
Update balance : 3000.0
Interest deposited. Updated balance : 3120.0
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 1
Enter your name : U Pal
Enter balance : 3000
Please choose account type
1. Savings
2. Current
Enter your option : 2
Please note down your account details : 
Account holder : U Pal
Account number : 1001
Account type : Current
Balance : 3000.0
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 4
Enter your account no : 5000
Account is not found.....
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 3
Enter your account no : 1002
Account is no found.......
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 3
Enter your account no : 1001
Account is found successfully....
Welcome U Pal
Enter the amount which you want to withdraw : 4000
Insufficient funds for withdrawal...........
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 4
Enter your account no : 1001
Account is found successfully....
Account holder : U Pal
Account number : 1001
Account type : Current
Balance : 3000.0
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 3
Enter your account no : 1001
Account is found successfully....
Welcome U Pal
Enter the amount which you want to withdraw : 2700
2700.0is withdrawn successfully....
Updated balance is : 300.0
Service charge imposed .... 
Updated balance : 200.0
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 2
Enter your account no : 1001
Account is found successfully....
Welcome U Pal
Enter the amount which you want to deposit : 5000
5000.0is depositied successfully...
Update balance : 5200.0
This is a current account...there is no interest
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 2
Enter your account no : 1000
Account is found successfully....
Welcome A Pal
Enter the amount which you want to deposit : 5000
5000.0is depositied successfully...
Update balance : 8120.0
Interest deposited. Updated balance : 8444.8
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 3
Enter your account no : 1000
Account is found successfully....
Welcome A Pal
Enter the amount which you want to withdraw : 100
100.0is withdrawn successfully....
Updated balance is : 8344.8
This is a savings account. There is no service charge.....
If you continue this program press 1 otherwise press any digit.
Please enter your choice : 1
****MENU****
1. Create new account
2. Deposit
3. Withdraw
4. Display balance
5. Exit
Enter your choice : 5
Thank you for using this page.....

 */
