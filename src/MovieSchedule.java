// MovieSchedule Interface
interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(Movie movie);
    Movie getMovie();
    void setTime(String time);
    String getTime();
}

// StandardSchedule Class
class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    @Override
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public Movie getMovie() {
        return this.movie;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String getTime() {
        return this.time;
    }

    @Override
    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
