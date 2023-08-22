package com.jaweee.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

//The purpose of the OrderLineItems class would be to encapsulate the information related to a single line item in an order.
//
//product: A reference to the product being ordered.
//quantity: The quantity of that product in the order.
//price: The price of the product at the time of the order.
//
//
//Other relevant details, such as discounts, taxes, or any additional information about the line item.
//By establishing a one-to-many relationship between the Order entity and the OrderLineItems entity using the @OneToMany
//annotation, the code allows an order to be associated with multiple line items. This reflects the real-world scenario
//where an order can consist of multiple products or items. Each Order instance will have a list (or collection)
//of OrderLineItems instances associated with it.

@Entity
@Table(name = "t_order_line_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;



}
