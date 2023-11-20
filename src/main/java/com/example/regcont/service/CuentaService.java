package com.example.regcont.service;

import com.example.regcont.model.CuentaModel;
import com.example.regcont.repository.CuentaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaService {

    @Autowired
    CuentaRepo cuentaRepo;

    public CuentaModel crearCuenta(CuentaModel cuenta) {
        return cuentaRepo.save(cuenta);
    }

    public List<CuentaModel> getCuentas() {
        return cuentaRepo.findAll();
    }

    public Optional<CuentaModel> getCuentaById(long id) {
        return cuentaRepo.findById(id);
    }

    public CuentaModel updateCuenta(CuentaModel cuenta){
        return cuentaRepo.save(cuenta);
    }

    public void deleteCuenta(Long id) {
        cuentaRepo.deleteById(id);
    }
}
