package ru.mayak.z23.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "categories")
public class QCategory {
    @Id
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "block_id")
    private QBlock block;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Question> questions = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QCategory)) return false;
        QCategory qCategory = (QCategory) o;
        return Objects.equals(id, qCategory.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
