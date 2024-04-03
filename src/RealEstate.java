import java.util.Map;

public class RealEstate {

private Estatetype type;
private double size;
private double price;

private Map<Itemtype,Integer> furniture;
private Location location;
private Exposure exposure;
private int numberOfRooms;
private boolean garage;
private boolean yard;

private RealEstate(RealEstateBuilder builder){
    this.type=builder.type;
    this.size=builder.size;
    this.price=builder.price;
    this.furniture=builder.furniture;
    this.location=builder.location;
    this.exposure=builder.exposure;
    this.numberOfRooms=builder.numberOfRooms;
    this.garage=builder.garage;
    this.yard=builder.yard;
}

    public Estatetype getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public Map<Itemtype, Integer> getFurniture() {
        return furniture;
    }

    public Location getLocation() {
        return location;
    }

    public Exposure getExposure() {
        return exposure;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isHasGarage() {
        return garage;
    }

    public boolean isYard() {
        return yard;
    }
    public static class RealEstateBuilder{
        private Estatetype type;
        private double size;
        private double price;

        private Map<Itemtype,Integer> furniture;
        private Location location;
        private Exposure exposure;
        private int numberOfRooms;
        private boolean garage;
        private boolean yard;



        public RealEstateBuilder(int numberOfRooms, double size, Estatetype type, double price) {
            this.numberOfRooms = numberOfRooms;
            this.size = size;
            this.type = type;
            this.price = price;
        }
        public RealEstateBuilder withLocation(Location location) {
            this.location = location;
            return this;
        }
            public RealEstateBuilder withExposior(Exposure exposure) {
                this.exposure = exposure;
                return this;
            }
            public RealEstateBuilder withGarage(boolean garage) {
                this.garage = garage;
                return this;
            }
            public RealEstateBuilder withYard(boolean yard) {
                this.yard = yard;
                return this;
            }
            public RealEstateBuilder withFurniture(Map<Itemtype,Integer> furniture) {
                this.furniture = furniture;
                return this;
            }

            public RealEstate build(){
            return new RealEstate(this);

        }




        }


    }







