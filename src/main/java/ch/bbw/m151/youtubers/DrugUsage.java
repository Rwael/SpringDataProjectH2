package ch.bbw.m151.youtubers;

import javax.persistence.*;

@Entity(name = "DrugUsage") public class DrugUsage {
    @Id
    public Long rank;

    @Column
    public String username;

    @Column
    public String youtubeUrl;

    @Column
    public String name;

    @Column
    public String category;

    @Column
    public Long subscribers;

    @Column
    public String audienceCountry;

    @Column
    public Long avgViews;

    @Column
    public Long avgLikes;

    @Column
    public Long avgComments;

    public DrugUsage(){}
}
