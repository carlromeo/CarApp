import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        String make="";
        String model="";
        String userInput ="";
        int year = 0;
        int counter = 1;
        ArrayList<Car> cars= new ArrayList<>();
        System.out.println("List Of Cars");

        while (true) {

            Car carPage = new Car();
            System.out.println("Please enter Make for car " + counter);
            make = key.nextLine();
            carPage.setMake(make);

            System.out.println("Please enter Model for car " + counter);
            model = key.nextLine();
            carPage.setModel(model);

            System.out.println("Please enter Year for car  " + counter);
            year = key.nextInt();
            key.nextLine();
            carPage.setYear(year);

            System.out.println("Do you wanna add another car? (y/n)");
            userInput = key.nextLine();

            if (userInput.equalsIgnoreCase(("n"))) {
                break;
            }
            counter = counter + 1;
        }

        for (Car carPage : cars){
            System.out.println("Car " + counter);
            System.out.println(carPage.getDisplayText());
            counter = counter + 1;



        }


    }
}
