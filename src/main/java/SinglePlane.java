public class SinglePlane {

    Bomber bomber;
    BomberCrewComplement bomberCrewComplement;

    public SinglePlane(Bomber bomber, BomberCrewComplement bomberCrewComplement) {
        this.bomber = bomber;
        this.bomberCrewComplement = bomberCrewComplement;
    }

    public Bomber getBomber() {
        return bomber;
    }

    public void setBomber(Bomber bomber) {
        this.bomber = bomber;
    }

    public BomberCrewComplement getBomberCrewComplement() {
        return bomberCrewComplement;
    }

    public void setBomberCrewComplement(BomberCrewComplement bomberCrewComplement) {
        this.bomberCrewComplement = bomberCrewComplement;
    }

    @Override
    public String toString() {
        return "SinglePlane{" +
                "bomber=" + bomber +
                ", bomberCrewComplement=" + bomberCrewComplement +
                '}';
    }
}
