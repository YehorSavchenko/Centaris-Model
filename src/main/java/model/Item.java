package model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {

    private String key;

    private String category;

    private String name;

    private String district;

    private LocalDateTime createDate;

}
