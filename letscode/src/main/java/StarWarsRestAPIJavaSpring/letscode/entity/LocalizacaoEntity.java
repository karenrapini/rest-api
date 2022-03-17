package StarWarsRestAPIJavaSpring.letscode.entity;

import StarWarsRestAPIJavaSpring.letscode.dto.RebeldeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.letscode.rebels.dto.LocalizacaoDTO;

public class LocalizacaoEntity {

    @PutMapping("localizacao/{idRebelde}")
    public ResponseEntity<RebeldeEntity> atualizarLocalizacaoRebelde
            (@PathVariable String idRebelde, @RequestBody
                    LocalizacaoDTO localizacaoDto) {
        return atualizarLocalizacaoRebelde(idRebelde, localizacaoDto);
    }
}
