import com.epam.Aquarium;
import com.epam.Fish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium();
        System.out.println("How many fish do you want in your aquarium?");
        Scanner sc = new Scanner(System.in);
        int numberOfFish = sc.nextInt();

        for (int i = 1; i<=numberOfFish; i++) {
            System.out.println("Fish number " + i );
            System.out.println("Type fish's name: ");
            Scanner sc1 = new Scanner(System.in);
            String fishName = sc1.nextLine();

            System.out.println("Type fish's age: ");
            Scanner sc2 = new Scanner(System.in);
            int fishAge = sc2.nextInt();

            System.out.println("Type fish's color: ");
            Scanner sc3 = new Scanner(System.in);
            String fishColor = sc3.nextLine();
            Fish fish2 = new Fish(fishName, fishAge, fishColor);
            aquarium1.addFish(fish2);

            System.out.println("Do you want to delete it? If NO print 0, if YES print 1: ");
            Scanner sc4 = new Scanner(System.in);
            int answer = sc4.nextInt();
            if (answer == 1){
                aquarium1.killFish(fish2);}
            else {

                System.out.println("Do you want to change its color? If NO print 0, if YES print 1");
                Scanner sc5 = new Scanner(System.in);
                int answer1 = sc5.nextInt();
                if (answer1 == 1) {
                    System.out.println("Print color you want: ");
                    Scanner sc6 = new Scanner(System.in);
                    String yourColor = sc6.nextLine();
                    fish2.setColor(yourColor);
                }
            }
        }
        System.out.println("Your aquarium has the following fish: ");
        aquarium1.seeAllFishes();
    }
}
