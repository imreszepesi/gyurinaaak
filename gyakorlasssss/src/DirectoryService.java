import java.time.LocalDate;

public interface DirectoryService {

        void capturePicture(double size,String name, LocalDate date,PictureFormat format, boolean isColorized,int bitdepth);
        void captureVideo(long size, String name, LocalDate date, VideoFormat videoformat, boolean containsSubtitles,int numberOfDubs,long length,String currentDub);


}
