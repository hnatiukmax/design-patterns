package structural.facade.library;

public class MPEG4CompressionCodec implements Codec {

    @Override
    public CodecType getCodecType() {
        return CodecType.MP4;
    }
}
