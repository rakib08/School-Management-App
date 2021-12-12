import java.lang.*;
import classes.*;
// import fileio.*;
import java.util.Scanner;

public class Start {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// FileReadWriteDemo frwd = new FileReadWriteDemo();

		School school = new School("Cant Public School & College", "Saidpur, Nilphamari");

		System.out.println("----------------------------------------------------");
		System.out.println("School Management System");
		System.out.println("----------------------------------------------------\n");

		boolean repeat = true;

		while (repeat) {
			System.out.println("What do you want to do?");

			System.out.println("\t1. Student Management.");
			System.out.println("\t2. Teacher Management.");
			System.out.println("\t3. Employee Management.");
			System.out.println("\t4. Show School Information.");
			System.out.println("\t5. Exit");
			System.out.println("");

			System.out.println("\n---------------------------------------");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------------------\n");

			switch (choice) {
				case 1:

					System.out.println("#####################################");
					System.out.println("You have selected Insert Student Management");
					System.out.println("#####################################");

					System.out.println("What do you want to do?\n");

					System.out.println("\t1. Insert New Student");
					System.out.println("\t2. Remove Student");
					System.out.println("\t3. Search Student");
					System.out.println("\t4. Show All Students");
					System.out.println("\t5. Go Back");

					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					System.out.println("---------------------------\n");

					switch (option1) {
						case 1:

							System.out.println("#####################################");
							System.out.println("You have selected Insert Student");
							System.out.println("#####################################");

							System.out.print("Enter Student Name: ");
							String name1 = sc.next();
							System.out.print("Enter Student ID: ");
							String id1 = sc.next();
							System.out.print("Enter Date of Birth: ");
							String dob1 = sc.next();

							Student s1 = new Student(name1, id1, dob1);

							if (school.insertStudent(s1)) {
								System.out.println("***  Student Inserted, ID : " + s1.getStudentID() + "  ***");
							} else {
								System.out.println("***  Student NOT Inserted, ID : " + s1.getStudentID() + "  ***");
							}

							break;

						case 2:

							System.out.println("#####################################");
							System.out.println("You have selected Remove Student");
							System.out.println("#####################################");

							System.out.print("Enter the ID to remove a student: ");
							String id2 = sc.next();

							Student s2 = school.searchStudent(id2);

							if (s2 != null) {
								System.out.println("***  Student Found  ***");

								if (school.removeStudent(s2)) {
									System.out.println("***  Student Removed, NID : " + s2.getStudentID() + "  ***");
								}
							} else {
								System.out.println("***  Student NOT Found and NOT Removed  ***");
							}

							break;

						case 3:

							System.out.println("#####################################");
							System.out.println("You have selected Search Student");
							System.out.println("#####################################");

							System.out.print("Enter the ID to search a customer: ");
							String id3 = sc.next();

							Student s3 = school.searchStudent(id3);

							if (s3 != null) {
								System.out.println("***  Student Found  ***");
								s3.showDetails();
							} else {
								System.out.println("***  Student NOT Found  ***");
							}
							break;

						case 4:

							System.out.println("#####################################");
							System.out.println("You have selected Show All Student");
							System.out.println("#####################################");

							school.showAllStudents();

							break;

						case 5:

							System.out.println("#####################################");
							System.out.println("You have selected to Go Back....");
							System.out.println("#####################################");

							break;

						default:

							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("#####################################");
							break;
					}
					break;

				case 2:

					System.out.println("#####################################");
					System.out.println("You have selected Teacher Management");
					System.out.println("#####################################");

					System.out.println("What do you want to do?\n");

					System.out.println("\t1. Insert New Teacher");
					System.out.println("\t2. Remove Teacher");
					System.out.println("\t3. Search Teacher");
					System.out.println("\t4. Show All Teacher");
					System.out.println("\t5. Go Back");

					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					System.out.println("---------------------------\n");

					switch (option2) {
						case 1:

							System.out.println("#####################################");
							System.out.println("You have selected Insert Teacher");
							System.out.println("#####################################");

							System.out.print("Enter Teacher Name: ");
							String name1 = sc.next();
							System.out.print("Enter Teacher ID: ");
							String id1 = sc.next();
							System.out.print("Enter Teacher Salary: ");
							double salary1 = sc.nextDouble();
							System.out.print("Enter Teacher Subject: ");
							String subject1 = sc.next();
							System.out.print("Enter Teacher Designation: ");
							String designation1 = sc.next();

							Teacher t1 = new Teacher(name1, id1, salary1, subject1, designation1);

							if (school.insertTeacher(t1)) {
								System.out.println("***  Teacher Inserted, ID : " + t1.getEmpId() + "  ***");
							} else {
								System.out.println("***  Teacher NOT Inserted, ID : " + t1.getEmpId() + "  ***");
							}

							break;

						case 2:

							System.out.println("#####################################");
							System.out.println("You have selected Remove Teacher");
							System.out.println("#####################################");

							System.out.print("Enter the ID to remove a Teacher: ");
							String id2 = sc.next();

							Teacher t2 = school.searchTeacher(id2);

							if (t2 != null) {
								System.out.println("***  Teacher Found  ***");

								if (school.removeTeacher(t2)) {
									System.out.println("***  Teacher Removed, NID : " + t2.getEmpId() + "  ***");
								}
							} else {
								System.out.println("***  Teacher NOT Found and NOT Removed  ***");
							}

							break;

						case 3:

							System.out.println("#####################################");
							System.out.println("You have selected Search Teacher");
							System.out.println("#####################################");

							System.out.print("Enter the ID to search a Teacher: ");
							String id3 = sc.next();

							Teacher t3 = school.searchTeacher(id3);

							if (t3 != null) {
								System.out.println("***  Teacher Found  ***");
								t3.showDetails();
							} else {
								System.out.println("***  Teacher NOT Found  ***");
							}

							break;

						case 4:

							System.out.println("#####################################");
							System.out.println("You have selected Show All Teacher");
							System.out.println("#####################################");

							school.showAllTeachers();

							break;

						case 5:

							System.out.println("#####################################");
							System.out.println("You have selected to Go Back....");
							System.out.println("#####################################");

							break;

						default:

							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("#####################################");
							break;
					}

					break;

				case 3:

					System.out.println("#####################################");
					System.out.println("You have selected Search Employee Management");
					System.out.println("#####################################");

					System.out.println("What do you want to do?\n");

					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Employee");
					System.out.println("\t3. Search Employee");
					System.out.println("\t4. Show All Employee");
					System.out.println("\t5. Go Back");

					System.out.println("\n---------------------------");
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					System.out.println("---------------------------\n");
			
					switch (option3) {

						case 1:
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee ID: ");
							String id1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();

							Employee e1 = new Employee(name1, id1, salary1);

							if (school.insertEmployee(e1)) {
								System.out.println("***  Customer Inserted, NID : " + e1.getEmpId() + "  ***");
							} else {
								System.out.println("***  Customer NOT Inserted, NID : " + e1.getEmpId() + "  ***");
							}

							break;

						case 2:

							System.out.println("#####################################");
							System.out.println("You have selected Remove Employee");
							System.out.println("#####################################");

							System.out.print("Enter the ID to remove a Employee: ");
							String id2 = sc.next();

							Employee t2 = school.searchEmployee(id2);

							if (t2 != null) {
								System.out.println("***  Employee Found  ***");

								if (school.removeEmployee(t2)) {
									System.out.println("***  Employee Removed, NID : " + t2.getEmpId() + "  ***");
								}
							} else {
								System.out.println("***  Employee NOT Found and NOT Removed  ***");
							}

							break;

						case 3:

							System.out.println("#####################################");
							System.out.println("You have selected Search Employee");
							System.out.println("#####################################");

							System.out.print("Enter the ID to search a Employee: ");
							String id3 = sc.next();

							Employee e3 = school.searchEmployee(id3);

							if (e3 != null) {
								System.out.println("***  Employee Found  ***");
								e3.showDetails();
							} else {
								System.out.println("***  Employee NOT Found  ***");
							}

							break;

						case 4:

							System.out.println("#####################################");
							System.out.println("You have selected Show All Employee");
							System.out.println("#####################################");

							school.showAllEmployees();

							break;

						case 5:

							System.out.println("#####################################");
							System.out.println("You have selected to Go Back....");
							System.out.println("#####################################");

							break;

						default:

							System.out.println("#####################################");
							System.out.println("Invalid Option... Going Back...");
							System.out.println("#####################################");
							break;

					}

					break;

				case 4:

					System.out.println("#####################################");
					System.out.println("You have selected Show All School Information");
					System.out.println("#####################################");
					break;

				case 5:

					System.out.println("#####################################");
					System.out.println("You have selected to Go Back....");
					System.out.println("#####################################");

					break;

				default:

					System.out.println("#####################################");
					System.out.println("Invalid Option... Going Back...");
					System.out.println("#####################################");
					break;
			}
		}
		sc.close();
	}
}