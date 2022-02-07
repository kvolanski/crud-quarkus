package com.github.kvolanski;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

@Entity
@Data
public class Produto extends PanacheEntity {

	private String nome;

	private BigDecimal valor;
	
	@CreationTimestamp
	private Date dataCriacao;
	
	@UpdateTimestamp
	private Date dataAtualizacao;
	
}
