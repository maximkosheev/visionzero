package ru.mayak.z23.domain;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;
import ru.mayak.z23.enums.Role;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "users")
public class User implements UserDetails {
    @Id
    private Long id;
    private String login;
    private String name;
    private String password;
    @Transient
    private List<Role> authorities = new ArrayList<Role>() {{add(Role.USER);}};
    @Transient
    private boolean accountNonExpired = true;
    @Transient
    private boolean accountNonLocked = true;
    @Transient
    private boolean credentialsNonExpired = true;
    @Transient
    private boolean enabled = true;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Answer> answers = new HashSet<>();

    @Override
    public String getUsername() {
        return getLogin();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
