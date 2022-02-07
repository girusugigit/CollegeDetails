package org.college;
import org.college.Hostel;
public class Student extends Hostel {
	
	
	public void studentName() {
		System.out.println("The student name is : Varunika");

	}
	public void studentDept(){
		System.out.println("The stsudent department is : Computer Science");

	}
	public void studentId() {
		System.out.println("The Student ID is : WIN001");

	}
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.studentId();
		st.studentName();
		st.studentDept();
		st.deptName();
		st.hostelName();
	}
}
