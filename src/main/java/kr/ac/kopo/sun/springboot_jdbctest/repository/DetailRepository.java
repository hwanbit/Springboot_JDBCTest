package kr.ac.kopo.sun.springboot_jdbctest.repository;

import kr.ac.kopo.sun.springboot_jdbctest.domain.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {
    
}