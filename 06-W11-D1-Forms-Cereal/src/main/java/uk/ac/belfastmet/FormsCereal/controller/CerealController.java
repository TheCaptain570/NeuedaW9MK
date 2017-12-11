package uk.ac.belfastmet.FormsCereal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class CerealController {

	@GetMapping("/")
	public String home() {
		return "HomePage";
	}
}
