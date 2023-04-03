package com.daniel.back.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	  @JsonProperty("_id")
//	  private Long id;

	@JsonFormat(shape = JsonFormat.Shape.STRING)
    public LocalDateTime createdAt;
	public String CardName;
	public String avatar;
	public String Address;
	public String ZipCode;
	public String CardCode;
	
}