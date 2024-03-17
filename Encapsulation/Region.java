public class Region {

    public String regionName;
    public String nearByCountry;

    //Constructor
    public Region(String regionName, String nearByCountry) {
        this.regionName = regionName;
        this.nearByCountry = nearByCountry;
    }

    // Constructor with no args
    public Region(){
        
    }

    // Getters and Setters
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getNearByCountry() {
        return nearByCountry;
    }

    public void setNearByCountry(String nearByCountry) {
        this.nearByCountry = nearByCountry;
    }


    // ToString
    @Override
    public String toString() {
        return "{regionName:" + regionName + ", nearByCountry:" + nearByCountry + "}";
    }

    
    
}
