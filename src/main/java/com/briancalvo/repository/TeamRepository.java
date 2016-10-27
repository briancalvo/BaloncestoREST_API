package com.briancalvo.repository;

import com.briancalvo.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
/**
 * Created by Brian on 17/10/2016.
 */
public interface TeamRepository extends JpaRepository<Team,Long>{

        List<Team> findByLocation(String location);

        Team findByNameLike(String name);

}
