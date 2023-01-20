package ru.levelup.homework5.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TemperatureType {
    CELSIUS ("Celsius"),
    FAHRENHEIT ("Fahrenheit"),
    KELVIN ("Kelvin");

    @Getter
    private final String value;
}
