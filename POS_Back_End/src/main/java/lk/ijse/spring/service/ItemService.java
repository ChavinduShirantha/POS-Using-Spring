package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;

import java.util.List;

/**
 * @author : Chavindu
 * created : 10/10/2023-5:23 PM
 **/

public interface ItemService {
    void saveItem(ItemDTO dto);
    void deleteItem(String id);

    List<ItemDTO> getAllItem();

    ItemDTO findItem(String id);

    void updateItem(ItemDTO c);
}
