public class Main{
    public static void main(String[]args){

        //inheritance => the process where one class aqures the atributes and methods of another

        Car car = new Car();
        //car.go();

        Bycycle bike = new Bycycle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);

        System.out.println(car.wheels);
        System.out.println(bike.wheels);



    }
}