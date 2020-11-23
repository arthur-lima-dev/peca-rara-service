package br.com.peca.web.dto;

import java.io.Serializable;

public class PecaDTO implements Serializable {

    private static final long serialVersionUID = 8605326151629595310L;
    private Integer codigo;
    private String nome;
    private String veiculoAplicacao;
    private Double pesoLiquido;
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
