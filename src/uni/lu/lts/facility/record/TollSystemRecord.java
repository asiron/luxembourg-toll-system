/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.lu.lts.facility.record;

import com.sun.org.glassfish.external.statistics.TimeStatistic;
import java.util.Date;
import uni.lu.lts.facility.Section;
import uni.lu.lts.facility.TollFacility;
import uni.lu.lts.facility.sensor.Image;
import uni.lu.lts.vehicle.Vehicle;

/**
 *
 * @author asiron
 */
public class TollSystemRecord extends Record {
    
    private final float calculatedPrice;
    private final Vehicle vehicleRef;

    public TollSystemRecord(float calculatedPrice, Vehicle vehicleRef, Section section, TollFacility facility, Integer sensorID, Date timestamp, Image image) {
        super(section, facility, sensorID, timestamp, image);
        this.calculatedPrice = calculatedPrice;
        this.vehicleRef = vehicleRef;
    }
 
    /**
     * Get the value of vehicleRef
     *
     * @return the value of vehicleRef
     */
    public Vehicle getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Get the value of calculatedPrice
     *
     * @return the value of calculatedPrice
     */
    public float getCalculatedPrice() {
        return calculatedPrice;
    }
    
    @Override
    public String toString() {
        return "(" + timestamp + ", " + calculatedPrice + ", " 
                + vehicleRef + ", " + zone.getFirst() + ", " + zone.getSecond(); 
    }
 }
