package com.uty.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uty.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
