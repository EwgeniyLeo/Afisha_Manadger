package ru.netology.manadger;

import ru.netology.domain.FilmsData;

public class FilmManadger {
    private FilmsData[] films = new FilmsData[0];
    private int limitFilms;

    public FilmManadger() {
        limitFilms = 10;
    }

    public FilmManadger(int limitFilms) {
        this.limitFilms = limitFilms;
    }


    public void addFilm(FilmsData film) {
        FilmsData[] tmp = new FilmsData[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmsData[] findAll() {
        return films;
    }

    public FilmsData[] findLast() {
        int resultLength;
        if (limitFilms < films.length) {
            resultLength = limitFilms;
        } else {
            resultLength = films.length;
        }

        FilmsData[] reverse = new FilmsData[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reverse[i] = films[films.length - 1 - i];
        }
        return reverse;
    }

}
