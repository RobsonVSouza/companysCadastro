package com.telek.cadastrocompany.mapper;

import com.telek.cadastrocompany.dto.CompanyDto;
import com.telek.cadastrocompany.models.Companys;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CompanyMapper {


    public abstract CompanyDto toDto(Companys companyEntity);

    public abstract Companys toEntity(CompanyDto dto);

    public abstract List<CompanyDto> toListDto(List<Companys> entityList);

}
