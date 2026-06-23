package Projects;

import java.util.Scanner;

public class Timer {
    public static void main (String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hours: ");
        int hours = sc.nextInt();

        System.out.println("Enter Minutes: ");
        int minutes = sc.nextInt();

        System.out.println("Enter Seconds: ");
        int seconds = sc.nextInt();

        while(true){
            
            clearScreen();
            System.out.println(hours + ":" + minutes + ":" + seconds);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            seconds--;

            if(seconds == -1){
                seconds = 59;
                minutes--;
            }

            if(minutes == -1){
                minutes = 59;
                hours--;
            }

            if(hours == 0 && minutes == 0 && seconds == 0){
                clearScreen();
                System.out.println("Time's up!");
                break;
            }
        }
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
