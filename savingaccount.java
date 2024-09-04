public class savingaccount
{
private float funds;	// variable for amount of money in the account 
private float intrate;	// variable for interest rate 

public savingaccount(float fund, float intrate){	// saving account constructor 
super();	// to invoke the constructor 
this.funds = fund;	//initialize the amount of money 
this.intrate = intrate;	// initialize the interest rate
}

public void applyinterest(int month){
this.funds = this.funds + paidinterest(month);	// to put interest in the current amount
}

public float paidinterest(int month){
float interest;	// variable for interest
interest = this.funds * (1 + intrate * month/12) - this.funds;	// interest rate formula
return interest;	// returns the interest
}

public float getintrate(){
return intrate;	// returns interest rate 
}
public void setintrate(float intrate){
this.intrate = intrate;	// gives the initial interest rate 
}

public float checkfunds(){
return funds;	// returns the value in the account
}

public void setfunds(float fund){
this.funds = fund;	// gives the initial amount of money in the account
}

public void withdrawmoney(float fund){
if (this.funds < fund){	// if statement to comapare funds 
System.out.println("\n Not enough money in the account");
}
else{
this.funds = this.funds - fund;	// current - amount you withdrew 
}	
}

public void depositmoney(float fund){
this.funds = this.funds + fund;	// current + what you deposite 
}
}

