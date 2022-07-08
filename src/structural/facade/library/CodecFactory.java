package structural.facade.library;

public class CodecFactory {

    public static Codec extract(VideoFile file) {
        CodecType type = file.getCodecType();
        switch (type) {
            case MP4:
                System.out.println("CodecFactory: extracting mpeg video...");
                return new MPEG4CompressionCodec();
            case OGG:
                System.out.println("CodecFactory: extracting ogg video...");
                return new OggCompressionCodec();
        }
        throw new IllegalArgumentException("No codec for codec type " + type);
    }
}
