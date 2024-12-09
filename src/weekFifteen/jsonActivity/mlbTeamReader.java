package weekFifteen.jsonActivity;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mlbTeamReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("team.json"));

            Team teamInfo = gson.fromJson(reader, Team.class);
            System.out.println("**********Team Information**********");
            System.out.printf("Name: %s\nLeague affiliation: %s\nDivision: %s\n", teamInfo.getName(),
                    teamInfo.getLeague(), teamInfo.getDivision());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
