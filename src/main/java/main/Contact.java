package main;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contact {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
