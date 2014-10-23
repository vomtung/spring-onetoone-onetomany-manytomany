package com.vomtung.relationmapping.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import com.vomtung.relationmapping.entity.SchoolClass;
import com.vomtung.relationmapping.service.SchoolClassService;

public class SchoolClassConverter implements Converter<String, SchoolClass>{

    @Autowired
    private SchoolClassService schoolClassService;

    public SchoolClass convert(String id) {
        return schoolClassService.findById(Long.valueOf(id));
    }
}
