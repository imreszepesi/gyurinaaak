import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Directory implements Iterable<MediaFile>,DirectoryService{
    private Set<MediaFile> mediaFileSet = new HashSet<>();

    @Override
    public Iterator<MediaFile> iterator() {
        return mediaFileSet.iterator();
    }

    @Override
    public void capturePicture(double size, String name, LocalDate date, PictureFormat format, boolean isColorized, int bitdepth) {

    }

    @Override
    public void captureVideo(long size, String name, LocalDate date, VideoFormat videoformat, boolean containsSubtitles, int numberOfDubs, long length, Integer currentDub) {
        VideoFile videofile = new VideoFile(size,name,date,videoformat,containsSubtitles,numberOfDubs,length,currentDub);
        mediaFileSet.add(videofile);
    }
}
