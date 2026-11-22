import java.util.Scanner;

interface oVehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements oVehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Gear:- " + gear + " | Speed:- " + speed);
    }
}

class Car implements oVehicle {
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Gear:- " + gear + " | Speed:- " + speed);
    }
}

class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bicycle B = new Bicycle();
        
        B.changeGear(6);
        B.speedUp(5);
        B.applyBrakes(4);

        Car C = new Car();

        C.changeGear(3);
        C.speedUp(2);
        C.applyBrakes(1);

        System.out.println("Bicycle:- ");
        B.printStates();

        System.out.println();

        System.out.println("Car:- ");
        C.printStates();


        sc.close();
    }
}