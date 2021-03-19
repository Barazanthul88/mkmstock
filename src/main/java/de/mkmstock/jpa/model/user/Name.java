package de.mkmstock.jpa.model.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="name")
@Data
public class Name {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="company")
    private String company;

    @Column(name="last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getCompany() {
        return company;
    }

    public String getLastName() {
        return lastName;
    }
}
