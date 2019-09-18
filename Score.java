package t1;

public class Score implements Comparable<Score> {
	String name;
	int total;

	public Score(String nm, int tot) {
		name = nm;
		total = tot;
	}

	public int compareTo(Score s) {
		if (total < s.total)
			return 1;
		else if (total == s.total)
			return 0;
		else
			return -1;
	}

	public String toString() {
		return name + "\t" + total;
	}
	
	public int getScore() {
		return total;
	}
}