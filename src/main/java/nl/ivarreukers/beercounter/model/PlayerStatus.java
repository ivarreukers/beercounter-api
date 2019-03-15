package nl.ivarreukers.beercounter.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerStatus {
	private String playerName;
	
	private int drankToday;
	private int drankThisWeek;
	private int drankThisMonth;
	private int drankThisYear;
	private int drankTotal;
}
