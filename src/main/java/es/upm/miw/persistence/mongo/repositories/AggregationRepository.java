package es.upm.miw.persistence.mongo.repositories;

import es.upm.miw.persistence.mongo.documents.AggregationDocument;
import es.upm.miw.persistence.mongo.documents.AnyDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AggregationRepository extends MongoRepository<AggregationDocument, String> {

    List<AggregationDocument> findByAnyDocumentListContaining(AnyDocument anyDocument);
}
