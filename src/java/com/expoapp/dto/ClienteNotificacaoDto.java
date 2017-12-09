/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expoapp.dto;

/**
 *
 * @author yagoz
 */
public class ClienteNotificacaoDto {
    private ClienteDto cliente;
    private NotificacaoDto notificacao;

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public NotificacaoDto getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(NotificacaoDto notificacao) {
        this.notificacao = notificacao;
    }
}
