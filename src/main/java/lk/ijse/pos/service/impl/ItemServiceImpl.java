package lk.ijse.pos.service.impl;

import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Item;
import lk.ijse.pos.repository.ItemRepository;
import lk.ijse.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item saveItem(ItemDTO itemDTO) {
        Item item=itemRepository.findById(itemDTO.getId()).orElse(null);

        if(item==null){
            Item newItem=new Item();
            newItem.setCode(itemDTO.getId());
            newItem.setUnitPrice(itemDTO.getUnitPrice());
            newItem.setQtyOnHand(itemDTO.getQtyOnHand());
            return itemRepository.save(newItem);
        }else {
            return null;
        }
    }

    @Override
    public Item updateItem(ItemDTO itemDTO) {
        Item item=itemRepository.findById(itemDTO.getId()).orElse(null);
        if(item!=null){
            item.setUnitPrice(itemDTO.getUnitPrice());
            item.setQtyOnHand(itemDTO.getQtyOnHand());
            return itemRepository.save(item);
        }else {
            return null;
        }
    }

    @Override
    public Item deleteItem(Long id) {
        Item item=itemRepository.findById(id).orElse(null);
        if(item!=null){
            itemRepository.delete(item);
            return item;
        }else {
            return null;
        }
    }
}
