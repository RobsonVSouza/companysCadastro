package com.telek.cadastrocompany.service;

import com.telek.cadastrocompany.dto.CompanyDto;
import com.telek.cadastrocompany.mapper.CompanyMapper;
import com.telek.cadastrocompany.models.Companys;
import com.telek.cadastrocompany.repository.CompanyRepository;
import java.util.Optional;
import javax.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private static CompanyRepository companyRepository;

    @Autowired
    private static CompanyMapper companyMapper;


    public CompanyDto save (CompanyDto dto){
        Optional<Companys> companysEntity = companyRepository.findByCnpj(dto.getCnpj());
        if (companysEntity.isPresent()){
            throw new EntityExistsException("Já esta cadastrado");
        }
        return companyMapper.toDto(companyRepository.save(companyMapper.toEntity(dto)));
    }

}
