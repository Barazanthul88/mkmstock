package de.mkmstock.jpa.model.order;

import de.mkmstock.jpa.model.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="orders")
@Data
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="id_order")
    private String idOrder;

    @Column(name="is_buyer")
    private Boolean isBuyer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_id", referencedColumnName = "id")
    private User seller;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    private User buyer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id", referencedColumnName = "id")
    private OrderState state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipping_method_id", referencedColumnName = "id")
    private ShippingMethod shippingMethod;

    @Column(name="tracking_number")
    private String trackingNumber;

    @Column(name="temporary_email")
    private String temporaryEmail;

    @Column(name="is_presale")
    private Boolean isPresale;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "id")
    private Address shippingAddress;

    @Column(name="article_count")
    private Integer articleCount;

    @Column(name="note")
    private String note;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "evaluation_id", referencedColumnName = "id")
    private Evaluation evaluation;

    @OneToMany(mappedBy = "order")
    private List<Article> article;

    @Column(name="article_value")
    private Double articleValue;

    @Column(name="total_value")
    private Double totalValue;

    @Column(name="id_currency")
    private Integer idCurrency;

    @Column(name="currency_code")
    private String currencyCode;

    @Column(name="service_fee_value")
    private Double serviceFeeValue;

    public String getIdOrder() {
        return idOrder;
    }

    public Boolean getBuyer() {
        return isBuyer;
    }

    public OrderState getState() {
        return state;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getTemporaryEmail() {
        return temporaryEmail;
    }

    public Boolean getPresale() {
        return isPresale;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public Integer getArticleCount() {
        return articleCount;
    }

    public String getNote() {
        return note;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public List<Article> getArticle() {
        return article;
    }

    public Double getArticleValue() {
        return articleValue;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public Integer getIdCurrency() {
        return idCurrency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Double getServiceFeeValue() {
        return serviceFeeValue;
    }

    public User getSeller() {
        return seller;
    }
}
