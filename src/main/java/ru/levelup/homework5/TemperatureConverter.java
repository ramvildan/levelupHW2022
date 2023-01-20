package ru.levelup.homework5;

import org.springframework.stereotype.Component;
import ru.levelup.homework5.dto.Temperature;
import ru.levelup.homework5.impl.CelsiusToFahrenheitConverter;
import ru.levelup.homework5.type.TemperatureType;

@Component
public class TemperatureConverter {

    void convertTemperature (Temperature temperatureToConvert, TemperatureType fromType, TemperatureType toType) {
        if (fromType == TemperatureType.CELSIUS && toType == TemperatureType.FAHRENHEIT) {
            CelsiusToFahrenheitConverter converter = new CelsiusToFahrenheitConverter();
            converter.convert(temperatureToConvert);
        }
    }
}
