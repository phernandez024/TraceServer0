package es.upm.dit.apsv.traceserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.yaml.snakeyaml.events.Event.ID;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class Trace {

     @Id
    private String traceId;
    private String truck;
    private long lastSeen;
    private double lat;
    private double lng;


    public Trace(String traceId, String truck, long lastSeen, double lat, double lng) {
        this.traceId = traceId;
        this.truck = truck;
        this.lastSeen = lastSeen;
        this.lat = lat;
        this.lng = lng;
    }
}