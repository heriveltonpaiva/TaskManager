package br.arquitetura.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value="/tratamento")
public class TratamentoController {
	
	@RequestMapping(method=RequestMethod.GET)
    public String greeting() {
        return "Hello Word";
    }


	
}
