package StarWarsRestAPIJavaSpring.letscode.entity;

import StarWarsRestAPIJavaSpring.letscode.dto.InventarioDTO;
import br.com.letscode.rebels.dto.LocalizacaoDTO;
import br.com.letscode.rebels.enums.Genero;
import lombok.Getter;
import lombok.Setter;

public class RebeldeEntity {
    @Getter
    private String nome;
    private Integer idade;
    private Genero genero;
    private Integer acusacoes = 0;
    private InventarioDTO inventario;
    private LocalizacaoDTO localizacao;
    @Setter
    private LocalizacaoDTO localizacaoAtualizada;


    public boolean traidor(){
        if(acusacoes == 3){
            return true;
        } return false;
    }



}