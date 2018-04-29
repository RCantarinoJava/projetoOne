package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repositories.UserRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UserRepository userRepository;
	
	public UsuarioController()
	{
		
	}
	
	
	@RequestMapping("/usuarios")
	public String getUsuarios(Model model)
	{
		model.addAttribute("ListaUsuario" , this.userRepository.findAll());
		
		return "usuario";
	}

}
