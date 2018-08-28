public class AppDemo {


    public static void main(String[] args) {

        Bomber bomber = new Bomber("B17J",TypeOfPlanes.BOMBER,"Enola Gay", 0, 0);
        Person person0 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person1 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person2 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person3 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person4 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person5 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person6 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person7 = new Person(Person.randomName(), Person.randomLastName(), 0,0);
        Person person8 = new Person(Person.randomName(), Person.randomLastName(), 0,0);




        BomberCrewComplement bomberCrew = new BomberCrewComplement(person1,person2,person3,person4,person5,person6,person7,person8,person0);

       SinglePlane bomber1 = new SinglePlane(bomber, bomberCrew);

        System.out.println(bomber1);

        // TODO: 2018-08-28 generate squadron, add some logi to plane usage - setting to fly mison. 
        

    }
}
