package com.bank.card.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.card.document.Card;

@Repository
public interface CardRepository extends MongoRepository<Card, String> {
	List<Card> findByAccountId(String accountId);
}