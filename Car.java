public class Car {
    public String color;
    public Car(){
        System.out.println("Car is buiding");
    }
    public void accelerate(){
        System.out.println("Car is accelerating!");
    }
}

class SportCar extends Car {
    public SportCar() {
        super();
        System.out.println("SportCar is buiding");
    }

    public static void main(String[] args) {
        new SportCar();
    }
}

class LuxuryCar extends Car{
    public void service(){
        System.out.println("LuxuryCar is in service!");
    }

    public static void main(String[] args) {
        Car c = new LuxuryCar();
        ((LuxuryCar) c).service();
    }
}
