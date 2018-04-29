package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Repositories.UserRepository;


@Service
public class UsuarioServices {
	
	
	
	@Autowired
	UserRepository userRepository;
	
	
	public List<Usuario> findAll()
	{
		return userRepository.findAll();
	}
	

}
