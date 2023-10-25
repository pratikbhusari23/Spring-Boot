package com.pb.cheapKart.Entity;

import java.util.List;      

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    private itemDetails itemDetails;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="item_id")
    private List<ItemReview> itemReview;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public itemDetails getItemDetails() {
        return this.itemDetails;
    }

    public void setItemDetails(itemDetails itemDetails) {
        this.itemDetails = itemDetails;
    }

    public List<ItemReview> getItemReview() {
        return this.itemReview;
    }

    public void setItemReview(List<ItemReview> itemReview) {
        this.itemReview = itemReview;
    }

}
