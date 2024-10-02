public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;
    private int numberOfScreens;

    private CinemaConfig() {}

    public void setCinemaName(String name) {
        this.cinemaName = name;
    }

    public String getCinemaName() {
        return this.cinemaName;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public int getNumberOfScreens() {
        return this.numberOfScreens;
    }

}
