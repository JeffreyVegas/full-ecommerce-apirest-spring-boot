package com.jeffrey.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "price", nullable = false, precision = 6, scale = 2)
    private Double price;

    @Column(name = "compare_price", nullable = false, precision = 6, scale = 2)
    private Double comparePrice;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Column(name = "rating", nullable = false)
    private Double rating;

    @Column(name = "date_created", nullable = false)
    private LocalDateTime dateCreated;

    @Column(name = "specifications", nullable = false)
    private String specifications;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


    public String getThumbnail() {
        if (this.imgUrl != null) {
            return this.imgUrl;
        }
        return "";
    }

    @Override
    public String toString() {
        return this.name;
    }
}