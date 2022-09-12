package ch.bbw.m151.youtubers;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Countries") public class CountryEntity {
    @Id
    public String Country;
}