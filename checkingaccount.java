public class checkingaccount
{
private float funds;	// variable for amount of money in the account

public checkingaccount(float fund){
super();	// invokes the constructor
this.funds = fund;	// initializer for amount of money
}

public void withdrawmoney(float fund){
if(this.funds < fund){	// if statement to compare funds
System.out.println("\n Not enough money in the account");
}
else{
this.funds = this.funds - fund;	// current - what you withdraw 
}
}

public void setfunds(float fund){
this.funds = fund;	// to give the initial amount of money 
}

public float checkfunds(){
return funds;	// returns the value in the account
}

public void depositmoney(float fund){
this.funds = this.funds + fund;	// current + what you deposite 
}
}
