package hw2;

public class Universities{
	
	//Constructor
	public Universities() {
		System.out.println("Üniversiteler");
	}
	
	public Universities(int id, String name, String country, String city, String address) {
		this();
		this.id=id;
		this.name=name;
		this.country=country;
		this.city=city;
		this.address=address;
		
	}
	
int id;
String name;
String country;
String city;
String address;



}
