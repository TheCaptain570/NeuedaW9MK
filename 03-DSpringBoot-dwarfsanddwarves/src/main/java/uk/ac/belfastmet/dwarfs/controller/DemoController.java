package uk.ac.belfastmet.dwarfs.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/luck")
	public class DemoController {
	@GetMapping("/")
	public String disney(Model model) {
		return "Hello World";
		
		}
	@GetMapping("bb")
	public String duck(Model model) {
		return "Always Ducks";
		
		}
	@GetMapping("aa")
	public String monkey(Model model) {
		return "Banana";
		
		}
	}
