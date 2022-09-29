package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AsCanceled extends AbstractEvent {

    private Long id;

    public AsCanceled(Service aggregate){
        super(aggregate);
    }
    public AsCanceled(){
        super();
    }
}
