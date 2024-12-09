package weekFifteen.jsonActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class mlbTeamReaderArrayList {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("teams.json"));

            //mlbTeam teamInfo = gson.fromJson(reader, mlbTeam.class);
            Type mlbTeamArrayList = new TypeToken<ArrayList<Team>>(){}.getType();
            ArrayList<Team> teamList = gson.fromJson(reader, mlbTeamArrayList);

            System.out.println("**********Team Information**********");
            for(Team teamInfo : teamList) {
                System.out.printf("Name: %s\nLeague affiliation: %s\nDivision: %s\n", teamInfo.getName(),
                        teamInfo.getLeague(), teamInfo.getDivision());
                System.out.println("--------------------\n\n");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
