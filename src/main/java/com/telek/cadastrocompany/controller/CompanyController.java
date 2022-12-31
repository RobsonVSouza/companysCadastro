package com.telek.cadastrocompany.controller;


import com.telek.cadastrocompany.dto.CompanyDto;
import com.telek.cadastrocompany.service.CompanyService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyDto> save (@RequestBody @Valid CompanyDto companyDto){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.save(companyDto));
    }
}
