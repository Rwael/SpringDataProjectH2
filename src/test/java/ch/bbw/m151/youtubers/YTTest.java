package ch.bbw.m151.youtubers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Objects;

@SpringBootTest
public class YTTest {

    @Autowired
    YTRepository ytRepository;

    @Test
    void whatDoIHave(){
        var n = ytRepository.count();
        assert n == 1000;
    }

    @Test
    void selectCountry(){
        var n = ytRepository.findAllByAudienceCountryIs("India");
        ytRepository.findById(12).get().username = "2";
        var b = ytRepository.findById(12).get();
        Assert.isTrue(Objects.equals(b.username, "2"));
    }

    @Test
    void distinctCountries(){
        var n = ytRepository.distinctAudienceCountries();
        Assert.isTrue(n.size() > 0);
    }
}
