package com.mpalourdio.html5.api.repository;

import com.mpalourdio.html5.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by louchen on 2017/6/28.
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(final String username);

}
