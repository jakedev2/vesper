package dev.vesper.hud.overlay;

/**
 * The Vesper logo on a 512x512 tile, as shapes fitted to logo.png: the moon is the disc A with the disc B cut out of it,
 * the spark is a four-pointed star. Each is {centre x, centre y, radius (spark: half size)}.
 */
final class Logo {
    static final int SIZE = 512;
    static final int BACKGROUND = 0xFF0F1017;
    static final float[] A = { 231.4f, 279.5f, 149.3f };
    static final float[] B = { 337.7f, 205.4f, 122.8f };
    static final float[] STAR = { 373.5f, 156.5f, 34f };
}
