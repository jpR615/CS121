package weekSeven;

public class Movie {
    private String movieName;
    private String director;
    private int releaseYear;

    public Movie(String movieName, String director, int releaseYear) {
        this.movieName = movieName;
        this.director = director;
        this.releaseYear = releaseYear;
    }
    public void displayMovieInfo(){
        System.out.printf("%s\n%s\n%d\n", movieName, director, releaseYear);
    }
}
