package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Chavindu
 * created : 10/10/2023-4:45 PM
 **/

public interface CustomerRepo extends JpaRepository<Customer,String> {
}
