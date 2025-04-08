package Demo;
import  java.util.*;
public class PhotonSecondRound {

    public static void main(String[] args) {

        List<Movie> list = Arrays.asList(new Movie("Singham",3.5) , new Movie("Ringham",9.2),new Movie("Sooryavanshi",5.1));

        //Collections.sort(list,new NameComparator());

//        Collections.sort(list,new RatingComparator());
//
//        Collections.sort(list,new NameAndRatingComparator());
//


        Collections.sort(list);

        for (Movie m : list) {
            System.out.println(m.getName() + "," +m .getRating());
        }
    }

}



class Movie implements Comparable<Movie>{
    private String name ;
    private Double rating;

    public Movie(String name, Double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.getName());
    }
}

class NameComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class RatingComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getRating().compareTo(o1.getRating());
    }
}

class NameAndRatingComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return (o1.getName()+o1.getRating()).compareTo(o2.getName()+o2.getRating());
    }
}

