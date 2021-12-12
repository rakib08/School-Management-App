package interfaces;
import java.lang.*;
import classes.Student;

public interface StudentOperations
{
	boolean insertStudent(Student a);
	boolean removeStudent(Student a);
	Student searchStudent(String studentID);
	void showAllStudents();
}