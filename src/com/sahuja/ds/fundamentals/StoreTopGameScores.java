package com.sahuja.ds.fundamentals;

/**
 * Created by Sourabh on 1/13/2017.
 */
public class StoreTopGameScores {

    private int numEntries;
    private GameEntry board[] = null;

    public StoreTopGameScores(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry entry) {
        if(numEntries < board.length || board[numEntries - 1].getScore() < entry.getScore()) {
            if(numEntries < board.length) {
                numEntries++;
            }
            int counter = numEntries - 1;
            while(counter > 0 && board[counter - 1].getScore() < entry.getScore()) {
                board[counter] = board[counter - 1];
                counter--;
            }
            board[counter] = entry;
        }
    }


    public void remove(int index) {
        for(int i = index; i < numEntries - 1; i++) {
            board[i] = board[i + 1];
        }
        board[numEntries - 1] = null;
        numEntries --;
    }

    public static void main(String[] args) {
        // The main method
        StoreTopGameScores highscores = new StoreTopGameScores(5);
        String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Anna", "Paul", "Bob"};
        int[] scores = {750, 1105, 590, 740, 510, 660, 720, 400};

        for (int i=0; i < names.length; i++) {
            GameEntry gE = highscores.new GameEntry(names[i], scores[i]);
            System.out.println("Adding " + gE);
            highscores.add(gE);
            System.out.println(" Scoreboard: " + highscores);
        }
        System.out.println("Removing score at index " + 3);
        highscores.remove(0);
        System.out.println(highscores);
//        System.out.println("Removing score at index " + 0);
//        highscores.remove(0);
//        System.out.println(highscores);
//        System.out.println("Removing score at index " + 1);
//        highscores.remove(1);
//        System.out.println(highscores);
//        System.out.println("Removing score at index " + 1);
//        highscores.remove(1);
//        System.out.println(highscores);
//        System.out.println("Removing score at index " + 0);
//        highscores.remove(0);
//        System.out.println(highscores);
    }

    /** Returns a string representation of the high scores list. */
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int j = 0; j < numEntries; j++) {
            if (j > 0)
                sb.append(", ");                   // separate entries by commas
            sb.append(board[j]);
        }
        sb.append("]");
        return sb.toString();
    }

    public class GameEntry {
        private String name;        // name of the person earning this score
        private int score;          // the score value
        /** Constructs a game entry with given parameters.. */
        public GameEntry(String n, int s) {
            name = n;
            score = s;
        }
        /** Returns the name field. */
        public String getName() { return name; }
        /** Returns the score field. */
        public int getScore() { return score; }
        /** Returns a string representation of this entry. */
        public String toString() {
            return "(" + name + ", " + score + ")";
        }
    }
}
