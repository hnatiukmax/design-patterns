package structural.facade.library;

public class OggCompressionCodec implements Codec {

    @Override
    public CodecType getCodecType() {
        return CodecType.OGG;
    }
}
