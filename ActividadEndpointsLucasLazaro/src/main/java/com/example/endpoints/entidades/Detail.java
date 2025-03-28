package com.example.endpoints.entidades;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Detail {
    private Date date;
    private String content;
    private String type;
    private double budget;

    // Constructor, getters y setters
}