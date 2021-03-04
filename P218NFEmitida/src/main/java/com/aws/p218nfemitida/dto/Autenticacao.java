package com.aws.p218nfemitida.dto;

import lombok.Data;

/**
 * @author CleberLeão
 */
@Data
public class Autenticacao {
    private String usuario = "teste_ws";
    private String senha = "1234";
    private String conexaoid = "118";

    public Autenticacao(){

    }

    public String getUsuario() {
        return usuario;
    }


    public String getSenha() {
        return senha;
    }

    public String getConexaoid() {
        return conexaoid;
    }

}
