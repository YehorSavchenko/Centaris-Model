package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Item {

    private String key;

    private String category;

    private String name;

    private String district;

    private LocalDateTime createDate;

}
