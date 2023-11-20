package com.example.regcont.repository;

import com.example.regcont.model.CuentaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepo extends JpaRepository<CuentaModel, Long> {
}
