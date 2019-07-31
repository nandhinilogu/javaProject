package OopsConcepts;
class Document{
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Document [name=" + name + "]";
}

	}
class Email extends Document{
	String sender;
	String recipient;
	String title;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", title=" + title + ", name=" + name + "]";
	}
	
	
}
public class Inheritance {

	public static void main(String[] args) {
		Email e = new Email();
		e.setName("nandhu");
		e.setSender("sownd");
		e.setRecipient("shamya");
		e.setTitle("Exam notes");
		System.out.println(e.toString());

	}

}
