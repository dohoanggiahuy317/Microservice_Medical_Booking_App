package com.jaweee.productservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product") // It indicates that instances of this class will be stored as documents in a MongoDB collection named "product".
@AllArgsConstructor // It generates a constructor with arguments for all fields in the class.
@NoArgsConstructor // It generates a default constructor with no arguments.
@Builder // automatically generate a builder pattern for a class, making it easier to create instances with a large number of fields, particularly when many of these fields are optional.
@Data // It generates getter and setter methods for all fields, a toString method, an equals method, and a constructor with required arguments.
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
