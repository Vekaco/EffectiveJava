package org.effectivejava.examples.chapter07.item44;

/**
 * An instrument section of a symphony orchestra.
 */
public enum OrchestraSection {
    /**
     * Woodwinds, such as flute,clarinet and oboe.
     */
    WOODWIND,
    /**
     * Brass instruments, such as french horn and trumpet.
     */
    BRASS,
    /**
     * percussion instruments, such as timpani and cymbals.
     */
    PERCUSSION,
    /**
     * Stringed instruments, such as violin and cello.
     * {@inheritDoc}//从超类中继承文档
     */

    STRING;
}
