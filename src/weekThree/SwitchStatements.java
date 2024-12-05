package weekThree;

import javax.swing.*;

public class SwitchStatements {
    public static void main(String[] args) {
        String team, Message;
        team = JOptionPane.showInputDialog("Enter an MLB team: ");
        switch (team){
            case "Arizona Diamondbacks":
                Message = String.format("Year founded: 1998\n Affiliation: National League West\n Ballpark: Chase Field\n ");
                break;
            case "Atlanta Braves":
                Message = String.format("Year founded: 1871\n Affiliation: National League East\n Ballpark: Truist Park\n ");
                break;
            case "Baltimore Orioles":
                Message = String.format("Year founded: 1901\n Affiliation: American League East\n Ballpark: Oriole Park\n ");
                break;
            case "Boston Red Sox":
                Message = String.format("Year founded: 1901\n Affiliation: American League East\n Ballpark: Fenway Park\n ");
                break;
            case "Chicago Cubs":
                Message = String.format("Year founded: 1870\n Affiliation: National League Central\n Ballpark: Wrigley Field\n ");
                break;
            case "Chicago White Sox":
                Message = String.format("Year founded: 1894\n Affiliation: American League Central\n Ballpark: Guaranteed Rate Field\n ");
                break;
            case "Cincinnati Reds":
                Message = String.format("Year founded: 1881\n Affiliation: National League Central\n Ballpark: Great American Ballpark\n ");
                break;
            case "Cleveland Guardians":
                Message = String.format("Year founded: 1894\n Affiliation: American League Central\n Ballpark: Progressive Field\n ");
                break;
            case "Colorado Rockies":
                Message = String.format("Year founded: 1993\n Affiliation: National League West\n Ballpark: Coors Field\n ");
                break;
            case "Detroit Tigers":
                Message = String.format("Year founded: 1894\n Affiliation: American League Central\n Ballpark: Comerica Park\n ");
                break;
            case "Houston Astros":
                Message = String.format("Year founded: 1962\n Affiliation: American League West\n Ballpark: Minute Maid Park\n ");
                break;
            case "Kansas City Royals":
                Message = String.format("Year founded: 1969\n Affiliation: American League Central\n Ballpark: Kauffman Stadium\n ");
                break;
            case "Los Angeles Angels":
                Message = String.format("Year founded: 1961\n Affiliation: American League West\n Ballpark: Angel Stadium\n ");
                break;
            case "Los Angeles Dodgers":
                Message = String.format("Year founded: 1883\n Affiliation: National League West\n Ballpark: Dodger Stadium\n ");
                break;
            case "Miami Marlins":
                Message = String.format("Year founded: 1993\n Affiliation: National League East\n Ballpark: Marlins Park\n ");
                break;
            case "Milwaukee Brewers":
                Message = String.format("Year founded: 1969\n Affiliation: National League Central\n Ballpark: American Family Field\n ");
                break;
            case "Minnesota Twins":
                Message = String.format("Year founded: 1901\n Affiliation: American League Central\n Ballpark: Target Field\n ");
                break;
            case "New York Mets":
                Message = String.format("Year founded: 1962\n Affiliation: National League East\n Ballpark: Citi Field\n ");
                break;
            case "New York Yankees":
                Message = String.format("Year founded: 1903\n Affiliation: American League East\n Ballpark: Yankee Stadium\n ");
                break;
            case "Oakland Athletics":
                Message = String.format("Year founded: 1901\n Affiliation: American League West\n Ballpark: Oakland Coliseum\n ");
                break;
            case "Philadelphia Phillies":
                Message = String.format("Year founded: 1883\n Affiliation: National League East\n Ballpark: Citizens Bank Park\n ");
                break;
            case "Pittsburgh Pirates":
                Message = String.format("Year founded: 1887\n Affiliation: National League Central\n Ballpark: PNC Park\n ");
                break;
            case "San Diego Padres":
                Message = String.format("Year founded: 1969\n Affiliation: National League West\n Ballpark: Petco Park\n ");
                break;
            case "San Francisco Giants":
                Message = String.format("Year founded: 1883\n Affiliation: National League West\n Ballpark: Oracle Park\n ");
                break;
            case "Seattle Mariners":
                Message = String.format("Year founded: 1977\n Affiliation: American League West\n Ballpark: T-Mobile Park\n ");
                break;
            case "St. Louis Cardinals":
                Message = String.format("Year founded: 1882\n Affiliation: National League Central\n Ballpark: Busch Stadium\n ");
                break;
            case "Tampa Bay Rays":
                Message = String.format("Year founded: 1998\n Affiliation: American League East\n Ballpark: Tropicana Field\n ");
                break;
            case "Texas Rangers":
                Message = String.format("Year founded: 1961\n Affiliation: American League West\n Ballpark: Globe Life Field\n ");
                break;
            case "Toronto Blue Jays":
                Message = String.format("Year founded: 1976\n Affiliation: American League East\n Ballpark: Rogers Centre\n ");
                break;
            case "Washington Nationals":
                Message = String.format("Year founded: 1969\n Affiliation: National League East\n Ballpark: Nationals Park\n ");
                break;
            default:
                Message = String.format("Invalid team.");
                break;
        }
            JOptionPane.showMessageDialog(null,Message);
    }
}
