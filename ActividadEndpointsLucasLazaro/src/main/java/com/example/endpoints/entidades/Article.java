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
public class Article {
    private int id;
    private String title;
    private String abstracto;
    private String content;
    private List<Tag> tags;


    

}