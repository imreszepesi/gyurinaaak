import java.time.LocalDate;
import java.util.Objects;

public class Picture extends MediaFile{
   private PictureFormat pictureformat;
    private Boolean isColorized;
    private Integer bitDepth;

    public Picture(long size, String name, LocalDate date, PictureFormat pictureformat, Boolean isColorized, Integer bitDepth) {
        super(size, name, date);
        this.pictureformat = pictureformat;
        this.isColorized = isColorized;
        this.bitDepth = bitDepth;
    }

    @Override
    public void play() {
        System.out.println("Showing picture " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return pictureformat == picture.pictureformat && Objects.equals(isColorized, picture.isColorized) && Objects.equals(bitDepth, picture.bitDepth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pictureformat, isColorized, bitDepth);
    }
}
