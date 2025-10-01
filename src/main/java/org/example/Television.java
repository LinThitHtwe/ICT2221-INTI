package org.example;

/**
 * The {@code Television} class represents a simple model of a television set.
 * It stores information about the manufacturer, screen size, current power state,
 * channel, and volume. The class provides methods to control the television,
 * such as changing the channel, adjusting the volume, and toggling the power.
 */
public class Television {

    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     * Constructs a new {@code Television} object with the specified brand
     * and screen size. By default, the television is powered off,
     * set to channel 2, and volume level 20.
     *
     * @param brand      the manufacturer of the television
     * @param screenSize the screen size of the television (in inches)
     */
    public Television(String brand, int screenSize) {
        MANUFACTURER = brand;
        SCREEN_SIZE = screenSize;
        powerOn = false;
        channel = 2;
        volume = 20;
    }

    /**
     * Gets the current volume level of the television.
     *
     * @return the current volume level
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Gets the current channel of the television.
     *
     * @return the current channel
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Gets the manufacturer of the television.
     *
     * @return the manufacturer name
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * Gets the screen size of the television.
     *
     * @return the screen size in inches
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     * Sets the television to the specified channel.
     *
     * @param station the new channel number
     */
    public void setChannel(int station) {
        channel = station;
    }

    /**
     * Toggles the power state of the television.
     * If the television is currently on, it will be turned off,
     * and if it is off, it will be turned on.
     */
    public void power() {
        powerOn = !powerOn;
    }

    /**
     * Increases the volume level of the television by 1.
     */
    public void increaseVolume() {
        volume++;
    }

    /**
     * Decreases the volume level of the television by 1.
     */
    public void decreaseVolume() {
        volume--;
    }
}
