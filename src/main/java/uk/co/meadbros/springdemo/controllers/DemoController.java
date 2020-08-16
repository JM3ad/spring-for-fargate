package uk.co.meadbros.springdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.meadbros.springdemo.models.DemoModel;
import uk.co.meadbros.springdemo.services.DemoService;

import java.util.List;

@RestController
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/test")
    public int getATestInteger() {
        return 33;
    }

    @GetMapping("/db-test")
    public List<DemoModel> getAModel() {
        return demoService.getAllDemoModels();
    }
}
