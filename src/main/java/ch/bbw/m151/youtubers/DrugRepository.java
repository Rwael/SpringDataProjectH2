package ch.bbw.m151.youtubers;

import org.h2.command.dml.Delete;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface DrugRepository extends JpaRepository<DrugUsageEntity, Integer> {

    void deleteByID(int id);
@Query("SELECT e FROM Drugusages e LEFT JOIN Countries On Countries.country = Drugusages .country")
    List<DrugUsageEntity> GetallDrugUsageEntity();
}
