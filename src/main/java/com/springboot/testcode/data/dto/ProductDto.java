package com.springboot.testcode.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {
    private String name;
    private int price;
    private int stock;

//    public ProductDto(String name, int price, int stock) {
//        this.name = name;
//        this.price = price;
//        this.stock = stock;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }

}
