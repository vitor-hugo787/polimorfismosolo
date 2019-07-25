package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		//lista instanciada 
		List<Employee> list  = new ArrayList<>(); 
		
		
		System.out.println("enter ther number  of employees: ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i<=n; i++) {
			System.out.println("employee #" + i +" 1 data: ");
			System.out.print("Outsoucert (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("name ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("hours");
			int hours = sc.nextInt();
			System.out.println("value for hour ");
			double vfh = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("addional charge ");
				double ac = sc.nextDouble();
				Employee emp = new OutsorcedEmployee(name,hours,vfh,ac);
				list.add(emp);
				
			}else{
				Employee emp = new Employee(name,hours,vfh);
				list.add(emp);
			}
			
			System.out.println();
			System.out.println("payments ");
			for(Employee emp : list) {
				System.out.println(emp.getName()+  " - $ " +String.format("%.2f", emp.paymat()));
			}
			
		}
		
		
		
         
		
		
		
		
		
		sc.close();
	}

}
