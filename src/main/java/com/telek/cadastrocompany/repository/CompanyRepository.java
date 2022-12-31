package com.telek.cadastrocompany.repository;

import com.telek.cadastrocompany.models.Companys;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CompanyRepository extends JpaRepository <Companys, Long>{

    Optional <Companys> findByCnpj(String cnpj);
}
