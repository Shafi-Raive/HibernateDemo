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
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    
}
