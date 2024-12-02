package es.upm.dit.apsv.traceserver.repository;

import org.springframework.data.repository.CrudRepository;
import es.upm.dit.apsv.traceserver.model.Trace;
import java.util.List;

public interface TraceRepository extends CrudRepository<Trace, String> {
}

