package model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String category;

    @Column
    private String name;

    @Column
    private String district;

    @Column
    private LocalDateTime createDate;

    public Item(String category, String name, String district, LocalDateTime createDate) {
        this.category = category;
        this.name = name;
        this.district = district;
        this.createDate = createDate;
    }
}
