package com.example.Persona.controllers;

import com.example.Persona.entities.Autor;
import com.example.Persona.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
