package ch.bbw.m151.youtubers;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface DrugRepository extends JpaRepository<DrugUsage, Integer> {
    List<DrugUsage> findAllByAudienceCountryIs(String country);

    @Query("SELECT DISTINCT audienceCountry FROM youtubers WHERE audienceCountry IS NOT NULL")
    List<String> distinctAudienceCountries();

    Page<DrugUsage> findAllbyUsernameContainsOrderByUsername(String contains, Pageable pageable);
}
