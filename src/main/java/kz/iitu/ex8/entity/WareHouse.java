package kz.iitu.ex8.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class WareHouse extends Product {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    private int amount;


    @OneToMany(mappedBy = "wareHouse", fetch = FetchType.LAZY)
    private List<Brands> yourList;



}
