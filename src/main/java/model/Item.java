package model;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Items")
public class Item {

    @Id
    @Column(name="key")
    private String key;

    @Column(name="category")
    private String category;

    @Column(name="name")
    private String name;

    @Column(name="district")
    private String district;

    @Column(name="createDate")
    private LocalDateTime createDate;

}
