package work.part.quic.enums;

/**
 * Packet type
 */
public enum PacketType {
    // Initial packet
    PacketTypeInitial,
    // Retry packet
    PacketTypeRetry,
    // Handshake packet
    PacketTypeHandshake,
    // 0-RTT packet
    PacketType0RTT
}
