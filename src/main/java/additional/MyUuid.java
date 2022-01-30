package additional;

import lombok.Data;

import java.util.UUID;

@Data
public class MyUuid {
    private String uuid;

    public MyUuid() {
        UUID u = UUID.randomUUID();
        this.uuid = u.toString();
    }

}
