package jpabook.japshop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jpabook.japshop.domain.Item;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;
    private String etc;

}