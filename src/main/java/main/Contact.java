package main;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contact {

    private String firstName;
    private String lastname;
    private String email;
    private String phoneNumber;

}
