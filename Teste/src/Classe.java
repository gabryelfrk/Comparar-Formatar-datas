import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Classe {

	public static void main(String[] args) {
		
        DateTimeFormatter fmt = DateTimeFormatter
                .ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);

        LocalDate algumaData1 = LocalDate.parse("04/09/2018", fmt);
        LocalDate hoje1 = LocalDate.parse("05/09/2018", fmt); //LocalDate.now();
        boolean antes1 = algumaData1.isBefore(hoje1);
        System.out.println(antes1 + " - " + fmt.format(algumaData1) + " - " + fmt.format(hoje1));

        LocalDate algumaData2 = LocalDate.parse("10/09/2018", fmt);
        LocalDate hoje2 = LocalDate.parse("10/09/2018", fmt); //LocalDate.now();
        boolean antes2 = algumaData2.isBefore(hoje2);
        System.out.println(antes2 + " - " + fmt.format(algumaData2) + " - " + fmt.format(hoje2));

        LocalDate algumaData3 = LocalDate.parse("20/01/2023", fmt);
        LocalDate hoje3 = LocalDate.parse("01/01/2023", fmt); //LocalDate.now();
        boolean antes3 = algumaData3.isBefore(hoje3);
        System.out.println(antes3 + " - " + fmt.format(algumaData3) + " - " + fmt.format(hoje3));
        
        // --------------------
        
        final String dateTimePtBr = "01/01/2023 01:00:00";
        final LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimePtBr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        final String formattedDate = parsedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println(formattedDate); // 2023-01-01
	}

}
