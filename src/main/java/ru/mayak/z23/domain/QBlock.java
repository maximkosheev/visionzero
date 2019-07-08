package ru.mayak.z23.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "blocks")
public class QBlock {
    @Id
    private Integer id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "block", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<QCategory> categories = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QBlock)) return false;
        QBlock qBlock = (QBlock) o;
        return Objects.equals(id, qBlock.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
