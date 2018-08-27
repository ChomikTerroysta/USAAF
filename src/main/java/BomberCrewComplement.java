public class BomberCrewComplement{

    private Person pilot;
    private Person navigator;
    private Person bombardier;
    private Person topGunner;
    private Person radioOperator;
    private Person ballTurretGunner;
    private Person rightTurretGunner;
    private Person leftTurretGunner;
    private Person tailGunner;

    public BomberCrewComplement(Person pilot, Person navigator, Person bombardier, Person topGunner, Person radioOperator, Person ballTurretGunner, Person rightTurretGunner, Person leftTurretGunner, Person tailGunner) {
        this.pilot = pilot;
        this.navigator = navigator;
        this.bombardier = bombardier;
        this.topGunner = topGunner;
        this.radioOperator = radioOperator;
        this.ballTurretGunner = ballTurretGunner;
        this.rightTurretGunner = rightTurretGunner;
        this.leftTurretGunner = leftTurretGunner;
        this.tailGunner = tailGunner;
    }

    public Person getPilot() {
        return pilot;
    }

    public void setPilot(Person pilot) {
        this.pilot = pilot;
    }

    public Person getNavigator() {
        return navigator;
    }

    public void setNavigator(Person navigator) {
        this.navigator = navigator;
    }

    public Person getBombardier() {
        return bombardier;
    }

    public void setBombardier(Person bombardier) {
        this.bombardier = bombardier;
    }

    public Person getTopGunner() {
        return topGunner;
    }

    public void setTopGunner(Person topGunner) {
        this.topGunner = topGunner;
    }

    public Person getRadioOperator() {
        return radioOperator;
    }

    public void setRadioOperator(Person radioOperator) {
        this.radioOperator = radioOperator;
    }

    public Person getBallTurretGunner() {
        return ballTurretGunner;
    }

    public void setBallTurretGunner(Person ballTurretGunner) {
        this.ballTurretGunner = ballTurretGunner;
    }

    public Person getRightTurretGunner() {
        return rightTurretGunner;
    }

    public void setRightTurretGunner(Person rightTurretGunner) {
        this.rightTurretGunner = rightTurretGunner;
    }

    public Person getLeftTurretGunner() {
        return leftTurretGunner;
    }

    public void setLeftTurretGunner(Person leftTurretGunner) {
        this.leftTurretGunner = leftTurretGunner;
    }

    public Person getTailGunner() {
        return tailGunner;
    }

    public void setTailGunner(Person tailGunner) {
        this.tailGunner = tailGunner;
    }

    @Override
    public String toString() {
        return "BomberCrewComplement{" +
                "pilot=" + pilot +
                ", navigator=" + navigator +
                ", bombardier=" + bombardier +
                ", topGunner=" + topGunner +
                ", radioOperator=" + radioOperator +
                ", ballTurretGunner=" + ballTurretGunner +
                ", rightTurretGunner=" + rightTurretGunner +
                ", leftTurretGunner=" + leftTurretGunner +
                ", tailGunner=" + tailGunner +
                '}';
    }
}


