package com.pradnesh.repository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.pradnesh.model.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}
