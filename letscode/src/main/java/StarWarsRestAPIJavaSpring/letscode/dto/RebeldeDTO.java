package StarWarsRestAPIJavaSpring.letscode.dto;

import br.com.letscode.rebels.dto.LocalizacaoDTO;
import StarWarsRestAPIJavaSpring.letscode.enums.Genero;

public class RebeldeDTO {

    private String nome;
    private Integer idade;
    private Genero genero;
    private Integer acusacoes = 0;
    private InventarioDTO inventario;
    private LocalizacaoDTO localizacao;
    private LocalizacaoDTO localizacaoAtualizada;


}
