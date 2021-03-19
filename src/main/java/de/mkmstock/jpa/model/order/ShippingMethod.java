package de.mkmstock.jpa.model.order;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="shipping_method")
@Data
public class ShippingMethod {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="id_shipping_method")
    private Integer idShippingMethod;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private Double price;

    @Column(name="id_currency")
    private Integer idCurrency;

    @Column(name="currency_code")
    private String currencyCode;

    @Column(name="is_letter")
    private Boolean isLetter;

    @Column(name="is_insured")
    private Boolean isInsured;

    public Integer getIdShippingMethod() {
        return idShippingMethod;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Boolean getLetter() {
        return isLetter;
    }

    public Boolean getInsured() {
        return isInsured;
    }
}
