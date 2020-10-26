///import pour le BufferReader et le PrintStream
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class TextUI{
	//variables classe
	BufferedReader inputUser;
	PrintStream outputUser;//+outputLog
	boolean loop = true;
	PileRPL pile;
	int size;
	


///Consructeur

	//TextUI et un traitement de texte dans l'interface Utilisateur
	public TextUI(String[]args){
		//choisir entre log et unlog
		String result=modeChoice();
		initStream(result);//initialisation des flux
		//application en remote :initRemote();
		//activer le replay: initReplay();
		//Relance le programme a la fin d'un calcul
		mainLoop();

	}
	
///methodes
	private String modeChoice(){
		//choix entre les trois modes local, remote et replay
		String choice;
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Liste des choix possibles:\n - q pour quit\n - h pour help\n - r pour remote\n - l pour local\n - p pour replay");
			choice=scanner.nextLine();
			System.out.println("Vous avez appuye sur: " + choice);
			System.out.println("Quelle taille de pile souhaitez-vous?");
			if(scanner.hasNextLine()){
			this.size=Integer.parseInt(scanner.nextLine()); 
		 	}
		}
		System.out.println("La pile sera de " + this.size+" niveaux.");

		return choice;
	}

	//initialisation des flux: local ou remote
	public void initStream(String result){
		//initialiser les flux stdin et stdout

		switch(result){
			case "q":
				System.exit(0);
			case "r":
				System.out.println("Site en maintenance");
				//ouvrir la socket vers le serveur
				break;
			case "l":
			 	this.inputUser=new BufferedReader(new InputStreamReader(System.in));
				this.outputUser =new PrintStream(System.out);
				break;
			case "p":
			//ouvrir le fichier de log pour envoyer le contenu du fichier au serveur
			default:
				System.out.println("c'est pourtant pas complique!");
				break;
		}
	}

	public	void initRemote(){
	//initialiser les flux stdin et stdout

	}

	public void initReplay(){
	}

	public static void main(String[] args){
		new TextUI(args);
	}


	//affiche l'etat de la pile
	void displayStack(){
		System.out.println(this.pile.toString());


	}	
	

	public String getCommand(){
		//retourne la commande utilisateur
		String result = null;
		try {
			result = inputUser.readLine();
		}
		catch(Exception e){
			System.out.println("wrong1");
		}
		return result;
	}

	void runCommand(String cmd){
			try{
			//initialiser String tokenizer, le mettre dans pileRPL, le mettre dans operation
			
			}
		catch(Exception e){
			System.out.println("wrong2");
		}
	}

	void mainLoop(){
		//ObjEmp oe1=new ObjEmp(new int[]{1,2});
		/*ObjEmp oe2=new ObjEmp(new int[]{1,2});

		String ope;
		int o1;
		int o2;
		int o3;
		int o4;*/
		//lancement de la calculatrice		//try(Scanner scanner = new Scanner(System.in)){			//System.out.println("Quelle taille de pile souhaitez-vous?");			//while(!scanner.hasNextLine()){			//	;			//}			//enregistre dans size le retour de la fonction scanner.nextLine() (de type string)						//scanner.close();		//}
		this.pile=new PileRPL(this.size);
		while(loop){
			
			//System.out.println("hello");
			displayStack();
			
			String cmd = getCommand();
			
			//new Command(cmd);
			//soit un string (-> on lance l'ope) soit un int(-> ajout à la chaîne) ->> soit un push soit une operation ->> IF
			this.pile.push(oe1);
			this.pile.operation("add");
		}
	}


}
