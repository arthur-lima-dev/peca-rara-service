package br.com.peca.support.mapper.impl;

import br.com.peca.model.domain.Peca;
import br.com.peca.support.mapper.AbstractMapper;
import br.com.peca.web.dto.PecaDTO;
import org.springframework.stereotype.Component;

@Component
public class PecaMapper implements AbstractMapper<Peca, PecaDTO> {

    @Override
    public PecaDTO toDTO(Peca peca) {
        if(peca == null) return null;

        PecaDTO pecaDTO = new PecaDTO();
        pecaDTO.setCodigo(peca.getCodigo());
        pecaDTO.setNome(peca.getNome());
        pecaDTO.setVeiculoAplicacao(peca.getVeiculoAplicacao());
        pecaDTO.setPesoBruto(peca.getPesoBruto());
        pecaDTO.setPesoLiquido(peca.getPesoLiquido());

        return pecaDTO;
    }

    @Override
    public Peca toEntity(PecaDTO pecaDTO) {
        if(pecaDTO == null) return null;

        Peca peca = new Peca();
        peca.setCodigo(pecaDTO.getCodigo());
        peca.setNome(pecaDTO.getNome());
        peca.setVeiculoAplicacao(pecaDTO.getVeiculoAplicacao());
        peca.setPesoBruto(pecaDTO.getPesoBruto());
        peca.setPesoLiquido(pecaDTO.getPesoLiquido());

        return peca;
    }
}
