package day31_Constructors.movieTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, genre, releaseData, director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, String releaseData, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseData = releaseData;
        this.director = director;
        casts = new ArrayList<>();
    }

    public void addCast(String name){
        casts.add(name);
    }

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseData='" + releaseData + '\'' +
                ", total number of casts=" + casts.size() + '\'' +
                '}';
    }
}
/*
3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Gene (String), releaseDate (String),
	        director (String), casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts

    3.2 create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie

 */