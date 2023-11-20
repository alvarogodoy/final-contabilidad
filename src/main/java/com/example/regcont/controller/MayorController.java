package com.example.regcont.controller;

import com.example.regcont.model.MayorModel;
import com.example.regcont.service.MayorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RestController
@RequestMapping("mayor")
public class MayorController {

    @Autowired
    MayorService mayorService;

    @PostMapping
    public MayorModel crearMayor(@RequestBody MayorModel mayor) {
        return mayorService.crearMayor(mayor);
    }

    @GetMapping("/{id}")
    public MayorModel getMayorById(@PathVariable Long id) {
        return mayorService.getMayorById(id).orElse(null);
    }

    @GetMapping
    public List<MayorModel> getMayor() {
        return mayorService.getMayores();
    }

    @PutMapping
    public MayorModel updateMayor(@RequestBody MayorModel mayor){
        return mayorService.updateMayor(mayor);
    }

    @DeleteMapping("/{id}")
    public void deleteMayor(@PathVariable Long id) {
        mayorService.deleteMayor(id);
    }
}
