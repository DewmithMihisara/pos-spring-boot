package lk.ijse.pos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemId")
    private Long itemId;

    @Column(name = "itemName", length = 50, nullable = false)
    private String itemName;

    @Column(name = "qtyOnHand", nullable = false)
    private double unitPrice;

//    @JsonIgnore
//    @OneToMany(mappedBy = "itemCategory",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    List<Item> items;
}
