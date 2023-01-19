package ru.levelup.homework5;

import ru.levelup.homework5.dto.Temperature;
import ru.levelup.homework5.type.TemperatureType;

public interface TemperatureReceiver {

    Temperature convert(Temperature temperatureToConvert, TemperatureType fromType, TemperatureType toType);

}
