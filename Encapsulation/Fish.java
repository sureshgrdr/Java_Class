    public class Fish {
        public String fishName;
        public String waterType;
        public boolean isSchoolingType;
        static String livesIn = "Water";
        public Region region;

        //Constructor
        public Fish(String fishName, String waterType, boolean isSchoolingType, Region region) {
            this.fishName = fishName;
            this.waterType = waterType;
            this.isSchoolingType = isSchoolingType;
            this.region = region;
        }

        //No arguments Constructor
    public Fish(){

    }


    // Getters and Setters
        public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public boolean isSchoolingType() {
        return isSchoolingType;
    }

    public void setSchoolingType(boolean isSchoolingType) {
        this.isSchoolingType = isSchoolingType;
    }

    public static String getLivesIn() {
        return livesIn;
    }

    public static void setLivesIn(String livesIn) {
        Fish.livesIn = livesIn;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

        // ToString
        @Override
        public String toString() {
            return "{fishName:" + fishName + ", waterType:" + waterType + ", isSchoolingType:" + isSchoolingType + ", " + region + ", livesIn:" + livesIn + "}";
        }


    }
