package ch.bbw.m151.youtubers;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@DynamicUpdate
@Entity(name = "Countries") public class CountryEntity {
    @Id
    public String country;

    public CountryEntity(String countryName){
        this.country = countryName;
    }

    public CountryEntity() {

    }
}