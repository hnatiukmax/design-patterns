package structural.facade.library;

public class VideoFile {

    private final String name;
    private final CodecType codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = CodecType.valueOf(name.substring(name.indexOf(".") + 1).toUpperCase());
    }

    public String getName() {
        return name;
    }

    public CodecType getCodecType() {
        return codecType;
    }
}
