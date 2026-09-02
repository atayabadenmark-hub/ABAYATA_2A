import java.util.Scanner;

public class activity2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== CINEMA TICKET SYSTEM ===");
        System.out.println("Select Format ([1]:Regular, [2]:3D , [3]: IMAX:");
        int sformat = input.nextInt();
        System.out.println("Enter Screening Hour (24-Hour Format, e.g., 18):");
        int shour = input.nextInt();

        String formatname;
        double base;
        if(sformat == 1){
            formatname = "REGULAR";
            base= 350;
        } else if (sformat == 2) {
            formatname = "3D";
            base= 400;
        } else {
            formatname = "IMAX";
            base= 450;
        }

        double peak;
        if (shour >= 17 && shour <= 20){
            peak = 50;
        }
        else{
            peak = 0;
        }

        double total = base + peak;

        System.out.println("--- TICKET BREAKDOWN ---");
        System.out.println("Screening Format:"+ sformat);
        System.out.println("Base Ticket Price:"+ base);
        System.out.println("Peak Hour Rate:"+ peak);
        System.out.println("-------------------------");
        System.out.println("TOTAL TICKET COST: PHP "+ total);
        System.out.println("Status: SEAT RESERVED");

    }

}




