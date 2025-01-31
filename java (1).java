import java.util.*;
class Employee{
	String name;
	int empId;
	int Age;
	String Designation;
	double Salary;
	}
	class Test{
		public static void main(String[]args){
			Employee e = new Employee();
			e.name="pratyush";
			e.empId= 2451863;
			e.Age= 21;
			e.Designation="product Analysts";
			e.Salary=200000;
			System.out.println("name"+e.name);
          System.out.println("empId"+e.empId);
          System.out.println("Age"+e.Age);
          System.out.println("Designation"+e.Designation);
          System.out.println("Salary"+e.Salary);
		}
	}
