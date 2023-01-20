package ru.levelup.homework5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.levelup.homework5.dto.Temperature;
import ru.levelup.homework5.impl.*;
import ru.levelup.homework5.type.TemperatureType;

@SpringBootApplication
public class Application {

    public static final TemperatureType CELSIUS = TemperatureType.CELSIUS;
    public static final TemperatureType FAHRENHEIT = TemperatureType.FAHRENHEIT;
    public static final TemperatureType KELVIN = TemperatureType.KELVIN;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);

        Temperature temperature = new Temperature(254);
        TemperatureType fromType = CELSIUS;
        TemperatureType toType = FAHRENHEIT;

        if (fromType == CELSIUS && toType == FAHRENHEIT) {
            CelsiusToFahrenheitConverter converter = context.getBean(CelsiusToFahrenheitConverter.class);
            System.out.printf("%s %s = %s %s", temperature.getInputTemperature(), CELSIUS.getValue(), converter.convert(temperature).getInputTemperature(), FAHRENHEIT.getValue());
        }

        if (fromType == CELSIUS && toType == KELVIN) {
            CelsiusToKelvinConverter converter = context.getBean(CelsiusToKelvinConverter.class);
            System.out.printf("%s %s = %s %s", temperature.getInputTemperature(), CELSIUS.getValue(), converter.convert(temperature).getInputTemperature(), KELVIN.getValue());
        }

        if (fromType == KELVIN && toType == CELSIUS) {
            KelvinToCelsiusConverter converter = context.getBean(KelvinToCelsiusConverter.class);
            System.out.printf("%s %s = %s %s", temperature.getInputTemperature(), KELVIN.getValue(), converter.convert(temperature).getInputTemperature(), CELSIUS.getValue());
        }

        if (fromType == KELVIN && toType == FAHRENHEIT) {
            KelvinToFahrenheitConverter converter = context.getBean(KelvinToFahrenheitConverter.class);
            System.out.printf("%s %s = %s %s", temperature.getInputTemperature(), KELVIN.getValue(), converter.convert(temperature).getInputTemperature(), FAHRENHEIT.getValue());
        }

        if (fromType == FAHRENHEIT && toType == KELVIN) {
            FahrenheitToKelvinConverter converter = context.getBean(FahrenheitToKelvinConverter.class);
            System.out.printf("%s %s = %s %s", temperature.getInputTemperature(), FAHRENHEIT.getValue(), converter.convert(temperature).getInputTemperature(), KELVIN.getValue());
        }

        if (fromType == FAHRENHEIT && toType == CELSIUS) {
            FahrenheitToCelsiusConverter converter = context.getBean(FahrenheitToCelsiusConverter.class);
            System.out.printf("%s %s = %s %s", temperature.getInputTemperature(), FAHRENHEIT.getValue(), converter.convert(temperature).getInputTemperature(), CELSIUS.getValue());
        }
    }
}
