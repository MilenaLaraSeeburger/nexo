package com.nexo.server.DAO;

import com.nexo.server.Entity.Tightening_Result;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NexoDAO extends MongoRepository<Tightening_Result, String> {
}
