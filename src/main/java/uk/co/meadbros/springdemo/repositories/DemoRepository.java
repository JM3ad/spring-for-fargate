package uk.co.meadbros.springdemo.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.meadbros.springdemo.models.DemoModel;

import java.util.List;

public interface DemoRepository extends CrudRepository<DemoModel, Integer> {
    List<DemoModel> findAll();
}
