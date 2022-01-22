package com.api_rest.estudo_rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//lombok <3
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode //tenho que estudar sobre isso 
//JPA
@Entity //mapea a classe como uma tabela no database
public class clients {
    @Id//colodca o id como chave primaria no database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //deixa a responsabilidade de incremento para o database
    private Long id;
    @Column(nullable = false)
    private String nome;
}
