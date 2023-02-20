package pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private String bio;

}
