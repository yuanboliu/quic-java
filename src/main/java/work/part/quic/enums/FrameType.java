package work.part.quic.enums;

public enum FrameType {
    UNKNOWN_FRAME,
    STREAM,
    ACK,
    RESET_STREAM,
    CONNECTION_CLOSE,
    MAX_DATA,
    MAX_STREAM_DATA,
    PING,
    BLOCKED,
    STREAM_BLOCKED,
    PADDING,
    CRYPTO
}
