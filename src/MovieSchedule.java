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
}