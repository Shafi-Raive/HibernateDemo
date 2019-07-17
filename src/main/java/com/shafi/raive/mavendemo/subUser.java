package com.shafi.raive.mavendemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;
/**
 *
 * @author shafi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
public class subUser {
    @Id
    private int id;
    private String email;
    private String pass;

    
}
