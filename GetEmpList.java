 package java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetEmpList {
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
        
		empList.add(new Employee(111, "Jiyan", 24, "F", "HR",         2011, 25000.0));
		empList.add(new Employee(122, "Parul", 25, "M", "Sales",      2015, 13500.0));
		empList.add(new Employee(133, "Matin", 29, "M", "Marketing",  2012, 18000.0));
		empList.add(new Employee(144, "Mural", 33, "M", "Development",2014, 32500.0));
		empList.add(new Employee(155, "Nilma", 22, "F", "Transport",  2013, 22700.0));
		empList.add(new Employee(166, "Iqbal", 43, "M", "Security",   2016, 10500.0));
	    
		//1.How many male and female employees are there in the organization?
		Map<String,Long> result1=empList.stream().
				collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("1."+result1);
		
		//2.Print the name of all departments in the organization?
		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		//3.What is the average age of male and female employees?
		Map<String, Double> result2 = empList.stream().
				collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("3."+result2);
		
		//4.Get the names of all employees who have joined after 2015?
		empList.stream().filter(e -> e.getYearOfJoining() > 2015).
								map(Employee::getName).forEach(System.out::println);
		
		//5.Count the number of employees in each department?
		Map<String, Long> result3= empList.stream().
				collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("5." +result3);
		
		//6.What is the average salary of each department?
		Map<String, Double> result4 = empList.stream().
		collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("6." +result4);
		
		//7.What is the average salary of employee who have age greater than 30?
		Double salary=empList.stream().filter(n->n.getAge()>30)
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("7."+salary);
		
		//8.Get the details of youngest male employee in the product development department?
		Optional<Employee> result5 = empList.stream()
				.filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
				.min(Comparator.comparingInt(Employee::getAge));
		System.out.println("8." +result5);
		
		//9.Who has the most working experience in the organization?
		Optional<Employee> result6=empList.stream().
				sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println("9." +result6);
		
		//10.increment the salary by 10%?
		List<Employee> result7=empList.stream().map(e->{
		      if(e.getAge()>25){
		        e.setSalary(e.getSalary()*1.10);
		      }
		      return e; 
		     }).collect(Collectors.toList());

		     System.out.println("10."+result7);
		     
		//11.Get the details of highest paid employee in the organization?
		Map<String, Optional<Employee>> result10 = empList.stream().collect(Collectors.
		         groupingBy(Employee::getGender, Collectors.maxBy((t1, t2) -> (int) 
				(t1.getSalary() - t2.getSalary()))));
	    System.out.println("11. "+result10);
	    
	    //12.Get the Highest paid 3 Employees.
	    List<Employee> result11=empList.stream()
	    		.sorted((e1, e2) ->Double.compare(e2.getSalary(),e1.getSalary())).limit(3)
                .collect(Collectors.toList());
	    System.out.println("12. "+result11);
	    
	    //13.Get the sum of Employees salary.
	    double SumOfSalary=empList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("13."+SumOfSalary);
		
		//14.Sort the Employee class by name and age?
				List<Employee> result16=empList.stream().sorted(Comparator.comparing(Employee::getName)
		               .thenComparingDouble(Employee::getAge)).toList();
				System.out.println("result-16"+result16);
	}
}
