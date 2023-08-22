package com.jaweee.productservice.controller;

import com.jaweee.productservice.dto.ProductRequest;
import com.jaweee.productservice.dto.ProductResponse;
import com.jaweee.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This annotation is applied to the class and indicates that the class is a Spring MVC controller.
@RequestMapping("/api/product") // This annotation is used to specify the base URL path for the controller's endpoints.
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping // used to specify that this method is intended to handle HTTP POST operations.
    @ResponseStatus(HttpStatus.CREATED) //  indicates the desired HTTP response status when the operation is successful.
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct() {
        return productService.getAllProduct();
    }

}
