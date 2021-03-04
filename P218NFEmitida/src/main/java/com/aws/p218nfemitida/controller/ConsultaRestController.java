package com.aws.p218nfemitida.controller;

import com.aws.p218nfemitida.dto.Consulta;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author CleberLeão
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/e-form-rest"})
public class ConsultaRestController {

    public ConsultaRestController(){

    }

    @GetMapping({"/{documento}"})
    public String buscarSoap(@PathVariable String documento) {
        Consulta consulta = new Consulta();
        consulta.setCodigoevento("111011");
        consulta.setChavedeacesso(documento);
        String xml = consulta.geraXml();
        JSONObject geraJson = consulta.geraJson();
        System.out.println(geraJson);

        return xml;
    }

}
