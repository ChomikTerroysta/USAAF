import java.util.Random;

public  class Person {

    private String name = randomName();
    private String lastName;
    private int nrOfCOmbatMission;
    private int fatigue;

    public Person(String name, String lastName, int nrOfCOmbatMission, int fatigue) {
        this.name = name;
        this.lastName = lastName;
        this.nrOfCOmbatMission = nrOfCOmbatMission;
        this.fatigue = fatigue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNrOfCOmbatMission() {
        return nrOfCOmbatMission;
    }

    public void setNrOfCOmbatMission(int nrOfCOmbatMission) {
        this.nrOfCOmbatMission = nrOfCOmbatMission;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name  +
                ", lastName='" + lastName + '\'' +
                ", nrOfCOmbatMission=" + nrOfCOmbatMission +
                ", fatigue=" + fatigue + "\n";
    }

    public static String randomName(){
        String[] str = {"Marcin", "Jakub","Mikołaj", "Piotr", "Jan", "Marta", "Katarzyna", "Joanna", "Marzena", "Elżbieta"};
        Random rand = new Random();
        int x = rand.nextInt(str.length -1);
        return str[x];
    }

    public static String randomLastName(){
        String[] str = {"Ciesielski", "Tokarski","Stolarski", "Spawarski", "Rura", "Browarski", "Tagalski", "Nonalski", "Yosarian", "Wroński"};
        Random rand = new Random();
        int x = rand.nextInt(str.length -1);
        return str[x];
    }
}
