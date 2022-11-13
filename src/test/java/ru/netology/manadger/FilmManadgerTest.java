package ru.netology.manadger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmsData;

public class FilmManadgerTest {
    FilmManadger manadger = new FilmManadger();
    FilmsData film1 = new FilmsData(11, "movie1");
    FilmsData film2 = new FilmsData(22, "movie2");
    FilmsData film3 = new FilmsData(33, "movie3");
    FilmsData film4 = new FilmsData(44, "movie4");
    FilmsData film5 = new FilmsData(55, "movie5");
    FilmsData film6 = new FilmsData(66, "movie6");
    FilmsData film7 = new FilmsData(77, "movie7");
    FilmsData film8 = new FilmsData(88, "movie8");
    FilmsData film9 = new FilmsData(99, "movie9");
    FilmsData film10 = new FilmsData(1010, "movie10");
    FilmsData film11 = new FilmsData(1111, "movie11");


    @Test
    public void testAddFilmsAndFindFilms() {

        manadger.addFilm(film1);
        manadger.addFilm(film2);
        manadger.addFilm(film3);
        manadger.addFilm(film4);
        manadger.addFilm(film5);
        manadger.addFilm(film6);
        manadger.addFilm(film7);
        manadger.addFilm(film8);
        manadger.addFilm(film9);
        manadger.addFilm(film10);
        manadger.addFilm(film11);

        FilmsData[] expected = {
                film1,
                film2,
                film3,
                film4,
                film5,
                film6,
                film7,
                film8,
                film9,
                film10,
                film11,

        };

        FilmsData[] actual = manadger.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    ;

    @Test
    public void testFindLastLimit10() {

        manadger.addFilm(film1);
        manadger.addFilm(film2);
        manadger.addFilm(film3);
        manadger.addFilm(film4);
        manadger.addFilm(film5);
        manadger.addFilm(film6);
        manadger.addFilm(film7);
        manadger.addFilm(film8);
        manadger.addFilm(film9);
        manadger.addFilm(film10);
        manadger.addFilm(film11);

        FilmsData[] expected = {
                film11,
                film10,
                film9,
                film8,
                film7,
                film6,
                film5,
                film4,
                film3,
                film2,
        };

        FilmsData[] actual = manadger.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    ;

    @Test
    public void testFindLastLimit5() {
        FilmManadger manadger = new FilmManadger(5);

        manadger.addFilm(film1);
        manadger.addFilm(film2);
        manadger.addFilm(film3);
        manadger.addFilm(film4);
        manadger.addFilm(film5);
        manadger.addFilm(film6);
        manadger.addFilm(film7);
        manadger.addFilm(film8);
        manadger.addFilm(film9);
        manadger.addFilm(film10);
        manadger.addFilm(film11);

        FilmsData[] expected = {
                film11,
                film10,
                film9,
                film8,
                film7,
        };

        FilmsData[] actual = manadger.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    ;
}
