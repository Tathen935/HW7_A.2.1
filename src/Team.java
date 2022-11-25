import java.util.ArrayList;

public class Team implements Component {

    private String name;

    private ArrayList<Component> children = new ArrayList<Component>();

    public Team(String pName){
        name = pName;
    }

    public void add(Component c){
        if(c != null) {
            children.add(c);
        }
    }

    public void remove(Component c){
        children.remove(c);
    }

    public ArrayList<Component> getChildren(){
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNumberOfAthletes() {
        System.out.println(getName() + ":");
        for(Component c : children){
            c.getNumberOfAthletes();
        }
    }

    public int getNumberOfAthletesTotal(){
        int x = 0;
        for(Component c : children){
            x = x + c.getNumberOfAthletesTotal();
        }
        return x;
    }

    @Override
    public void getNumberOfGoldMedals() {
        System.out.println(getName() + ":");
        for(Component c : children){
            c.getNumberOfGoldMedals();
        }
    }

    public int getNumberOfGoldMedalsTotal(){
        int x = 0;
        for(Component c : children){
            x = x + c.getNumberOfGoldMedalsTotal();
        }
        return x;
    }
}
