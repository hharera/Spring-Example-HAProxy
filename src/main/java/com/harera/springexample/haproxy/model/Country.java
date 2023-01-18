package com.harera.springexample.haproxy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "country")
@NoArgsConstructor
@Setter
@Getter
public class Country {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private String population;

    @Column(name = "continent")
    private String continent;

    @Column(name = "life_expectancy")
    private String lifeExpectancy;

    @OneToMany(mappedBy = "countryCode", fetch = FetchType.EAGER)
    private List<CountryLanguage> countryLanguages;
}


