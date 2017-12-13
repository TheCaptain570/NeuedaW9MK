package uk.ac.belfastmet.FormsCereal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.FormsCereal.domain.Cereals;
import uk.ac.belfastmet.FormsCereal.repositories.CerealRepository;


@Controller
@RequestMapping("/")
public class CerealController {

	
	@Autowired
	CerealRepository cerealRepository;

	public CerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle","HomePage");
		model.addAttribute("cerealRepository",cerealRepository.findAll());
		return "HomePage";
	}
	
	@GetMapping("/cereal/view/{cereal_id}")
	public String view(@PathVariable("cereal_id") Integer cereal_id, Model model) {
		model.addAttribute("pageTitle","View Cereal");
		model.addAttribute("cerealRepository",cerealRepository.findOne(cereal_id));
		return "View";
	}
	
	@GetMapping("/cereal/add/")
	public String add(Model model) {
		model.addAttribute("pageTitle","Add Cereal");
		model.addAttribute("cereal",new Cereals());
		return "Add";
	}
	@PostMapping("/cereal/save/")
	public String save(@Valid Cereals cereal, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return "Add";
		}
		else {
		Cereals savedCereal = cerealRepository.save(cereal);
		return "redirect:/cereal/view/" + savedCereal.getCereal_id();}
	}
	@GetMapping("/cereal/edit/{cereal_id}")
	public String edit(@PathVariable("cereal_id") Integer cereal_id,Model model) {
		model.addAttribute("pageTitle","Edit Cereal");
		model.addAttribute("cerealRepository",cerealRepository.findOne(cereal_id));
		return "edit";
	}
	@GetMapping("/cereal/delete/{cereal_id}")
	public String delete(@PathVariable("cereal_id") Integer cereal_id, 
			RedirectAttributes redirectAttrs ) {
		redirectAttrs.addFlashAttribute("message", "Cereal was deleted");
		cerealRepository.delete(cereal_id);
		return "redirect:/";
	}
}
