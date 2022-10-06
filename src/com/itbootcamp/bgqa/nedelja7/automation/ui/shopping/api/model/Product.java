package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.api.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {

    private Integer id;
    private String name;
    private String price;
    private String brand;
    private Category category;
}
