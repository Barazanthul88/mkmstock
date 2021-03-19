package de.mkmstock.jpa.model.user;

import de.mkmstock.jpa.model.order.Address;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="id_user")
    private Integer idUser;

    @Column(name="username")
    private String username;

    @Column(name="is_commercial")
    private Boolean isCommercial;

    @Column(name="reputation")
    private Integer reputation;

    @Column(name="sell_count")
    private Integer sellCount;

    @Column(name="on_vacation")
    private Boolean onVacation;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name_id", referencedColumnName = "id")
    private Name name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="vat")
    private String vat;

    @Column(name="registration_date")
    private LocalDateTime registrationDate;

    @Column(name="is_seller")
    private Boolean isSeller;

    @Column(name="legal_information")
    private String legalInformation;

    @Column(name="unsent_shipments")
    private Integer unsentShipments;

    @Column(name="ships_fast")
    private Integer shipsFast;

    @Column(name="sold_items")
    private Integer soldItems;

    @Column(name="avg_shipping_time")
    private Integer avgShippingTime;

    @Column(name="risk_group")
    private Integer riskGroup;

    @Column(name="loss_percentage")
    private String lossPercentage;

    public Integer getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public Boolean getIsCommercial() {
        return isCommercial;
    }

    public Integer getReputation() {
        return reputation;
    }

    public Integer getSellCount() {
        return sellCount;
    }

    public Boolean getOnVacation() {
        return onVacation;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getVat() {
        return vat;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public Boolean getSeller() {
        return isSeller;
    }

    public String getLegalInformation() {
        return legalInformation;
    }

    public Integer getUnsentShipments() {
        return unsentShipments;
    }

    public Integer getShipsFast() {
        return shipsFast;
    }

    public Integer getSoldItems() {
        return soldItems;
    }

    public Integer getAvgShippingTime() {
        return avgShippingTime;
    }

    public Integer getRiskGroup() {
        return riskGroup;
    }

    public String getLossPercentage() {
        return lossPercentage;
    }
}
