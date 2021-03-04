package com.aws.p218nfemitida.dto;

import lombok.Data;
import org.json.JSONObject;
import org.json.XML;

/**
 * @author CleberLeão
 */
@Data
public class Consulta {

    private String versao = "1.00";
    private Autenticacao autenticacao = new Autenticacao();
    private String tiposervico = "0";
    private String chavedeacesso;
    private String marcadagua = "2";
    private String codigoevento;
    private String retornarxml = "0";

    public Consulta(){

    }

    public String getVersao() {
        return versao;
    }

    public Autenticacao getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(Autenticacao autenticacao) {
        this.autenticacao = autenticacao;
    }

    public String getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(String tiposervico) {
        this.tiposervico = tiposervico;
    }

    public String getChavedeacesso() {
        return chavedeacesso;
    }

    public void setChavedeacesso(String chavedeacesso) {
        this.chavedeacesso = chavedeacesso;
    }

    public String getMarcadagua() {
        return marcadagua;
    }

    public String getCodigoevento() {
        return codigoevento;
    }

    public void setCodigoevento(String codigoevento) {
        this.codigoevento = codigoevento;
    }

    public String getRetornarxml() {
        return retornarxml;
    }

    public String geraXml(){

        String xmlString =

                        "<versao>"+ this.versao +"</versao>"+
                                "<autenticacao>" +
                        "<usuario>"+ this.autenticacao.getUsuario()+"</usuario>" +
                        "<senha>"+ this.autenticacao.getSenha() +"</senha>" +
                        "<conexaoid>"+ this.autenticacao.getConexaoid() +"</conexaoid>" +
                        "</autenticacao>" +
                        "<tiposervico>"+ this.tiposervico +"</tiposervico>" +
                        "<chaveacesso>"+ this.chavedeacesso +"</chaveacesso>" +
                        "<marcadagua>"+ this.marcadagua +"</marcadagua>" +
                        "<codigoevento>"+ this.codigoevento +"</codigoevento>" +
                        "<retornarxml>" +this.retornarxml +"</retornarxml>";

        JSONObject criarJson = XML.toJSONObject(xmlString);
        JSONObject novoJSON = new JSONObject(criarJson.toString());
        String xmlStr2 = XML.toString(novoJSON);

        System.out.println(xmlStr2);
        return xmlStr2;
    }

    public JSONObject geraJson(){

        String xmlString = this.geraXml();

        JSONObject criarJson = XML.toJSONObject(xmlString);

        JSONObject novoJSON = new JSONObject(criarJson.toString());

        System.out.println(novoJSON);
        return novoJSON;
    }
}
