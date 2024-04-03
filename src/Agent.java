import java.util.ArrayList;
import java.util.List;

public class Agent {
private String firstName,lastName;
private List<RealEstate>estates=new ArrayList<>();
private Agent(){
}
private static Agent instance=null;

public static Agent getInstance(){
    if (instance==null){

        instance=new Agent();

    }
    return instance;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<RealEstate> getEstates() {
        return estates;
    }

    public void setEstates(List<RealEstate> estates) {
        this.estates = estates;
    }

    public static void setInstance(Agent instance) {
        Agent.instance = instance;
    }

    public void addEstate(RealEstate estate){

    this.estates.add (estate);

    }

    public void deleteEstate(RealEstate estate){

    this.estates.remove(estate);


    }








}
