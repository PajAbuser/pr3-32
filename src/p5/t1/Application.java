package p5.t1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Application {
    private static int team1Score = 0;
    private static int team2Score = 0;
    
    private static String lastScore = "";
    private static String winningTeam = "";
    private static JPanel panel = new JPanel();
    private static JButton button1 = new JButton("AC Milan");
    private static JButton button2 = new JButton("Real Madrid");
    private static JLabel result = new JLabel("Result: 0 X 0");
    private static JLabel last = new JLabel("Last scorer: N/A");
    private static JLabel winner = new JLabel("Winner: Draw");

    private static void updateText(String lastScore) {
        result.setText("Scores: " + team1Score + " X " + team2Score);
        last.setText("Last Scorer: " + lastScore);
        //winningTeam = team1Score == team2Score ? "DRAW" : String.valueOf((Math.max(team1Score, team2Score))==team1Score ? "AC Milan" : "Real Madrid");
        if(team1Score == team2Score) winningTeam = "Draw";
        else if(team1Score > team2Score) winningTeam = "AC Milan";
        else winningTeam = "Real Madrid";
        winner.setText("Winner: " + winningTeam);
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame();

        frame.setSize(600, 80);

        button1.addActionListener(e -> {
            team1Score++;
            updateText("AC Milan");
        });
        button2.addActionListener(e -> {
            team2Score++;
            updateText("Real Madrid");
        });
        panel.add(result);
        panel.add(button1);
        panel.add(last);
        panel.add(button2);
        panel.add(winner);
        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}