package hw3;

public class Main {
	
	public static void main(String[] args) {
		
		Students student1 = new Students();
		student1.setId(1);
		student1.setName("abc");
		student1.setUserType("employe");
		
		System.out.println(student1.getName());
		
		
		Course course1 = new Course(0, null, 0);
		 course1.courseid=001;
		 course1.courseName="Java&React";
		 course1.price=123;
		 
		
		StudentsManager studentManager = new StudentsManager();
		studentManager.add(student1, course1);
		
		UserManager userManager = new UserManager();
		userManager.addUser(student1);
		
		Instructor instructor1= new Instructor(1, "abc ", "Employe ", "Java&React");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1, course1);
		
	}
	 
	
	
	

}
