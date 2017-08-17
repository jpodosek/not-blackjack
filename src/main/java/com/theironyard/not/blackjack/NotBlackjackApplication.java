package com.theironyard.not.blackjack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.theironyard.not.blackjack.models.AceCart;
import com.theironyard.not.blackjack.models.Duck;
import com.theironyard.not.blackjack.models.Handle;
import com.theironyard.not.blackjack.models.NumberCart;

@SpringBootApplication
public class NotBlackjackApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotBlackjackApplication.class, args);
		
		Handle handle = new Handle();
		handle.addCart(new AceCart("Smurfs"));
		handle.addCart(new NumberCart(3, "Almonds"));
		
		Duck duck = new Duck();
		duck.shuffle();
		duck.printThis();
		
	}
}
