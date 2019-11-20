package brightstar.springdemo.config.group;

import java.time.LocalDate;

public class StarLocalDate {
	LocalDate localDate;
	
	public StarLocalDate(String str) {
		String[] ss = str.split("-");
		
		this.localDate = LocalDate.of(Integer.parseInt(ss[0]), Integer.parseInt(ss[1]), Integer.parseInt(ss[2]));
	}

	@Override
	public String toString() {
		return "StarLocalDate [localDate=" + localDate + "]";
	}

}
