import java.util.ArrayList;

public class Main{
    // private static final char[] Fish = null;

	public static void main(String[] args){

       
        //Create Instance
        // BMI bmiCalc = new BMI();
        // Tables tableCalc = new Tables();

        //Calling Methods by instances(class)
        // bmiCalc.calcBMI(65, 125);
        // tableCalc.forloop(5,8);


         // ArrayList<Laptop> laptopSpec = new ArrayList<>();
        // Laptop laptop1 =new Laptop("Lenovo", "IdealPad", "Metal Grey", "i7 12th Gen", 16, 512, "GTX 1660", "Windows 11", true, false, "3 Cell", 65000);

        // laptopSpec.add(laptop1);

        // laptopSpec.add(new Laptop("Dell", "Inspiron", "Performance Blue", "Ryzen 5600H", 8, 512, "GTX 1650", "Windows 11", false, false, "3 Cell", 45000));


        // System.out.println(laptopSpec);
        // //Print LaptopSpec
        // for(Laptop lap : laptopSpec ) System.out.println(lap);

        // System.out.println(laptop1.brandName + " " + laptop1.modelSeries);
        

        ArrayList<Fish> fishDetails=new ArrayList<>();
        //  Fish 1(without arguments)
        Fish fish1 = new Fish();
        fish1.fishName="Nemo";
        fish1.waterType="Salt Water";
        fish1.isSchoolingType=true;

        Region reg1 = new Region();
        reg1.regionName="Atlantic Ocean";
        reg1.nearByCountry="USA";
        fish1.region = reg1;

        fishDetails.add(fish1);


        // Fish 2 (with arguments)
        Region reg2 = new Region("Pacific Ocean", "Australia");
        Fish fish2 = new Fish("Dorry", "Salt Water", true, reg2);

        fishDetails.add(fish2);

        // Fish 3 (Getters and Setters)
        Fish fish3 = new Fish();
        fish3.setFishName("Tuna");
        fish3.setWaterType("Salt Water");
        fish3.setSchoolingType(true);
        Region reg3 = new Region();
        reg3.setRegionName("Indian Ocean");
        reg3.setNearByCountry("India");
        fish3.setRegion(reg3);
        
        System.out.println(fish3.getFishName()+ " " + fish3.getRegion().getRegionName());
        fishDetails.add(fish3);

        fishDetails.add(new Fish("Dolfins", "Salt Water", true, reg3));

        // System.out.println(Fish);
        // Print Fish Array
        for(Fish fish : fishDetails) System.out.println(fish);
    }

}