package de.mkmstock.jpa.model.order;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="address")
@Data
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="id_article")
    private Integer idArticle;

    @Column(name="id_product")
    private Integer idProduct;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "language_id", referencedColumnName = "id")
    private Language language;

    @Column(name="comments")
    private String comments;

    @Column(name="price")
    private Double price;

    @Column(name="id_currency")
    private Integer idCurrency;

    @Column(name="currency_code")
    private String currencyCode;

    @Column(name="count")
    private Integer count;

    @Column(name="in_shopping_cart")
    private Boolean inShoppingCart;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Column(name="article_condition")
    private String condition;

    @Column(name="is_foil")
    private Boolean isFoil;

    @Column(name="is_signed")
    private Boolean isSigned;

    @Column(name="is_playset")
    private Boolean isPlayset;

    @Column(name="is_altered")
    private Boolean isAltered;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    public Integer getIdArticle() {
        return idArticle;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public Language getLanguage() {
        return language;
    }

    public String getComments() {
        return comments;
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

    public Integer getCount() {
        return count;
    }

    public Boolean getInShoppingCart() {
        return inShoppingCart;
    }

    public Product getProduct() {
        return product;
    }

    public String getCondition() {
        return condition;
    }

    public Boolean getFoil() {
        return isFoil;
    }

    public Boolean getSigned() {
        return isSigned;
    }

    public Boolean getPlayset() {
        return isPlayset;
    }

    public Boolean getAltered() {
        return isAltered;
    }
}
