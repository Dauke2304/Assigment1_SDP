interface Movie {
    String getTitle();
}
class RegularMovie implements Movie {
    private String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
class IMAXMovie implements Movie {
    private String title;

    public IMAXMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}