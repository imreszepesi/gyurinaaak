import java.time.LocalDate;
import java.util.Objects;

public class VideoFile extends MediaFile implements VideoService{
   private VideoFormat videoformat;
   private Boolean containsSubtitles;
   private Integer numberOfDubs;
   private String currentDub;
   private long length;

    public VideoFile(long size, String name, LocalDate date, VideoFormat videoformat, Boolean containsSubtitles, Integer numberOfDubs, String currentDub,long length) {
        super(size, name, date);
        this.videoformat = videoformat;
        this.containsSubtitles = containsSubtitles;
        this.numberOfDubs = numberOfDubs;
        this.currentDub = currentDub;
        this.length = length;
    }

    @Override
    public void play() {
        System.out.println("Playing video " + getName() );
    }

    @Override
    public void switchDub(String dub) throws NoOtherDubException {
        if(numberOfDubs == 1){
            throw new NoOtherDubException("HIBA");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFile videoFile = (VideoFile) o;
        return videoformat == videoFile.videoformat && Objects.equals(containsSubtitles, videoFile.containsSubtitles) && Objects.equals(numberOfDubs, videoFile.numberOfDubs) && Objects.equals(currentDub, videoFile.currentDub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoformat, containsSubtitles, numberOfDubs, currentDub);
    }

}
