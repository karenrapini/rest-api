package StarWarsRestAPIJavaSpring.letscode.entity;

import lombok.Data;

@Data
public class ItemEntity {

    private String nome;
    private int pontos = 0;
    private int quantidade = 1;

}
