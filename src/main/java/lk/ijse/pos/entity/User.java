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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usrId")
    private Long userId;
    @Column(name = "usrName", length = 50, nullable = false)
    private String userName;
    @Column(name = "password", length = 50, nullable = false)
    private String password;
    @Column(name = "role", length = 50, nullable = false)
    private String role;
}
