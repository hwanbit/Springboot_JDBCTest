package kr.ac.kopo.sun.springboot_jdbctest.repository;

import kr.ac.kopo.sun.springboot_jdbctest.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}