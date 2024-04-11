package Abstract;

public abstract class Bank {

    private String bankName;
    private float intRate ;

    public Bank(String bankName, float intRate) {
        this.bankName = bankName;
        this.intRate = intRate;
    }

    public String getBankName(){
        return bankName;
    }

    public float getIntRate() {
        return intRate;
    }

    public void printIntRate() {
        System.out.println(getBankName() +" Interest Rate: " + getIntRate() + "%");
    }
    
}
