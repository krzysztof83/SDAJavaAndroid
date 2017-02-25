package pl.sda.bulider;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class PersonBulider {
    private Person person;

    public PersonBulider() {
        person = new Person();
    }


    public PersonBulider withFirstName(String firstName){
        person.setFirstName(firstName);
        return this;
    }

    public PersonBulider withLastName(String lastName){
        person.setLastName(lastName);
        return this;
    }

    public PersonBulider withPersonAdress(PersonAddress personAdress){
        person.setAddress(personAdress);
        return this;
    }

    public PersonBulider withPesel(String pesel){
        person.setPesel(pesel);
        return this;
    }

    public Person bulid(){
        return person;
    }



}
