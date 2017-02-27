package pl.sda.adapter;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-27.
 */
public class PersonToCarAdapter implements Car {
    private Person person;

    public PersonToCarAdapter(Person person) {
        this.person = person;
    }

    @Override
    public void drive() {
        person.move();
    }

    @Override
    public void horn() {
        person.say();
    }
}
