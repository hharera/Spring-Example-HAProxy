package com.harera.springexample.haproxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harera.springexample.haproxy.model.CountryDto;
import com.harera.springexample.haproxy.service.CountryService;


@RestController
@RequestMapping
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<CountryDto> getCountryInfo(@PathVariable(name = "code") String code) {
        CountryDto countryDto = countryService.get(code);
        if (null == countryDto) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(countryDto);
    }
}
