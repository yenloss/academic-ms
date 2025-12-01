package mx.edu.uteq.idgs12.academic_ms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.uteq.idgs12.academic_ms.dto.DivisionDTO;
import mx.edu.uteq.idgs12.academic_ms.service.DivisionService;

@RestController
@RequestMapping("/api/divisions")
public class DivisionController {

    private final DivisionService divisionService;

    public DivisionController(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @GetMapping
    public List<DivisionDTO> getAll() {
        return divisionService.getAll();
    }

}
