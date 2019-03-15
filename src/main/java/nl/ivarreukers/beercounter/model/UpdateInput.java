package nl.ivarreukers.beercounter.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateInput {
	private String playerName;
	private int amountDrank;
}
