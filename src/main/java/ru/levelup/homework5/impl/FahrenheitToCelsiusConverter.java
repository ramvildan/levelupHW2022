package ru.levelup.homework5.impl;

import org.springframework.stereotype.Component;
import ru.levelup.homework5.TemperatureReceiver;
import ru.levelup.homework5.dto.Temperature;
import ru.levelup.homework5.type.TemperatureType;

@Component
public class FahrenheitToCelsiusConverter implements TemperatureReceiver {

    @Override
    public Temperature convert(Temperature temperatureToConvert, TemperatureType fromType, TemperatureType toType) {
        return null;
    }
}
