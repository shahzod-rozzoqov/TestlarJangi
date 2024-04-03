package uz.shoh.testlarjangibot.entitys.user.entiry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.shoh.testlarjangibot.entitys.test.entity.Test;
import uz.shoh.testlarjangibot.entitys.testSubmission.entity.TestSubmission;
import uz.shoh.testlarjangibot.entitys.user.enums.UserState;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "`user`")
public class User {
    @Id
    private String id;
    private String fullName;
    @Enumerated(EnumType.STRING)
    private UserState state;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Test> tests;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TestSubmission> submissions;
}
