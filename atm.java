import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class atm
{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);	// scanner
ArrayList<user> user = new ArrayList<>();	// array list
user.add(new user("00000", 12345, true, new checkingaccount(30000), new savingaccount(20000,8)));	// to add a user
String contin;	// to go to next options 

do{
System.out.println("\n Please enter your Account Number");
String accnum = scanner.next();	// to get next string 
System.out.println("\n Please enter your Pin Number");
int PIN = scanner.nextInt();	// to get next pin number 
int temp = 0;
for (int i = 0; i < user.size(); i++){	//  to create a new user 
if (user.get(i).getaccnum().equals(accnum) && user.get(i).getpin() == PIN){	// if statement for user to write admin info
int temp1 = 1;
if (user.get(i).Admin()){	// if user turns out to be an admin 
int poss1;
do{
System.out.println("\n 1. Add a user \n" + "2. Delete a user \n" + " 3. Apply interest to Savings Accounts \n" + " 4. List all User \n" + "5. Exit \n");	// prints options list 
System.out.print(" What would you like to do? ");
poss1 = scanner.nextInt();	// to get what you entered 

switch (poss1){
case 1:	// case 1 to get input from the user 
System.out.println("\n Enter Account Number : ");
String accnum1 = scanner.next();
System.out.println("\n Enter Pin Number : ");
int PIN1 = scanner.nextInt();
System.out.println("\n Enter balance the user will have in their Checking Account ");
float checkingbalance = scanner.nextFloat();
System.out.println("\n Enter balance the user will have in their Saving Account ");
float savingbalance = scanner.nextFloat();
System.out.println("\n Enter Interest Rate for the bank ");
float iR = scanner.nextFloat();
user.add(new user(accnum1, PIN1, false, new checkingaccount(checkingbalance), new savingaccount(savingbalance, iR)));
break;

case 2:	// case 3 to delete the user 
System.out.println("\n Enter the Account you want to remove: ");
String accnum2 = scanner.next();
Iterator<user> IT = user.iterator();
int temp2 = 0;
while (IT.hasNext()){
if (IT.next().getaccnum().equals(accnum2)){
temp2 = 1;
IT.remove();
}
}
if (temp2 == 1){
System.out.println("\n Account has been removed ");
}
else{
System.out.println("\n Account " + accnum2 + " not found");
}
break;

case 3:	// case 3 to apply interest
for (int j = 0; j < user.size(); j++){
user.get(j).getsavingaccount().applyinterest(8);
}
break;

case 4:	// case 4 to list users
for (int k = 0; k < user.size(); k++){
System.out.println("\n user " + user.get(k).getaccnum());
}
break;

case 5:	// case 5 to exit 
System.out.println("\n Log-out complete");
break;

default:
System.out.println("\n Sorry try Again");
break;
}
}
while (poss1 != 5);
}
else{
int poss2;

do{
System.out.println("\n 1. Get Checking Account balance \n" + "2. Get Saving Account balance \n" + "3. Withdraw from Checking Account\n" + "4. Withdraw from Saving Account\n" + "5. Deposit into Checking Account\n" + "6. Deposit into saving account\n" + "7. Exit\n");	// print statment to print options 
System.out.print("\n What would you like to do? ");
poss2 = scanner.nextInt();

switch (poss2){
case 1:	// case 1 to get checking balance
System.out.println("\n Your Checking Acccount balance is: " + user.get(i).getcheckingaccount().checkfunds());
break;
case 2:	// case 2 to get savings balance	
System.out.println("\n Your Saving Acccount balance is: " + user.get(i).getsavingaccount().checkfunds());
break;
case 3:	// case 3 to withdraw from checking account
System.out.println("\n Enter how much money you wish to withdraw: ");
float total1 = scanner.nextFloat();
user.get(i).getcheckingaccount().withdrawmoney(total1);
break;

case 4:	// case 4 to withdraw from saving account
System.out.println("\n Enter how much money you wish to withdraw: ");
float total2 = scanner.nextFloat();
user.get(i).getsavingaccount().withdrawmoney(total2);
break;

case 5:	// case 5 to deposite in checking account 
System.out.println("\n Enter how much money you wish to deposit: ");
float total3 = scanner.nextFloat();
user.get(i).getcheckingaccount().depositmoney(total3);
break;

case 6:	// case 6 to deposite in savings account
System.out.println("\n Enter how much money you wish to deposit: ");
float total4 = scanner.nextFloat();
user.get(i).getsavingaccount().depositmoney(total4);
break;

case 7:	// case 7 to exit 
System.out.println("\n Log out complete");
break;

default:
System.out.println("\nSorry, try again");
break;
}
}
while (poss2 != 7);
}
}
}
if (temp == 0){
System.out.println("\n Account not found ");
}
System.out.println("\n Do you wish to continue? ");
contin = scanner.next();
}
while (!contin.equalsIgnoreCase("n"));	// compares the string ignoring the capitalization difference 
}
}

