package OopsConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

class Payment{
double amount;
public double getAmount() {
	return amount;
}


public void setAmount(double amount) {
	this.amount = amount;
}


public Payment(double amount) {
	super();
	this.amount = amount;
}


public void paymentDetails(){
	System.out.println("Amount:"+this.amount);
}
}
class cashPayment extends Payment{

	public cashPayment(double amount) {
		super(amount);
		
	}
	public void paymentDetails(){
		System.out.println("Amount:"+this.amount);
	}
}
class Creditcardpayment extends Payment{
String cardname;
String expirationdate;
long credit_card_number;
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
public Creditcardpayment(double amount, String cardname, String expirationdate, long credit_card_number) {
	super(amount);
	this.cardname = cardname;
	this.expirationdate = expirationdate;
	this.credit_card_number = credit_card_number;
}
public void paymentDetails(){
	System.out.println("Amount:"+this.amount+" CardName:"+this.cardname+" Expirationdate:"+this.expirationdate+" CreditcardNumber:"+this.credit_card_number);
}
	
}
public class SuperInheritance {

	public static void main(String[] args) {
		cashPayment cp=new cashPayment(1256.70);
        cp.paymentDetails();
        Creditcardpayment cc=new Creditcardpayment(1200.65,"Indian bank","30/07/2019",451234);
        cc.paymentDetails();
	}

}
