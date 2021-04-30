package hw3;

public class Course {

	//Constructor
	public void Course () {
		System.out.println("Constructor ");
		
	}
	
	
	public Course(int courseid, String courseName, double price) {
		this.courseid= courseid;
		this.courseName= courseName;
		this.price= price;
	}
		
	
	
	
	int courseid;
	String courseName; 
	double  price;
	}
