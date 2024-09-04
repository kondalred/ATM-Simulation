user.class: user.java
	javac -g user.java
atm.class: atm.java user.class
	javac -g atm.java
checkingaccount.class: checkingaccount.java
	javac -g checkingaccount.java
savingaccount.class: savingaccount.java
	javac -g savingaccount.java

clean:
	rm*.class

run: atm.class
	java atm

debug: atm.class
	jdb atm

