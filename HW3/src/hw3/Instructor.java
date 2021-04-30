package hw3;

public class Instructor extends User {
	
	 String vocation;
	
	
	
	public Instructor (int id, String name, String userType, String vocation) {
		this.id=id;
		this.name=name;
		this.userType=userType;
		this.vocation=vocation;
		
		
	}
	 int id; 
	 String name;
	 String userType;



	public String getVocation() {
		return vocation;
	}
	public void setVocation(String vocation) {
		this.vocation = vocation;
	}


}
