package com.pradnesh.repository;


import java.util.List;

import com.pradnesh.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}
