package com.telek.cadastrocompany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyDto {

    private Long id;
    private String cnpj;
    private String nameCompany;

}
