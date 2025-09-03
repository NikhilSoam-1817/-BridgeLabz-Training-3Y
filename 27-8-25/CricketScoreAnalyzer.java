public class CricketScoreAnalyzer {
    public static void main(String[] args) {
        // Array storing runs scored by each batsman
        int[] scores = {45, 102, 78, 56, 89, 150, 23, 99};

        int highest = scores[0];
        int lowest = scores[0];
        int total = 0;
        boolean centuryScorer = false;

        // Loop through scores
        for (int score : scores) {
            // Update highest and lowest
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;

            // Add to total
            total += score;

            // Check for century
            if (score >= 100) centuryScorer = true;
        }

        // Calculate average
        double average = (double) total / scores.length;

        // Output results
        System.out.println("🏏 Cricket Score Analysis:");
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + String.format("%.2f", average));
        if (centuryScorer) {
            System.out.println("Century Scorer: Yes");
        } else {
            System.out.println("Century Scorer: No");
        }
    }
}