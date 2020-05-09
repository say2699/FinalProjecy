package kz.iitu.ex8.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private int amount;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", insertable = false, updatable = false)
    private Brands brand;


    @ManyToMany(mappedBy = "basket", fetch = FetchType.LAZY)
    private List<User> userList;








}

