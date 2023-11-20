package com.example.regcont.controller;

import com.example.regcont.model.AsientoModel;
import com.example.regcont.model.MayorModel;
import com.example.regcont.service.AsientoService;
import com.example.regcont.service.MayorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RestController
@RequestMapping("libro-diario")
public class AsientoController {
    @Autowired
    AsientoService asientoService;

    @PostMapping
    public AsientoModel crearAsiento(@RequestBody AsientoModel asiento) {
        return asientoService.crearAsiento(asiento);
    }

    @GetMapping("/{id}")
    public AsientoModel getAsientoById(@PathVariable Long id) {
        return asientoService.getAsientoById(id).orElse(null);
    }

    @GetMapping
    public List<AsientoModel> getAsientos() {
        return asientoService.getAsientos();
    }

}
