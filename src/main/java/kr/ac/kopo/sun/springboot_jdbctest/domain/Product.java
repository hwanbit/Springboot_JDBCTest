package kr.ac.kopo.sun.springboot_jdbctest.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;

// 단방향: Product에서 Detail을 참조
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "detail_id")
//    private Detail detail;

// 양방향: 공유 기본키를 사용
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Detail detail;

}
