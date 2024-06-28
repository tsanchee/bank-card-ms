package com.bank.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.card.document.Card;
import com.bank.card.service.CardService;

@RestController
public class CardController {
	@Autowired
	private CardService cardService;
	
	@GetMapping(value="/api/v1/cards")
	@ResponseBody List<Card> getCards(){
		return cardService.getCards();
	}

	@PostMapping(value="/api/v1/cards")
	@ResponseBody Card saveCard(@RequestBody Card card){
		return cardService.saveCard(card);
	}
	
	@PutMapping(value="/api/v1/cards")
	@ResponseBody Card editCard(@RequestBody Card card){
		return cardService.editCard(card);
	}
	
	@DeleteMapping(value="/api/v1/cards/{id}")
	@ResponseBody boolean deletedCard(@PathVariable String id){
		return cardService.deletedCard(id);
	}
	
	@GetMapping(value="/api/v1/cards/{accountId}")
	@ResponseBody List<Card> searchByAccountId(@PathVariable String accountId){
		return cardService.searchByAccountId(accountId);
	}
}
