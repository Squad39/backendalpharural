package br.com.recode.backendalpharural.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.recode.backendalpharural.Models.ApoiadorAlpha;

@Repository
public interface ApoiadorRepositorio extends CrudRepository<ApoiadorAlpha, Long>{
    
}
