package com.itbootcamp.bgqa.nedelja7.automation.ui.shopping.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductMapper {

    private Integer responseCode;

    private Product[] products;
}
