package eu.tavsanli.remoteejpapi;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public interface WeatherStation {
    /**
     * Returns the current temperature measurement.
     *
     * @return temperature in Fahrenheit.
     */
    Long getTemperature();
}
