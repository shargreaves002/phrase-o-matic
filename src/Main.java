public class Main {

    public static void main(String[] args) {
	String[] wordListOne = {"n automatic", " substantial", " pregnant", "n efficient", " dangerous", "n expensive", " comprehensive", "n aggresive"};
	String[] wordListTwo = {"basic", "happy", "comprehensive", "rare", "weak", "old", "hot", "desperate", "terrible"};
	String[] wordListThree = {"mom", "hat", "oven", "tooth", "movie", "attitude", "solution", "tea", "fish"};

	int rand1 = (int) (Math.random() * wordListOne.length);
	int rand2 = (int) (Math.random() * wordListTwo.length);
	int rand3 = (int) (Math.random() * wordListThree.length);

	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	System.out.println("What we need is a" + phrase + ".");
    }
}
