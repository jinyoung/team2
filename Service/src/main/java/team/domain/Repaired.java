package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Repaired extends AbstractEvent {

    private Long id;

    public Repaired(Service aggregate){
        super(aggregate);
    }
    public Repaired(){
        super();
    }
}
