package gr.athtech.shop.model;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;


@Data
@JacksonXmlRootElement
public class Product {
    private int id;
    private String name;
    private double price;
}
