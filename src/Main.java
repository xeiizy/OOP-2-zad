// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

RealEstate estate=new RealEstate.RealEstateBuilder(5,120,Estatetype.HOUSE,120000).withGarage(true).withYard(false).build();


Agent.getInstance().addEstate(estate);
        System.out.println(Agent.getInstance().getEstates());
        Agent.getInstance().deleteEstate(estate);
        System.out.println(Agent.getInstance().getEstates());













    }
}