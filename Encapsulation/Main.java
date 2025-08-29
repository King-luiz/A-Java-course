
public class Main {
    public static void main(String[] args) {
        

        // Encapsulation => attributes of a class will be hiden or private
                        //=> can only be accesed though methods (getters and setters)
                        //=> you shouuld meke the attributes private if you dont have a reason to make e'm public or protected


    Car car = new Car("Chevrolet","camaro", 2025);
     System.out.println(car.getMake());
     System.out.println(car.getModel());
System.out.println(car.getYear());

System.out.println("=====================");
System.out.println("                      ");
car.setYear(2022);
System.out.println(car.getMake());
System.out.println(car.getModel());
System.out.println(car.getYear());

        
    }
    
}