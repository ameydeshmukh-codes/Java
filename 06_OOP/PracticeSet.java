

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class PracticeSet {
    public static void main(String[] args) {
        /*
        //Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name) */

        Employee Amey = new Employee();
        Amey.setName("Amey");
        Amey.salary = 233;
        System.out.println(Amey.getSalary());
        System.out.println(Amey.getName());

        // Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
         asus.ring();


        // Create a class Square with a method to initialize its side, calculating area, perimeter etc
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
         

        // Problem  : Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();


    }
}