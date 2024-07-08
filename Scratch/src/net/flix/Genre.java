package net.flix;

enum Genre {
    ANIME("Anime"),
    DRAMA("Drama"),
    HORROR("HORROR"),
    ROMANTIC_COMEDY("Romantic Comedy :*"),
    DOCUMENTARY("Documentary"),
    MYSTERY("Mystery"),
    SCI_FI("Sci-Fi"),
    INTERNATIONAL("Global");

    // everything under here is just regular class stuff, i.e fields, constructors, methods
    private String display;

    //constructor --implicitly private -- no "new" from outside
    Genre(String display) {
        System.out.println("Genre constructor called");
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }


}