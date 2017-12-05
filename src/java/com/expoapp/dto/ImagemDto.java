/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

/**
 *
 * @author baumi
 */
public class ImagemDto{
    private Integer id;
    private String link_imagem;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the link_imagem
     */
    public String getLink_imagem() {
        return link_imagem;
    }

    /**
     * @param link_imagem the link_imagem to set
     */
    public void setLink_imagem(String link_imagem) {
        this.link_imagem = link_imagem;
    }

}
