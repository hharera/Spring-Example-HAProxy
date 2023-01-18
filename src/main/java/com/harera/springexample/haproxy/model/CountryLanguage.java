package com.harera.springexample.haproxy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "country_language")
public class CountryLanguage {

    @Id
    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "language")
    private String language;

    @Column(name = "percentage")
    private Double percentage;
}
