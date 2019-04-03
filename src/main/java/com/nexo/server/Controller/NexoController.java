package com.nexo.server.Controller;

import com.nexo.server.Entity.Tightening_Result;
import com.nexo.server.Service.NexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nexo")
@CrossOrigin
public class NexoController {

    @Autowired
    private NexoService nexoService;

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nexo(@RequestBody Tightening_Result tightening_result) {
        nexoService.insertResult(tightening_result);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void nexoList(@RequestBody List<Tightening_Result> tightening_results) {
        System.out.println("List received");
        for (Tightening_Result ti:tightening_results
             ) {
            nexoService.insertResult(ti);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Tightening_Result> getAllResults() {
        return nexoService.getAllResults();
    }

}
