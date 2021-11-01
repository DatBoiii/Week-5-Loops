import java.util.HashMap;
import java.util.Scanner;

public class LoopMap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What car are you looking for?");
        String model = input.nextLine();
        HashMap<String, String> cars = new HashMap<>();


        //Hashmap of models and makes
        cars.put("Odyssey", "Honda");
        cars.put("Explorer", "Ford");
        cars.put("MDX", "Acura");
        cars.put("Sonata", "Hyundai");
        cars.put("Model 3", "Tesla");

        //input
        if (cars.containsKey(model)) {
            System.out.println(" You're looking for a " + model + "?\n Our " + cars.get(model)+ " selection is right over here.");
        } else {
            System.out.println("Sorry, we do not have that model");
        }
        input.close();

    }
}
