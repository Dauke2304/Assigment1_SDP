// Movie Interface
interface Movie {
    String getTitle();
    String getType();
}

// RegularMovie Class
class RegularMovie implements Movie {
    private String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Regular";
    }
}

// Abstract Factory for Movie Creation
abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}

// Concrete Factory for Regular Movies
class RegularMovieFactory extends MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
