interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
}
class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;
}