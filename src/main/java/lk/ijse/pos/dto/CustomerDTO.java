package lk.ijse.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerDTO {
    private Long id;
    private String name;
    private String address;
    private double salary;
}
