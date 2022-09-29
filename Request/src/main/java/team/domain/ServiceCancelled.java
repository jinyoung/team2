package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ServiceCancelled extends AbstractEvent {

    private Long id;

    public ServiceCancelled(Request aggregate){
        super(aggregate);
    }
    public ServiceCancelled(){
        super();
    }
}
