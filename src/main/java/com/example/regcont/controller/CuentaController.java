package com.example.regcont.controller;

import com.example.regcont.model.CuentaModel;
import com.example.regcont.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RestController
@RequestMapping("cuentas")
public class CuentaController {

    @Autowired
    CuentaService cuentaService;

    @PostMapping
    public CuentaModel crearCuenta(@RequestBody CuentaModel cuenta) {
        return cuentaService.crearCuenta(cuenta);
    }

    @GetMapping("/{id}")
    public CuentaModel getCuentaById(@PathVariable Long id) {
        return cuentaService.getCuentaById(id).orElse(null);
    }

    @GetMapping
    public List<CuentaModel> getCuentas() {
        return cuentaService.getCuentas();
    }

    @PutMapping
    public CuentaModel updateCuenta(@RequestBody CuentaModel cuenta){
        return cuentaService.updateCuenta(cuenta);
    }

    @DeleteMapping("/{id}")
    public void deleteCuenta(@PathVariable Long id) {
        cuentaService.deleteCuenta(id);
    }

}
