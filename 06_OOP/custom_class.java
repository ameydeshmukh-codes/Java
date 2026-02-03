
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Rakesh = new Employee(); // Instantiating a new Employee Object
        Employee Amey = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Rakesh
        Rakesh.id = 12;
        Rakesh.salary = 34;
        Rakesh.name = "Rakesh";

        // Setting Attributes for Amey
        Amey.id = 17;
        Amey.salary = 12;
        Amey.name = "Amey";

        // Setting Attributes for John
        Amey.id = 17;
        Amey.salary = 12;
        Amey.name = "Amey Deshmukh";

        // Printing the Attributes
        Rakesh.printDetails();
        Amey.printDetails();
        int salary = Amey.getSalary();
      
        // System.out.println(Amey.id);
        // System.out.println(Amey.name);
    }
}
