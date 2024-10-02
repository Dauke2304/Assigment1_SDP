interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
}
class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;
    public StandardSchedule(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }
    public void setTime(String time) {
        this.time = time;
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