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
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catId")
    private Long categoryId;

    @Column(name = "categoryName", length = 50, nullable = false)
    private String categoryName;

//    @ManyToOne
//    @JoinColumn(name = "itemId",nullable = false)
//    private ItemCategory itemCategory;

}
