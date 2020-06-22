package work.part.quic.io.packet;

import work.part.quic.io.frame.Frame;

import java.util.List;

/**
 * Define a packet for quic protocol.
 */
public class Packet {
    // A packet is consist of one or more frames
    private List<Frame> frameList;

    // packet id
    private long packID;

    // packet data size
    private int packLen;
}
