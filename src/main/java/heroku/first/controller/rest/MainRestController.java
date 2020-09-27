package heroku.first.controller.rest;

import heroku.first.services.OdamService;
import maths.pure.arithmetic.number_feature.Number_Feature_Engine;
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

    @GetMapping("atkin")
    public ResponseEntity findPrimesAtkin(@RequestParam(name = "n") int n) throws InterruptedException {
//        Thread.sleep(1000);

        if (n<1000000&&n>0)
        return ResponseEntity.ok(Number_Feature_Engine.isPrimesE(n));
        else return ResponseEntity.badRequest().body("Noto'g'ri son kiritilgan!");
    }
}
