package c06;

class Game { 
	  Game(int i) { 
	    System.out.println("Game constructor "+i); 
	  } 
	} 
	 
	class BoardGame extends Game { 
	  BoardGame(int i) { 
	    super(i+1); 
	    System.out.println("BoardGame constructor "+i); 
	  } 
	} 
	 
	public class Chess extends BoardGame { 
	  Chess() { 
	    super(11); 
	    System.out.println("Chess constructor "); 
	  } 
	  public static void main(String[] args) { 
	    Chess x = new Chess(); 
	  } 
	}
