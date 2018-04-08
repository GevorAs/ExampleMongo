package com.example.mongodb.examplemongo.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "brand",
        "product",
        "expires"
})
public class Ssl implements Serializable {

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("product")
    private Object product;
    @JsonProperty("expires")
    private Integer expires;

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("product")
    public Object getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Object product) {
        this.product = product;
    }

    @JsonProperty("expires")
    public Integer getExpires() {
        return expires;
    }

    @JsonProperty("expires")
    public void setExpires(Integer expires) {
        this.expires = expires;
    }


}