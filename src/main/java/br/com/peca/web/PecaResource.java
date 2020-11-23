package br.com.peca.web;

import br.com.peca.service.PecaService;
import br.com.peca.web.dto.PecaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peca")
public class PecaResource {

    @Autowired
    private PecaService pecaService;

    //TODO: VALIDAÇÕES PELO BACK-END

    @GetMapping
    public ResponseEntity<List<PecaDTO>> listarPecas() {
        List<PecaDTO> pecas = pecaService.listarPecas();
        return ResponseEntity.ok(pecas);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<PecaDTO> detalharPeca(@PathVariable final Integer codigo) {
        PecaDTO peca = pecaService.detalharPeca(codigo);
        return ResponseEntity.ok(peca);
    }

    @PostMapping
    public ResponseEntity<PecaDTO> salvarPeca(@RequestBody final PecaDTO pecaDTO) {
        PecaDTO peca = pecaService.salvarPeca(pecaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(peca);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<PecaDTO> atualizarPeca(@PathVariable final Integer codigo, @RequestBody final PecaDTO pecaDTO) {
        PecaDTO peca = pecaService.alterarPeca(codigo, pecaDTO);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(peca);
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<PecaDTO> deletarPeca(@PathVariable final Integer codigo) {
        pecaService.deletarPeca(codigo);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
