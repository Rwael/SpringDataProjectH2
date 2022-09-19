package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity(name = "Drugusages") public class DrugUsageEntity {
    @Id
    public Long ID;

    @Column
    public String age;

    @Column
    public String gender;

    @Column
    public String education;

    @Column
    public String ethnicity;

    @JoinColumn(name="country")
    @ManyToOne
    public CountryEntity country;

    @Column(name="NScore")
    public double neuroticism;

    @Column(name="CScore")
    public double conscientiousness;

    @Column(name="EScore")
    public double extraversion;

    @Column(name="OScore")
    public double openness;

    @Column(name="AScore")
    public double agreeableness;

    @Column(name="Impulsive")
    public double impulsiveness;

    @Column(name="SS")
    public double craziness;

    public DrugUsageEntity(){}
}
