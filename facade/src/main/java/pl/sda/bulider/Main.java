package pl.sda.bulider;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        PersonBulider personBulider=new PersonBulider();
        PersonAddress personAddress=new PersonAddress();
        personAddress.setCity("Poznan");
        personAddress.setStreet("Baraniaka 88");
        personAddress.setPostalCode("60-111");


        Person person=personBulider
                .withFirstName("Jan")
                .withLastName("Kowalski")
                .withPesel("887110332123")
                .withPersonAdress(personAddress)
                .bulid();


        System.out.println(person.toString());

    }
}
