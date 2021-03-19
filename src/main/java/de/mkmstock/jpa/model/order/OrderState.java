package de.mkmstock.jpa.model.order;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="order_state")
@Data
public class OrderState {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="state")
    private String state;

    @Column(name="date_bought")
    private LocalDateTime dateBought;

    @Column(name="date_paid")
    private LocalDateTime datePaid;

    @Column(name="date_sent")
    private LocalDateTime dateSent;

    @Column(name="date_received")
    private LocalDateTime dateReceived;

    @Column(name="date_canceled")
    private LocalDateTime dateCanceled;

    @Column(name="reason")
    private String reason;

    @Column(name="was_merged_into")
    private Integer wasMergedInto;

    public String getState() {
        return state;
    }

    public LocalDateTime getDateBought() {
        return dateBought;
    }

    public LocalDateTime getDatePaid() {
        return datePaid;
    }

    public LocalDateTime getDateSent() {
        return dateSent;
    }

    public LocalDateTime getDateReceived() {
        return dateReceived;
    }

    public LocalDateTime getDateCanceled() {
        return dateCanceled;
    }

    public String getReason() {
        return reason;
    }

    public Integer getWasMergedInto() {
        return wasMergedInto;
    }
}
