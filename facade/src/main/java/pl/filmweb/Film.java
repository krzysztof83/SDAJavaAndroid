package pl.filmweb;

import pl.sda.bulider.Person;

import java.util.List;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class Film {
    private Person rezyseria;
    private List<Person> scenariusz;
    private List<Gatunki> gatunek;
    private List<Producenci> produkcja;

    public Person getRezyseria() {
        return rezyseria;
    }

    public void setRezyseria(Person rezyseria) {
        this.rezyseria = rezyseria;
    }

    public List<Person> getScenariusz() {
        return scenariusz;
    }

    public void setScenariusz(List<Person> scenariusz) {
        this.scenariusz = scenariusz;
    }

    public List<Gatunki> getGatunek() {
        return gatunek;
    }

    public void setGatunek(List<Gatunki> gatunek) {
        this.gatunek = gatunek;
    }

    public List<Producenci> getProdukcja() {
        return produkcja;
    }

    public void setProdukcja(List<Producenci> produkcja) {
        this.produkcja = produkcja;
    }

    @Override
    public String toString() {
        return "Film{" +
                "rezyseria=" + rezyseria +
                ", scenariusz=" + scenariusz +
                ", gatunek=" + gatunek +
                ", produkcja=" + produkcja +
                '}';
    }

}