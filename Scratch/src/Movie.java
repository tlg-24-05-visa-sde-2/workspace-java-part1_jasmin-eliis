class Movie {
    private String title;
    private int releaseYear;
    private double revenue;

    // constructors - these get called when client says "new"
    public Movie() {
        // no operations (no-op)
    }

    public Movie(String title){
        setTitle(title);
    }
    public Movie(String title, int releaseYear, double revenue) {
        //delegate to setters for any data validation/conversion they might be doing
        this(title); //delegate to constructor above me for title
        setReleaseYear(releaseYear); //delegate setters for the rest of them
        setRevenue(revenue);
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
}