package com.halloWord.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class HalloController {
	
@GetMapping
public String hello () {
	return 	"Hallo Generation, Mentalidades usadas foi crecimento e persistencia !!! ";
	
}


}
