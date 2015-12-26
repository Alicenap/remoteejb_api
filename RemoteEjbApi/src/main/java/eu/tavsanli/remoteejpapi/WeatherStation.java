package eu.tavsanli.remoteejpapi;

import javax.ejb.Remote;

@Remote
public interface WeatherStation {
    /**
     * Returns the current temperature measurement.
     *
     * @return temperature in Fahrenheit.
     */
    Double getTemperature();
}
