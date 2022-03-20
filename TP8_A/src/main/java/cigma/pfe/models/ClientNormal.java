package cigma.pfe.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data


public class ClientNormal extends Client {
    private int importanceLevel;
    public ClientNormal(String name, int importanceLevel) {
        super(name);
        this.importanceLevel = importanceLevel;
    }

    public ClientNormal(){}
}
