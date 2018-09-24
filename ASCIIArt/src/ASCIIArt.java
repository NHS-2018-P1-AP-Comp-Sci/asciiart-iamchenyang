public class ASCIIArt {
	public static void prinsenVlag()
	{
		oranje();
		wit();
		blauw();
	}
	public static void line()
	{
		System.out.println("+--------------------+");
	}
	public static void oranje()
	{
		line();
		System.out.println("|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|");
		line();
	}
	public static void wit()
	{
		System.out.println("|                    |");
	}
	public static void blauw()
	{
		line();
		System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
		line();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prinsenVlag();
		System.out.println("God, Nederland, Oranje");
	}

}
