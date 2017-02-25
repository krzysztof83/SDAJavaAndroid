package pl.filmweb;

import pl.sda.bulider.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class FilmBulider {

    private Film film;
//
//    private Person rezyseria;
//    private List<Person> scenariusz;
//    private List<Gatunki> gatunek;
//    private List<Producenci> produkcja;

    public FilmBulider() {
        film = new Film();
        List<Person> scenariusz=new ArrayList<>();
    }

    public FilmBulider withRezyser(Person rezyser){
        film.setRezyseria(rezyser);
        return this;
    }

    public FilmBulider withScenarzysci(Person...persons){
       List<Person> listScenarzysci=new ArrayList<>();
        for (Person person:persons){
            listScenarzysci.add(person);
        }
        film.setScenariusz(listScenarzysci);
        return this;
    }

    public FilmBulider withGatunki(Gatunki...gatunki){
        List<Gatunki> listGatunki=new ArrayList<>();
        for (Gatunki gatunek:gatunki){
            listGatunki.add(gatunek);
        }
        film.setGatunek(listGatunki);
        return this;
    }

    public FilmBulider withProducenci(Producenci...producenci){
        List<Producenci> listProducenci=new ArrayList<>();
        for (Producenci producent:producenci){
            listProducenci.add(producent);
        }
        film.setProdukcja(listProducenci);
        return this;
    }

    public Film bulid(){
        return film;
    }


}
