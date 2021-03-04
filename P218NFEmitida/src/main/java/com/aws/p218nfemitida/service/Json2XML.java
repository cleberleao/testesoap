package com.aws.p218nfemitida.service;

import org.json.*;
import org.springframework.stereotype.Service;

@Service
public class Json2XML {

    public Json2XML(){

    }

    public String gera2Xml(){

        //--------------------------------------
        // (1) monta "xml" em uma string
        //--------------------------------------

        String xmlString =
                "<autenticacao>" +
                "<versao>1.00</versao>"+
                "<usuario>teste_ws</usuario>" +
                "<senha>1234</senha>" +
                "<conexaoid>118</conexaoid>" +
                "</autenticacao>" +
                "<tiposervico>0</tiposervico>" +
                "<chaveacesso>31200916701716002523550250026003291251051510</chaveacesso>" +
                "<marcadagua>2</marcadagua>" +
                "<codigoevento>111011</codigoevento>" +
                "<retornarxml>0</retornarxml>";

        //--------------------------------------------------------------
        // (2) cria um JSONObject a partir do arquivo XML
        //     com o uso do método estático "toJSONObject" da classe XML
        //---------------------------------------------------------------

        JSONObject criarJson = XML.toJSONObject(xmlString);

        //--------------------------------------------------------------
        // (3) gera uma string JSON e imprime
        //---------------------------------------------------------------

        System.out.println(criarJson.toString());

        //--------------------------------------------------------------
        // (4) gera um objeto JSON a partir de paisesJson.toString()
        //---------------------------------------------------------------

        JSONObject novoPaisesJSON = new JSONObject(criarJson.toString());

        //--------------------------------------------------------------------------
        // (5) gera um texto XML a partir desse novo objeto e imprime o seu conteúdo
        //---------------------------------------------------------------------------

        String xmlStr2 = XML.toString(novoPaisesJSON);

        System.out.println(xmlStr2);
        return xmlStr2;
    }
}