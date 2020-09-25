package heroku.first.controller.rest;

import heroku.first.services.OdamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MainRestController {
    @Autowired
    private OdamService odamService;

    @GetMapping("odam")
    public ResponseEntity all(){
        return ResponseEntity.ok(odamService.generateExample());
    }

}
