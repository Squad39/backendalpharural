package br.com.recode.backendalpharural.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "apoiadores")
@Getter
@Setter
public class ApoiadorAlpha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoApoiador;

    private String nome;

    private String formacao;

    private String email;

    private int telefone;

    private Date dataNascimento;

    private String descricaoPessoal;
    
}
