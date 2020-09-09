package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

//	@Modifying
//	@Query("update Book b SET b.9
//	void deactivateUsersNotLoggedInSince(@Param("date") LocalDate date);
}
