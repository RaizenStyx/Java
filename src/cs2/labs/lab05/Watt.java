package cs2.labs.lab05;

/**
 * File name: edu.northeaststate.cs2.labs.Watt.java
 * Lab Name: Watt Class
 * Creator Name: Connor Reed
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020
 * Creation Date: 03/20/2021
 */


/**
 * Public Watt class
 */
public class Watt {
    private double volts;
    private double amps;

    /**
     * Parameterized constructor
     * @param volts
     * @param amps
     */
    public Watt(double volts, double amps) {
        this.volts = volts;
        this.amps = amps;
    }

    /**
     * Calculates the Wattage using volts and amps
     * @return
     */
    public double calcWatts(){
        return volts * amps;
    }

}
