package br.com.peca.service.impl;

import java.util.List;
import java.util.Optional;

import br.com.peca.support.mapper.impl.PecaMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.peca.model.domain.Peca;
import br.com.peca.model.repository.PecaRepository;
import br.com.peca.service.PecaService;
import br.com.peca.web.dto.PecaDTO;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PecaServiceImpl implements PecaService {

    @Autowired
    private PecaRepository pecaRepository;
    @Autowired
    private PecaMapper pecaMapper;

    @Override
    public PecaDTO salvarPeca(PecaDTO pecaDTO) {
        Peca peca = pecaMapper.toEntity(pecaDTO);
        Peca pecaSalva = pecaRepository.save(peca);
        return pecaMapper.toDTO(pecaSalva);
    }

    @Override
    public List<PecaDTO> listarPecas() {
        List<Peca> pecas = pecaRepository.findAll();
        return pecaMapper.toListDTO(pecas);
    }

    @Override
    public PecaDTO detalharPeca(Integer codigo) {
        Peca peca = pecaRepository.findById(codigo).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Peça não encontrada")
        );
        return pecaMapper.toDTO(peca);
    }

    @Override
    public PecaDTO alterarPeca(Integer codigo, PecaDTO pecaDTO) {
        Peca pecaAntiga = pecaRepository.findById(codigo).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Peça não encontrada")
        );
        BeanUtils.copyProperties(pecaMapper.toEntity(pecaDTO), pecaAntiga);
        pecaAntiga.setCodigo(codigo);

        return pecaMapper.toDTO(pecaRepository.save(pecaAntiga));

    }

    @Override
    public void deletarPeca(Integer codigo) {
        pecaRepository.deleteById(codigo);
    }
}
