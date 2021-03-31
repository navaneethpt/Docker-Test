package com.stellans.dockertest.controllers.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user_details")
@Getter
@Setter
public class User {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="id_sequence")
	@SequenceGenerator(name = "id_sequence", sequenceName = "id_sequence", initialValue = 1, allocationSize=1)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	
}
