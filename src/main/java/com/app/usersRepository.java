package com.app;

import com.app.users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface usersRepository extends MongoRepository<users, String> {
    users findBy_id(ObjectId _id);
}
