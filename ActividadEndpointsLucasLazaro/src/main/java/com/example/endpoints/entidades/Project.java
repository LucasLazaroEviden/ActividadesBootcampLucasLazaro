package com.example.endpoints.entidades;

import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Builder
public class Project {
	
	private Long id;
	private String description;
	private String language;
	private String open;
	private List<Code> codes;
    private List<User> users; 
    private Detail detail;

    
}
