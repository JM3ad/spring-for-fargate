package uk.co.meadbros.springdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.meadbros.springdemo.models.DemoModel;
import uk.co.meadbros.springdemo.repositories.DemoRepository;

import java.util.List;

@Component
public class DemoService {
    private final DemoRepository demoRepository;

    @Autowired
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public List<DemoModel> getAllDemoModels() {
        return demoRepository.findAll();
    }
}
