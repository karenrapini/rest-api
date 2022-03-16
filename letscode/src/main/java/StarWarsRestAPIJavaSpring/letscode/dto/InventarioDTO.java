package StarWarsRestAPIJavaSpring.letscode.dto;

import StarWarsRestAPIJavaSpring.letscode.entity.Item;

import java.util.List;

public class InventarioDTO {

    // lista que recebe itens do inventarios
    private List<Item> itens ;

    public InventarioDTO(List<Item> itens) {
        this.itens = itens;
        Item arma = new Item("Arma", 4, 1 );
        Item municao = new Item("Munição", 3, 1);
        Item comida = new Item("Comida", 1, 1);
        Item agua = new Item("Água", 2, 1);
        
        itens.add(arma);
        itens.add(municao);
        itens.add(comida);
        itens.add(agua);
    }
}
