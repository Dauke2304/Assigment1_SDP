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