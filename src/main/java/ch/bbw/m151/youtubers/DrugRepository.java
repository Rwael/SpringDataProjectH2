package ch.bbw.m151.youtubers;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface DrugRepository extends JpaRepository<DrugUsageEntity, Integer> {
    //List<DrugUsageEntity> findAllByCountryIs(String Country);

    //@Query("SELECT DISTINCT country FROM Drugusages WHERE country IS NOT NULL")
    //List<String> distinctCountries();

   // Page<DrugUsageEntity> findAllbyUsernameContainsOrderByUsername(String contains, Pageable pageable);
}
