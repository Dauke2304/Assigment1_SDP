
interface Movie {
    String getTitle();
    String getType();
}


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


abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}


class RegularMovieFactory extends MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
