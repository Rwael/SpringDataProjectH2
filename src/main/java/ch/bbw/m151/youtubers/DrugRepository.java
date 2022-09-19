package ch.bbw.m151.youtubers;

import org.springframework.data.domain.Page;
import org.h2.command.dml.Delete;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DrugRepository extends JpaRepository<DrugUsageEntity, Integer> {
    List<DrugUsageEntity> findAllByCountryIs(CountryEntity Country);

    @Query("SELECT DISTINCT country FROM Countries WHERE country IS NOT NULL AND NOT country = 'Other' ")
    List<String> distinctCountries();

    Page<DrugUsageEntity> findAllByGenderIs(String gender, Pageable pageable);

    void deleteByID(int id);
    @Query("SELECT e FROM Drugusages e LEFT JOIN Countries On Countries.country = Drugusages .country")
    List<DrugUsageEntity> GetallDrugUsageEntity();
}
