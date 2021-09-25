package com.uninassau.programacao.avancada.consultmed.controller;

import com.uninassau.programacao.avancada.consultmed.dto.FichaAgendamentoDto;
import com.uninassau.programacao.avancada.consultmed.service.FichaAgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
@RequiredArgsConstructor
public class FichaAgendamentoController {

    @Autowired
    private FichaAgendamentoService fichaAgendamentoService;

    @GetMapping
    public List<FichaAgendamentoDto> listAll(){
        return fichaAgendamentoService.listAll();

    }

    @GetMapping("/{id}")
    public FichaAgendamentoDto findById (@PathVariable Long id){
        return fichaAgendamentoService.findById(id);

    }

    @PostMapping
    public FichaAgendamentoDto save (@RequestBody FichaAgendamentoDto fichaAgendamentoDto){
        return fichaAgendamentoService.save(fichaAgendamentoDto);

    }

    @PutMapping("/{id}")
    public FichaAgendamentoDto updateById (@RequestBody FichaAgendamentoDto fichaAgendamentoDto,
                                            @PathVariable Long Id ){

        return fichaAgendamentoService.updateById(fichaAgendamentoDto, Id);

    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        fichaAgendamentoService.deleteById(id);
    }


}