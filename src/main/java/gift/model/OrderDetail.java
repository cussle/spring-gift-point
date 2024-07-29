package gift.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "orderdetail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Option option;
    private int quantity;
    private String message;
    private LocalDateTime orderDateTime;

    public OrderDetail(Option option, int quantity, String message, LocalDateTime orderDateTime) {
        this.option = option;
        this.quantity = quantity;
        this.message = message;
        this.orderDateTime = orderDateTime;
    }

    protected OrderDetail() {

    }

    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public String getMessage() {
        return message;
    }

    public Option getOption() {
        return option;
    }

}
