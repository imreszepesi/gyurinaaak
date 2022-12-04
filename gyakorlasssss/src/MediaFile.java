import java.time.LocalDate;

public abstract class MediaFile {
    private long size;
    private String name;
    private LocalDate date;

    public MediaFile(long size, String name, LocalDate date) {
        this.size = size;
        this.name = name;
        this.date = date;
    }
    public void modifyDate(){
        this.date = LocalDate.now();
    }
    public void modifyName(String namee){
        this.name = namee;
    }
    public abstract void play();

    public long getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
