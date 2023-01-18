package com.harera.springexample.haproxy.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@AllArgsConstructor
@NoArgsConstructor
public class CountryDto {

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("population")
    private String population;

    @NotNull
    @JsonProperty("continent")
    private String continent;

    @NotNull
    @JsonProperty("life_expectancy")
    private String lifeExpectancy;

    @NotNull
    @JsonProperty("country_language")
    private String countryLanguage;
}
