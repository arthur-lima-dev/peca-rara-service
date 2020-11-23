package br.com.peca.model.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "PECA")
public class Peca implements Serializable {

    private static final long serialVersionUID = -7891221253676095947L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private Integer codigo;

    @Column(name = "NOME", length = 200, nullable = false)
    @NotBlank(message = "nome é obrigatório")
    private String nome;

    @Column(name = "VEICULO_APLICACAO", length = 200)
    private String veiculoAplicacao;

    @Column(name = "PESO_LIQUIDO", nullable = false)
    @NotNull(message = "pesoLiquido é obrigatório")
    private Double pesoLiquido;

    @Column(name = "PESO_BRUTO", nullable = false)
    @NotNull(message = "pesoBruto é obrigatório")
    private Double pesoBruto;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVeiculoAplicacao() {
        return veiculoAplicacao;
    }

    public void setVeiculoAplicacao(String veiculoAplicacao) {
        this.veiculoAplicacao = veiculoAplicacao;
    }

    public Double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(Double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public Double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }
}
