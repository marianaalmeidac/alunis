package br.com.alunis.model;

import br.com.alunis.model.enums.Disposicao;

public class CheckIn {

    private Long id;
    private Integer tempoDisponivel;
    private Integer energia;
    private Integer foco;
    private Disposicao disposicao;
    private String observacao;

    public CheckIn(Integer tempoDisponivel, Integer energia, Integer foco, Disposicao disposicao) {
        this.tempoDisponivel = tempoDisponivel;
        this.energia = energia;
        this.foco = foco;
        this.disposicao = disposicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTempoDisponivel() {
        return tempoDisponivel;
    }

    public void setTempoDisponivel(Integer tempoDisponivel) {
        this.tempoDisponivel = tempoDisponivel;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getFoco() {
        return foco;
    }

    public void setFoco(Integer foco) {
        this.foco = foco;
    }

    public Disposicao getDisposicao() {
        return disposicao;
    }

    public void setDisposicao(Disposicao disposicao) {
        this.disposicao = disposicao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
