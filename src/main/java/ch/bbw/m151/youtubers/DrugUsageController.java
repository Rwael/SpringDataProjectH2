package ch.bbw.m151.youtubers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="drug")
public class DrugUsageController {

    @Autowired
    DrugRepository drugRepository;

    @GetMapping
    public List<String> getCountries(){
        var allCountries = drugRepository.distinctCountries();
        return allCountries;
    }
}
