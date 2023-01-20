package ru.levelup.homework5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.levelup.homework5.dto.Temperature;
import ru.levelup.homework5.impl.*;
import ru.levelup.homework5.type.TemperatureType;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);

        Temperature temperature = new Temperature(254);
        TemperatureType fromType = TemperatureType.CELSIUS;
        TemperatureType toType = TemperatureType.FAHRENHEIT;

        if (fromType == TemperatureType.CELSIUS && toType == TemperatureType.FAHRENHEIT) {
            CelsiusToFahrenheitConverter converter = context.getBean(CelsiusToFahrenheitConverter.class);
            System.out.println(temperature.getInputTemperature() + " Celsius = " + converter.convert(temperature).getInputTemperature() + " Fahrenheit");
        }

        if (fromType == TemperatureType.CELSIUS && toType == TemperatureType.KELVIN) {
            CelsiusToKelvinConverter converter = context.getBean(CelsiusToKelvinConverter.class);
            System.out.println(temperature.getInputTemperature() + " Celsius = " + converter.convert(temperature).getInputTemperature() + " Kelvin");
        }

        if (fromType == TemperatureType.KELVIN && toType == TemperatureType.CELSIUS) {
            KelvinToCelsiusConverter converter = context.getBean(KelvinToCelsiusConverter.class);
            System.out.println(temperature.getInputTemperature() + " Kelvin = " + converter.convert(temperature).getInputTemperature() + " Celsius");
        }

        if (fromType == TemperatureType.KELVIN && toType == TemperatureType.FAHRENHEIT) {
            KelvinToFahrenheitConverter converter = context.getBean(KelvinToFahrenheitConverter.class);
            System.out.println(temperature.getInputTemperature() + " Kelvin = " + converter.convert(temperature).getInputTemperature() + " Fahrenheit");
        }

        if (fromType == TemperatureType.FAHRENHEIT && toType == TemperatureType.KELVIN) {
            FahrenheitToKelvinConverter converter = context.getBean(FahrenheitToKelvinConverter.class);
            System.out.println(temperature.getInputTemperature() + " Fahrenheit = " + converter.convert(temperature).getInputTemperature() + " Kelvin");
        }

        if (fromType == TemperatureType.FAHRENHEIT && toType == TemperatureType.CELSIUS) {
            FahrenheitToCelsiusConverter converter = context.getBean(FahrenheitToCelsiusConverter.class);
            System.out.println(temperature.getInputTemperature() + " Fahrenheit = " + converter.convert(temperature).getInputTemperature() + " Celsius");
        }
    }
}
