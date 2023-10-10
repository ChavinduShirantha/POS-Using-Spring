package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chavindu
 * created : 10/10/2023-5:22 PM
 **/

public interface ItemRepo extends JpaRepository<Item,String> {
}
