package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author : Chavindu
 * created : 10/10/2023-5:11 PM
 **/

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private BigDecimal unitPrice;

}
