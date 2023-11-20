package com.example.regcont.service;

import com.example.regcont.model.AsientoModel;
import com.example.regcont.model.CuentaModel;
import com.example.regcont.repository.AsientoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsientoService {

    @Autowired
    AsientoRepo asientoRepo;

    public AsientoModel crearAsiento(AsientoModel asiento) {
        return asientoRepo.save(asiento);
    }

    public List<AsientoModel> getAsientos() {
        return asientoRepo.findAll();
    }

    public Optional<AsientoModel> getAsientoById(long id) {
        return asientoRepo.findById(id);
    }

    public AsientoModel updateAsiento(AsientoModel asiento){
        return asientoRepo.save(asiento);
    }

    public void deleteAsiento(Long id) {
        asientoRepo.deleteById(id);
    }
}
