package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsEmsiApplication implements CommandLineRunner{

	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MsEmsiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub 
		
	
	
	
	
	
	Formation f1= formationRepository.save(new Formation(null,"PHP",30,null))	;
	Formation f2=formationRepository.save(new Formation(null,"JAVA",30,null));	
	Formation f3=formationRepository.save(new Formation(null,"Csharp",30,null));
	etudiantRepository.save(new Etudiant(null,"Mahmoud","elmoudad",new Date(),f1 ));
	etudiantRepository.save(new Etudiant(null,"madwols","madwols",new Date(),f2));
	etudiantRepository.save(new Etudiant(null,"wiam","elmoudad",new Date(),f3));
	etudiantRepository.save(new Etudiant(null,"wiam","madwols",new Date(),f2));
	
		
	}

}

