package app.entity;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

    @Id
    @NotNull
    @Indexed
    public int id;

    @NotNull
    @Indexed
    public String username;

    @NotNull
    @Indexed
    public String email;
}
