public class AppDemo {


    public static void main(String[] args) {

        Bomber bomber = new Bomber("B17J",TypeOfPlanes.BOMBER,"Enola Gay", 0, 0);
        Person person0 = new Person("Marcin", "Wyrwalski", 0,0);
        Person person1 = new Person("Micia", "Wrońska", 0,0);
        Person person2 = new Person("Kyubi", "Wroński", 0,0);
        Person person3 = new Person("Pinky", "Wrońska", 0,0);
        Person person4 = new Person("TYgrys", "Wroński", 0,0);
        Person person5 = new Person("Marta", "Bodziony", 0,0);
        Person person6 = new Person("Kasia", "Woźniak", 0,0);
        Person person7 = new Person("Klaudia", "Statcha", 0,0);
        Person person8 = new Person("Asia", "Kośka", 0,0);
        Person person9 = new Person("John", "Franke", 0,0);



        BomberCrewComplement bomberCrew = new BomberCrewComplement(person1,person2,person3,person4,person5,person6,person7,person8,person9);

       SinglePlane bomber1 = new SinglePlane(bomber, bomberCrew);

        System.out.println(bomber1);

        // TODO: 2018-08-27 add Enums to type of planes, automated generations of Person.

    }
}
