package work.part.quic.io.frame;

public class Frame {
    private final FrameType type;

    public Frame(FrameType type) {
        this.type = type;
    }

    public FrameType getType() {
        return type;
    }
}
