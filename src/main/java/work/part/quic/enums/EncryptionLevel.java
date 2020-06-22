package work.part.quic.enums;

/**
 * Encryption level
 */
public enum EncryptionLevel {
    // EncryptionUnspecified is a not specified encryption level
    EncryptionUnspecified,
    // EncryptionInitial is the Initial encryption level
    EncryptionInitial,
    // EncryptionHandshake is the Handshake encryption level
    EncryptionHandshake,
    // Encryption0RTT is the 0-RTT encryption level
    Encryption0RTT,
    // Encryption1RTT is the 1-RTT encryption level
    Encryption1RTT
}
