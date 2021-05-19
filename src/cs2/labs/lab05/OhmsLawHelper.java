package cs2.labs.lab05;

/**
 * File name: edu.northeaststate.cs2.labs.OhmsLawHelper.java
 * Lab Name: OhmsLawHelper
 * Creator Name: Connor Reed
 * Email: c.alexreed@gmail.com
 * Course and Section: CISP 1020
 * Creation Date: 03/20/2021
 */

/**
 * Class that provides static methods to perform various calculations using Ohm's Law
 */
public class OhmsLawHelper {
    /**
     * Calculates the current in amps using Ohm's Law
     * @param ohms resistance in ohms
     * @param volts voltage in volts
     * @return  calculated amps
     */
    public static double getAmps(double ohms, double volts){
        return volts/ohms;
    }

    /**
     * Calculates the voltage in volts using Ohm's law
     * @param ohms resistance in ohms
     * @param amps current in amps
     * @return calculated volts
     */
    public static double getVolts(double ohms, double amps){
        return amps * ohms;
    }

    /**
     * Calculates the resistance in Ohms using Ohm's Law
     * @param volts voltage in volts
     * @param amps current in amps
     * @return calculated Ohms
     */
    public static double getOhms(double volts, double amps){
        return volts/amps;
    }

    /**
     * Calculates the wattage in Ohms using Ohm's Law
     * @param volts
     * @param amps
     * @return
     */
    public static double calcWatts(double volts, double amps){
        return volts * amps;
    }

}