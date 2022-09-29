package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AsAccepted extends AbstractEvent {

    private Long id;
    private String status;
    private Long requestId;

    public AsAccepted(Service aggregate){
        super(aggregate);
    }
    public AsAccepted(){
        super();
    }
}
