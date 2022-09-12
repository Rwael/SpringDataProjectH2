package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity(name = "DrugUsages") public class DrugUsageEntity {
    @Id
    public Long ID;

    @Column
    public String Age;

    @Column
    public String Gender;

    @Column
    public String Education;

    @JoinTable(name="Countries")
    @ManyToOne
    public CountryEntity Country;

    @Column(name="NScore")
    public double Neuroticism;

    @Column(name="CScore")
    public double Conscientiousness;

    @Column(name="EScore")
    public double Extraversion;

    @Column(name="OScore")
    public double Openness;

    @Column(name="AScore")
    public double Agreeableness;

    @Column(name="Impulsive")
    public double Impulsiveness;

    @Column(name="SS")
    public double Craziness;

    public DrugUsageEntity(){}
}
