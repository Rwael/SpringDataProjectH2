package ch.bbw.m151.youtubers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrugUsageController {

    @Autowired
    DrugRepository drugRepository;

    @GetMapping("/countries")
    public List<String> getCountries(){
        var allCountries = drugRepository.distinctCountries();
        return allCountries;
    }
    @PostMapping("/drug/{id}")
    public void DeleteByid(@PathVariable int id){
        drugRepository.deleteByID(id);
    }
    @GetMapping("drug/{countryEntity}")
    public List<DrugUsageEntity> GetDrugUsageByCountry(@PathVariable CountryEntity countryEntity){
     var drugententity=   drugRepository.findAllByCountryIs(countryEntity);
     return drugententity;
    }
    @GetMapping("/drug/{gender}")
    public Page<DrugUsageEntity> GetAllByGender(@PathVariable String gender,  Pageable pageable){
        var drugentitys = drugRepository.findAllByGenderIs(gender,pageable);
        return drugentitys;
    }
    //@GetMapping
    //public List<DrugUsageEntity> GetAlldrugusagesEntity(){
      //  var drugusageentity = drugRepository.GetallDrugUsageEntity();
        //return drugusageentity;
    //}
}
