package com.mycompany.controlsystemv001.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbproduct")
public class Product implements Serializable{
    @Id
    private Long id;
    private String codigoDeBarras;
    private String produto;
    private String embalagem;
    private Float preco;
    private Float quantidade;
    
    public Product() {}

    public Product(Long id, String codigoDeBarras, String produto, String embalagem, Float preco, Float quantidade) {
        this.id = id;
        this.codigoDeBarras = codigoDeBarras;
        this.produto = produto;
        this.embalagem = embalagem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Product(String codigoDeBarras, String produto, String embalagem, Float preco, Float quantidade) {
        this.codigoDeBarras = codigoDeBarras;
        this.produto = produto;
        this.embalagem = embalagem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", codigoDeBarras=" + codigoDeBarras + ", produto=" + produto + ", embalagem=" + embalagem + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
}
