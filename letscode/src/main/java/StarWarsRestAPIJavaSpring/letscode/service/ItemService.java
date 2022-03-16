package StarWarsRestAPIJavaSpring.letscode.service;

import StarWarsRestAPIJavaSpring.letscode.dto.ItemDTO;
import StarWarsRestAPIJavaSpring.letscode.entity.ItemEntity;

public class ItemService {
    //TODO retornar uma lista de itens
    public ItemEntity cadastrar (ItemEntity item) {
        ItemDTO.itensInventario.add(item);
        return item;
    }

    public ItemEntity negociarItens (ItemEntity item) {
        ItemDTO.itensInventario.add(item);
        return item;
    }
}
