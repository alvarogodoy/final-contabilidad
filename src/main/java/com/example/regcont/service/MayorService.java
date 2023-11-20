package com.example.regcont.service;

import com.example.regcont.model.CuentaModel;
import com.example.regcont.model.MayorModel;
import com.example.regcont.repository.MayorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MayorService {

    @Autowired
    MayorRepo mayorRepo;

    public MayorModel crearMayor(MayorModel mayor) {
        return mayorRepo.save(mayor);
    }

    public List<MayorModel> getMayores() {
        return mayorRepo.findAll();
    }

    public Optional<MayorModel> getMayorById(long id) {
        return mayorRepo.findById(id);
    }

    public MayorModel updateMayor(MayorModel mayor){
        return mayorRepo.save(mayor);
    }

    public void deleteMayor(Long id) {
        mayorRepo.deleteById(id);
    }
}
