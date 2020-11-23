package br.com.peca.support.mapper;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public interface AbstractMapper<ENTITY, DTO>  {

    default List<ENTITY> toListEntity(Collection<DTO> dtos) {
        return dtos == null ? Collections.emptyList() :
                dtos.stream()
                        .filter(Objects::nonNull)
                        .map(this::toEntity)
                        .collect(Collectors.toList());
    }

    default List<DTO> toListDTO(Collection<ENTITY> entities) {
        return entities == null ? Collections.emptyList() :
                entities.stream()
                        .filter(Objects::nonNull)
                        .map(this::toDTO)
                        .collect(Collectors.toList());
    }

    DTO toDTO(ENTITY entity);

    ENTITY toEntity(DTO dto);

}
