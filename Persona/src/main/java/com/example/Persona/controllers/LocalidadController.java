package com.example.Persona.controllers;

import com.example.Persona.entities.Localidad;
import com.example.Persona.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/localidades")
public abstract class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
