class Employee{
    private String name;
     private String jobtitle;
    private double salary;

public Employee(String name , String jobtitle , double salary){
    this.name=name;
    this.jobtitle=jobtitle;
    this.salary=salary;
}
public String getName(){
    return name;
}
public String getJobTitle(){
    return jobtitle;
}
public double getSalary(){
    return salary;
}
public void setName(String name){
    this.name=name;
}
public void setJobTitle(String jobtitle){
    this.jobtitle=jobtitle;
}
public void setSalary(double salary){
    this.salary=salary;
}
public void increaseSalary(double increase){
    salary= salary + (salary*increase)/100;
}
public  void employeedetails(){
    System.out.println(name);
    System.out.println(jobtitle);
    System.out.println(salary);
}
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ram","Mangaer", 1000000);
        Employee employee2 = new Employee("Shyam","Engineer", 5000000);

        System.out.println("Employee details");
        employee1.employeedetails();
        employee2.employeedetails();
        employee1.increaseSalary(5);
        employee2.increaseSalary(10);
        System.out.println("Employee details after salary increment");
        employee1.employeedetails();
        employee2.employeedetails();

    }
}
