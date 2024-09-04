public class user
{
private boolean admin;	// variable for admin
private int pinnum;	// variable for pin number
private String accnum;	// variable for account number
private checkingaccount ca;	// variable for checking account
private savingaccount sa;	// variable for saving account 

public user(String accnum, int pin, boolean Admin, checkingaccount ca, savingaccount sa){	//  	constructor named user
super();
this.accnum = accnum;	// initializer for account number
this.pinnum = pin;	// initializer for pin number
this.admin = Admin;	// initializer for admin
this.ca = ca;	// initializer for checking account
this.sa = sa;	// initializer for saving account
}

public boolean Admin(){	
return admin;	// returns admin
}
public void setAdmin(boolean Admin){
this.admin = Admin;
}

public savingaccount getsavingaccount(){
return sa;	// returns saving account
}

public int getpin(){
return pinnum;	// returns pin number
}
public void setpin(int pin){
this.pinnum = pin;	
}

public String getaccnum(){
return accnum;	// returns account number
}

public checkingaccount getcheckingaccount(){
return ca;	// returns checking account 
}

public String info(){	// for info 
return "user [AccountNumber= "+ accnum + ", admin = "+ admin +", CheckingAccount = "+ ca +", SavingAccount ="+ sa +"]";
}
}
