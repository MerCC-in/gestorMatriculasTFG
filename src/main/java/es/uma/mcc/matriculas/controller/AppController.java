package es.uma.mcc.matriculas.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import es.uma.mcc.matriculas.model.Usuario;
import es.uma.mcc.matriculas.repository.UsuarioRepository;


@Controller
public class AppController {
	
	@Autowired
    private UsuarioRepository userRepo;
	
	@GetMapping({"/","/login","/login?error=true","/login?logout"})
	public String index(Model model) {
		//model.addAttribute("usuario", new Usuario()); 
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}