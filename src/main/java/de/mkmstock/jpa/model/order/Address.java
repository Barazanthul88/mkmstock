package de.mkmstock.jpa.model.order;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="address")
@Data
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="extra")
    private String extra;

    @Column(name="street")
    private String street;

    @Column(name="zip")
    private String zip;

    @Column(name="city")
    private String city;

    @Column(name="country")
    private String country;

    public String getName() {
        return name;
    }

    public String getExtra() {
        return extra;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
