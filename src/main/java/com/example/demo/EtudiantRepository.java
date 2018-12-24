package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

	public List<Etudiant>  findByNomContains(String nom);
	
	@Query("select e from Etudiant e where e.nom like :x")
	public List<Etudiant> chercherNom(@Param("x") String nom);

	@Query("select e from Etudiant e where e.id like :x")
	public Etudiant findEtudiantById(@Param("x") Long id);
}
