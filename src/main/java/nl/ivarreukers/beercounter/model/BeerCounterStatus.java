package nl.ivarreukers.beercounter.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeerCounterStatus {
	List<PlayerStatus> statusOfPlayers;
}
