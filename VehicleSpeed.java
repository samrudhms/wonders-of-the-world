

import java.util.Scanner;

class Vehicle {

    private int gear;
    private int brakeLevel;
    private int speed;

    // Method to set gear
    public void setGear(int gear) {
        if (gear < 0 || gear > 5) {
            System.out.println("Invalid gear! (Choose between 0 and 5)");
        } else {
            this.gear = gear;
        }
    }
    public void applyBrake(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Invalid brake level! (0–100%)");
        } else {
            this.brakeLevel = level;
        }
    }
    public void calculateSpeed() {
        int baseSpeed;

        switch (gear) {
            case 0:
                baseSpeed = 0;
                break;
            case 1:
                baseSpeed = 20;
                break;
            case 2:
                baseSpeed = 40;
                break;
            case 3:
                baseSpeed = 60;
                break;
            case 4:
                baseSpeed = 80;
                break;
            case 5:
                baseSpeed = 100;
                break;
            default:
                baseSpeed = 0;
        }
        speed = baseSpeed - (brakeLevel * baseSpeed / 100);
    }
    public void showSpeed() {
        System.out.println("Current Gear: " + gear);
        System.out.println("Brake Level: " + brakeLevel + "%");
        System.out.println("Calculated Speed: " + speed + " km/h");
    }
}

public class VehicleSpeed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle car = new Vehicle();

        System.out.print("Enter current gear (0–5): ");
        int gear = sc.nextInt();

        System.out.print("Enter brake level (0–100%): ");
        int brake = sc.nextInt();

        car.setGear(gear);
        car.applyBrake(brake);
        car.calculateSpeed();
        car.showSpeed();

        sc.close();
    }
}
