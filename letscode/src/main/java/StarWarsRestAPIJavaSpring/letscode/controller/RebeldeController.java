package StarWarsRestAPIJavaSpring.letscode.controller;


public class RebeldeController {

    @PostMapping
    @ApiOperation(value = "Adicionar novo rebelde")
    public ResponseEntity<Rebelde> adicionar(@RequestBody @Valid RebeldeDTO rebeldeDto) {
        Rebelde novoRebelde = rebeldeService.adicionarRebelde(rebeldeDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novoRebelde.getId()).toUri();
        return ResponseEntity.created(uri).body(novoRebelde);
    }

    @PatchMapping("/reportar-traidor")
    @ApiOperation(value = "Reportar um determinado rebelde de traidor")
    public ResponseEntity<Void> reportarTraidor(@RequestParam(value = "traidor") String traidor) {
        rebeldeService.reportarTraidor(traidor);
        return ResponseEntity.noContent().build();
    }


}
