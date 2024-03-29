package ru.levelup.homework5.impl;

import org.springframework.stereotype.Component;
import ru.levelup.homework5.TemperatureReceiver;
import ru.levelup.homework5.dto.Temperature;
import ru.levelup.homework5.type.TemperatureType;

@Component
public class CelsiusToFahrenheitConverter implements TemperatureReceiver {

    @Override
    public Temperature convert(Temperature temp) {
        return new Temperature(temp.getInputTemperature() * 9/5 + 32);
    }
}
