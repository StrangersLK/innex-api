package com.kandy.innex.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    @Id
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;

}
