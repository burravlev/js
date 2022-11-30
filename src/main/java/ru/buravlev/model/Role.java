package ru.buravlev.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import javax.persistence.*;

@Entity
@Table(name = "role")
@Getter
@Setter
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String role;

    public Role() {}
    public Role(Long id) {
        this.id = id;
    }
    public Role(String role) {
        this.role = role;
    }
    @Override
    public String getAuthority() {
        return getRole();
    }
}
