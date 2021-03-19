package de.mkmstock.jpa.model.order;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="article_language")
@Data
public class Language {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="id_language")
    private Integer idLanguage;

    @Column(name="language_name")
    private String languageName;

    public Integer getIdLanguage() {
        return idLanguage;
    }

    public String getLanguageName() {
        return languageName;
    }
}
