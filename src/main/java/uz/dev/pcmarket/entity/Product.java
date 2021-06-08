package uz.dev.pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Product extends AbsClass {

    private Double price;

    @OneToMany
    private List<Characteristic> characteristics;

    @OneToMany
    private List<Attachment> attachments;

    @ManyToOne
    private Category category;

    private boolean isConfiguration;

    private String warranty;


}
