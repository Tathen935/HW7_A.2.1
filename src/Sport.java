public class Sport implements Component{

    private String name;
    private int numberOfAthletes;
    private int numberOfGoldMedals;

    public Sport(String pName, int pNumberOfAthletes, int pNumberOfGoldMedals){
        name = pName;
        numberOfAthletes = pNumberOfAthletes;
        numberOfGoldMedals = pNumberOfGoldMedals;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getNumberOfAthletes() {
        System.out.println(getName() + ": " + numberOfAthletes);
    }

    public int getNumberOfAthletesTotal(){
        return numberOfAthletes;
    }

    @Override
    public void getNumberOfGoldMedals() {
        System.out.println(getName() + ": " + numberOfGoldMedals);
    }

    public int getNumberOfGoldMedalsTotal(){
        return numberOfGoldMedals;
    }

}
