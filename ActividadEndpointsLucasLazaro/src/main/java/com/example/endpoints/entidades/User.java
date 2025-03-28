package com.example.endpoints.entidades;

import java.util.List;

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
public class User {
    private int id;
    private String nick;
    private String name;
    private List<Article> articles;
    private List<Phone> phones;

}