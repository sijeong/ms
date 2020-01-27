package net.cfxp.ms.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor()
public class Task {
    private @Id @GeneratedValue Long id;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private String assignee;
}
