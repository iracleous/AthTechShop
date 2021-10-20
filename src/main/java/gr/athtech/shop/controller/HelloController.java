package gr.athtech.shop.controller;

import gr.athtech.shop.model.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping(value="productAsXML", produces= MediaType.APPLICATION_XML_VALUE)
    public Product getProduct(){
        Product product = new Product();
        product.setId(3);
        product.setName("Chips");
        product.setPrice(1.20);
        return product;
    }

    @GetMapping(value="productAsJSON", produces= MediaType.APPLICATION_JSON_VALUE)
    public Product getProduct2(){
        Product product = new Product();
        product.setId(3);
        product.setName("Chips");
        product.setPrice(1.20);
        return product;
    }

}
