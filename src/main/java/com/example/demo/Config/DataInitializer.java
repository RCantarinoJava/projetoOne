package com.example.demo.Config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Repositories.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {

	
	//CDI
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {	
		
		List<Usuario> lista = userRepository.findAll();
		if(lista.isEmpty())
		{
			CreateUsuario(new Usuario("Renato Cantarino","renato.cantarino@gmail.com"));		
			
		}		
		
		Usuario uset = userRepository.findByNameQualquercoisa("cant");
		System.out.println(uset.getName());
		
		
		
		
	}	
	
	public void CreateUsuario(Usuario usuario)
	{
		userRepository.save(usuario);
	}
}
