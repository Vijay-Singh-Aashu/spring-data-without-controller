package com.excellence.spring_data_without_controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="mybooks", collectionResourceRel = "bo")
public interface BookRepository extends JpaRepository<Book, Integer> {

}
