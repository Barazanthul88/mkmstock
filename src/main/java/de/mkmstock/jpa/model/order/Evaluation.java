package de.mkmstock.jpa.model.order;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="evaluation")
@Data
public class Evaluation {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="evaluation_grade")
    private String evaluationGrade;

    @Column(name="item_description")
    private String itemDescription;

    @Column(name="packaging")
    private String packaging;

    @Column(name="comment")
    private String comment;

    public String getEvaluationGrade() {
        return evaluationGrade;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getPackaging() {
        return packaging;
    }

    public String getComment() {
        return comment;
    }
}
