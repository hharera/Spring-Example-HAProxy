package com.harera.springexample.haproxy.service;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.harera.springexample.haproxy.model.Country;
import com.harera.springexample.haproxy.model.CountryResponse;
import com.harera.springexample.haproxy.repository.CountryRepository;


@Service
public class CountryService {

    private ModelMapper modelMapper = new ModelMapper();
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public CountryResponse get(String countryCode) {
        Country country = countryRepository.findById(countryCode)
                .orElseThrow(() -> new RuntimeException("Country not found"));
        return modelMapper.map(country, CountryResponse.class);
    }
}
