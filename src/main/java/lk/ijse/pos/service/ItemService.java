package lk.ijse.pos.service;

import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> getAllItems();
    Item getItemById(Long id);
    Item saveItem(ItemDTO itemDTO);
    Item updateItem(ItemDTO itemDTO);
    Item deleteItem(Long id);
}
