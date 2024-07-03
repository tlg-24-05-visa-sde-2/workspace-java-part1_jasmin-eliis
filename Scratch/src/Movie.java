class Movie {
    private String title;
    private int releaseYear;
    private double revenue;
    private Genre genre;
    private Rating rating;

    // constructors - these get called when client says "new"

    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);
        setGenre(genre);
    }
    public Movie(String title, int releaseYear, double revenue, Genre genre, Rating rating) {
        //delegate to setters for any data validation/conversion they might be doing
        this(title, genre); //delegate to constructor above me for title
        setReleaseYear(releaseYear); //delegate setters for the rest of them
        setRevenue(revenue);
        setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String toString(){
        return "Title: " + title + ", Year: " + releaseYear + ", Revenue: " + revenue + ", Genre: " + genre + ", Rating: " + rating;
    }
}