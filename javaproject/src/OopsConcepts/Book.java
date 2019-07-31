package OopsConcepts;

public class Book {
String ISBN;
String title;
String author;
double price;
public Book(String iSBN, String title, String author, double price) {
	super();
	ISBN = iSBN;
	this.title = title;
	this.author = author;
	this.price = price;
}
public void discountPrice(double discount_price){
	System.out.print("  price: "+price*discount_price);
}
public void dispalyDetails(){
	System.out.print("ISBN:"+ISBN+"  Title:"+title+"  Author:"+author);
}

	public static void main(String[] args) {
		Book b=new Book("0908783116"," Mechanical Harry","Bob Kerr",1500.00);
		b.dispalyDetails();
		b.discountPrice(0.25);

	}

}
