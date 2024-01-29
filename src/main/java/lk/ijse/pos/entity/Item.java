package lk.ijse.pos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @Column(name = "unitPrice", nullable = false)
    private double unitPrice;
    @Column(name = "qtyOnHand", nullable = false)
    private int qtyOnHand;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private ItemCategory category;
}
