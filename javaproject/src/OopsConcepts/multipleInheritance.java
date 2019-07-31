package OopsConcepts;
class BookDetails{
	String ISBN;
	String title;
	double price;
	public BookDetails(String iSBN, String title, double price) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}
	
}
class Maganize extends BookDetails{
	String type;
public Maganize(String iSBN, String title, double price,String type) {
		super(iSBN, title, price);
		this.type=type;
	}
@Override
public String toString() {
	return "Maganize [type=" + type + ", ISBN=" + ISBN + ", title=" + title + ", price=" + price + "]";
}
}
class Novel extends Maganize{
	
	String author;
	public Novel(String iSBN, String title, double price, String type,String author) {
		super(iSBN, title, price, type);
		this.author=author;
	}
	@Override
	public String toString() {
		return "Novel [author=" + author + ", type=" + type + ", ISBN=" + ISBN + ", title=" + title + ", price=" + price
				+ "]";
	}

}
public class multipleInheritance {

	public static void main(String[] args) {
		Novel n=new Novel("013455589","java",1200.50,"L1","james");
		System.out.println(n.toString());
		Maganize m=new Maganize("010374567","Html",500.35,"L2");
        System.out.println(m.toString());
	}

}
