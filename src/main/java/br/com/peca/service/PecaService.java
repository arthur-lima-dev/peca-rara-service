package br.com.peca.service;

import br.com.peca.web.dto.PecaDTO;

import java.util.List;

public interface PecaService {

    PecaDTO salvarPeca(PecaDTO pecaDTO);

    List<PecaDTO> listarPecas();

    PecaDTO detalharPeca(Integer codigo);

    PecaDTO alterarPeca(Integer codigo, PecaDTO pecaDTO);

    void deletarPeca(Integer codigo);
}
