package com.islam.joblisting.repository;

import com.islam.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
