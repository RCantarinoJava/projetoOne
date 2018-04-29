package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Services.UsuarioServices;





@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioServices usuarioService;
	
	public UsuarioController()
	{
		
	}
	
	
	@RequestMapping("/usuarios")
	public String getUsuarios(Model model)
	{
		model.addAttribute("ListaUsuario" , this.usuarioService.findAll());
		
		return "usuario";
	}
	
	public String getMsg()
	{
		System.out.println("Aqui");
		
		return "usuario";
	}

}
