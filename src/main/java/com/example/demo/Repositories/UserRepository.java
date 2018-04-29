package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entidades.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> 
{

	//doc => https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
	
	@Query("select  u from Usuario u  where u.name like  %?1%")
	Usuario findByNameQualquercoisa(String name);
	
	
}
