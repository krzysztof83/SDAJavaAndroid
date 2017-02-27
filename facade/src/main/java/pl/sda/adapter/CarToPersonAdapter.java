package pl.sda.adapter;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-27.
 */
public class CarToPersonAdapter implements Person{
    private Car car;

    public CarToPersonAdapter(Car car) {
        this.car = car;
    }


    @Override
    public void move() {
        car.drive();
    }

    @Override
    public void say() {
        car.horn();
    }
}
