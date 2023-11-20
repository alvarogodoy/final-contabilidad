package com.example.regcont.repository;

import com.example.regcont.model.MayorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayorRepo extends JpaRepository<MayorModel, Long> {
}
