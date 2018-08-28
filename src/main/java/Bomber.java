public class Bomber   {




    private TypeOfPlanes typeOfPlanes;
    private String markOfPlane;
    private String nameOfPlane;
    private int damange;
    private int nrOfMissionPlaneFlown;


    public Bomber(String markOfPlane, TypeOfPlanes typeOfPlanes, String nameOfPlane, int damange, int nrOfMissionPlaneFlown) {
        this.markOfPlane = markOfPlane;
        this.nameOfPlane = nameOfPlane;
        this.damange = damange;
        this.nrOfMissionPlaneFlown = nrOfMissionPlaneFlown;
        this.typeOfPlanes = typeOfPlanes;
    }

    public TypeOfPlanes getTypeOfPlanes() {
        return typeOfPlanes;
    }

    public void setTypeOfPlanes(TypeOfPlanes typeOfPlanes) {
        this.typeOfPlanes = typeOfPlanes;
    }

    public String getMarkOfPlane() {
        return markOfPlane;
    }

    public void setMarkOfPlane(String markOfPlane) {
        this.markOfPlane = markOfPlane;
    }

    public String getNameOfPlane() {
        return nameOfPlane;
    }

    public void setNameOfPlane(String nameOfPlane) {
        this.nameOfPlane = nameOfPlane;
    }

    public int getDamange() {
        return damange;
    }

    public void setDamange(int damange) {
        this.damange = damange;
    }

    public int getNrOfMissionPlaneFlown() {
        return nrOfMissionPlaneFlown;
    }

    public void setNrOfMissionPlaneFlown(int nrOfMissionPlaneFlown) {
        this.nrOfMissionPlaneFlown = nrOfMissionPlaneFlown;
    }

    @Override
    public String toString() {
        return "Bomber{" +
                "typeOfPlanes=" + typeOfPlanes +
                ", markOfPlane='" + markOfPlane + '\'' +
                ", nameOfPlane='" + nameOfPlane + '\'' +
                ", damange=" + damange +
                ", nrOfMissionPlaneFlown=" + nrOfMissionPlaneFlown + "\n" +
                '}';
    }
}
