package ch.bbw.m151.youtubers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;

import java.util.Objects;

@SpringBootTest
public class DrugTest {

    @Autowired
    DrugRepository drugRepository;

    @Test
    void whatDoIHave(){
        var n = drugRepository.count();
        assert n == 1884;
    }

    @Test
    void SaveEntity(){
        var ab = drugRepository.findById(12).get();
        ab.gender = "2";
        drugRepository.save(ab);
        var b = drugRepository.findById(12).get();
        Assert.isTrue(Objects.equals(b.gender, "2"));
    }

    @Test
    void distinctCountries(){
        var n = drugRepository.distinctCountries();
        Assert.isTrue(n.size() > 0);
    }

    @Test
    void searchCountry(){
        var n = drugRepository.findAllByCountryIs(new CountryEntity("UK"));
        Assert.isTrue(n.size() > 0);
    }

    @Test
    void Genders(){
        var n = drugRepository.findAllByGenderIs("M", Pageable.ofSize(2));
        Assert.isTrue(n.getContent().size() == 2);
    }
}
