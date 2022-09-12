package ch.bbw.m151.youtubers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Objects;

@SpringBootTest
public class DrugTest {

    @Autowired
    DrugRepository drugRepository;

    @Test
    void whatDoIHave(){
        var n = drugRepository.count();
        assert n == 1888;
    }

    @Test
    void selectCountry(){
        var n = drugRepository.findAllByCountryIs("India");
        drugRepository.findById(12).get().Gender = "2";
        var b = drugRepository.findById(12).get();
        Assert.isTrue(Objects.equals(b.Gender, "2"));
    }

    @Test
    void distinctCountries(){
        var n = drugRepository.distinctCountries();
        Assert.isTrue(n.size() > 0);
    }
}
