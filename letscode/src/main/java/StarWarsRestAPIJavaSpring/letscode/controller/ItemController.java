package StarWarsRestAPIJavaSpring.letscode.controller;

import StarWarsRestAPIJavaSpring.letscode.entity.ItemEntity;
import StarWarsRestAPIJavaSpring.letscode.entity.RebeldeEntity;
import StarWarsRestAPIJavaSpring.letscode.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/item/Controller")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<ItemEntity> cadastrar(@RequestBody ItemEntity itemEntity) {
        return ResponseEntity.ok(itemService.cadastrar(itemEntity));
    }
    @PostMapping
    public ResponseEntity<ItemEntity> negociarItens (@RequestBody ItemEntity itemEntity, @RequestBody RebeldeEntity rebelde){
//        rebelde e vejo se ele tem o item
            List<ItemEntity> inventario = rebelde.getInventario().getItens();
            //corrigir retorno
       return ResponseEntity.ok(itemService.negociarItens(itemEntity));
    }

}
