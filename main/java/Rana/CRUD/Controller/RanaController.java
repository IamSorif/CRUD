package Rana.CRUD.Controller;

import Rana.CRUD.PayLoad.RegistrationDTO;
import Rana.CRUD.Service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rana/practice")
public class RanaController {

    private final Service service;
    public RanaController(Service service) {
        this.service = service;
    }
//http://localhost:8080/rana/practice/creating
    @PostMapping("/creating")
    public ResponseEntity<RegistrationDTO> createRanaHere(@RequestBody RegistrationDTO registrationDTOh){

        RegistrationDTO ranaGoesToServiceLayer = service.createRana(registrationDTOh);

        return new ResponseEntity<>(ranaGoesToServiceLayer , HttpStatus.CREATED);
    }










    //http://localhost:8080/rana/practice/getData

    @GetMapping("/getData")
    public List<RegistrationDTO> getAll(){
        return service.getAlStudent();
    }
}
