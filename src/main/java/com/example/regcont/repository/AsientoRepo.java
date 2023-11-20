package com.example.regcont.repository;

import com.example.regcont.model.AsientoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsientoRepo extends JpaRepository<AsientoModel, Long> {
}
