public class BMI {

    public void calcBMI(int weight_kg,float height_cm){

        //Calculate BMI
        float h_in = height_cm/100;
        float bmi=weight_kg/(h_in*h_in);  

        //Category BMI
        if(bmi<18.5){
            printBMI(bmi, "UnderWeight");
        } else if(bmi>18.5 && bmi<24.9){
            printBMI(bmi, "Normal Weight");
        } else if(bmi >24.9 && bmi<29.9){
            printBMI(bmi, "OverWeight");
        }else{
            printBMI(bmi,"Obese");
        }

        // switch (bmi) {
        //     case bmi<18.5:
        //         printBMI(bmi, "UnderWeight");
        //         break;
        //     case bmi>18.5 && bmi<24.9:
        //         printBMI(bmi, "Normal Weight");
        //         break;
        //     case bmi >24.9 && bmi<29.9:
        //         printBMI(bmi, "Normal Weight");
        //         break;
        //     default:
        //         printBMI(bmi, "Obese");
        //         break;
        // }

    }

    //Print BMI
    public static void printBMI(float bmi,String category){
        System.out.println("BMI is " + bmi + ", You are " + category);
    }
    
}
