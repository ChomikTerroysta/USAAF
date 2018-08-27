public  class Person {

    private String name;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nrOfCOmbatMission=" + nrOfCOmbatMission +
                ", fatigue=" + fatigue +
                '}';
    }
}
