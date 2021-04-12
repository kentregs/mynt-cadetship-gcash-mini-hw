package ph.apper.gateway.payload.actPayload;

import lombok.Data;

@Data
public class Activity {
    private String action;
    private String identifier;
    private String details;
}
