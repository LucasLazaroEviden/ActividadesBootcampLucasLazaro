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
@EqualsAndHashCode(of = "value")
@Builder
public class Phone {
    private String value;
    private String type;
    private List<Tag> tags;

}