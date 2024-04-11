package Abstract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaration
        int bankNo;
        
        //Create Instance
        Bank SBI = new SBI();
        Bank HDFC = new HDFC();
        Scanner inputScan = new Scanner(System.in);

        //Get Input From User
        System.out.println("\n Select a Bank: \n 1: SBI \n 2: HDFC \n");
        
        bankNo = inputScan.nextInt();
        inputScan.close();

        switch (bankNo) {
            case 1:
                SBI.printIntRate();
                break;
            case 2:
                HDFC.printIntRate();
                break;
        
            default:
                System.out.println("Enter a valid Option");
                break;
        }


    }
}
