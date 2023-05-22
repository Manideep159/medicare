package com.example.medicare.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Medicine {
    @Id
    @GeneratedValue

    private int id;

    private String description;

    private String category;

    private String price;

    private String imageUrl;

    public Medicine() {
    }

    public Medicine(int id, String description, String category, String price, String imageUrl) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public void setImageURL(String url) {
    }
}

