public class Crew extends Person {

    private Enum role;

    public Crew(String name, String lastName, int nrOfCOmbatMission, int fatigue, Enum role) {
        super(name, lastName, nrOfCOmbatMission, fatigue);
        this.role = role;

    }

    public Enum getRole() {
        return role;
    }

    public void setRole(Enum role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "role=" + role +
                '}';
    }
}
