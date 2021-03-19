package de.mkmstock.jpa.model.order;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="product")
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="id_game")
    private Integer idGame;

    @Column(name="image")
    private String image;

    @Column(name="en_name")
    private String enName;

    @Column(name="loc_name")
    private String locName;

    @Column(name="expansion")
    private String expansion;

    @Column(name="nr")
    private String nr;

    @Column(name="exp_icon")
    private String expIcon;

    @Column(name="rarity")
    private String rarity;

    public Integer getIdGame() {
        return idGame;
    }

    public String getImage() {
        return image;
    }

    public String getEnName() {
        return enName;
    }

    public String getLocName() {
        return locName;
    }

    public String getExpansion() {
        return expansion;
    }

    public String getNr() {
        return nr;
    }

    public String getExpIcon() {
        return expIcon;
    }

    public String getRarity() {
        return rarity;
    }
}
