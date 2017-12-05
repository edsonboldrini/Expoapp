/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.controller;

import com.expoapp.dto.UsuarioDto;
import com.expoapp.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author yagoz
 */
@Controller
@RequestMapping(value = "/expoapp")
@Transactional
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @RequestMapping(value = "/Usuario/findAll", method = RequestMethod.GET)
    public @ResponseBody List<UsuarioDto> findAll() {
        List<UsuarioDto> list = service.findAll();
        return list;
    }

    @RequestMapping(value = "/Usuario/findById/{usuarioid}", method = RequestMethod.GET)
    public @ResponseBody UsuarioDto findById(@PathVariable("usuarioid") Integer usuarioid) {
        return service.findById(usuarioid);
    }

    @RequestMapping(value = "/Usuario/create", method = RequestMethod.POST)
    @ResponseBody
    public void create(@RequestBody UsuarioDto usuario) {
        service.create(usuario);
    }

    @RequestMapping(value = "/Usuario/remove/{usuarioid}", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void remove(@PathVariable("usuarioid") Integer usuarioid) {
        service.remove(usuarioid);
    }

    @RequestMapping(value = "/Usuario/edit", method = RequestMethod.POST)
    @ResponseBody
    public void edit(@RequestBody UsuarioDto usuario) {
        service.edit(usuario);
    }
}
