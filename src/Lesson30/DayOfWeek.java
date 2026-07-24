package Lesson30;

public class DayOfWeek implements Comparable<DayOfWeek> {
    private int id;
    private String dayOfWeek;

    public DayOfWeek(int id, String dayOfWeek) {
        this.id = id;
        this.dayOfWeek = dayOfWeek;
    }

    public int getId() {
        return id;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public int compareTo(DayOfWeek o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return id + " - " + dayOfWeek;
    }
}
