public class ObjEmp{
	
///variables de classe

	protected int[] values;
	//tableau contenant les "values"

///Constructeur

	public ObjEmp(int[] values){
		this.values=values;
	}
	// pointe les valeurs du tableau d'objets empilables

	//getValues retourne les valeurs de l'objet
	public int[] getValues(){
		return values;
	}
	//pointe les variables de classe protégées


///Méthodes

	//ajoute a values les cases de oe de même index  
	void operation(String ope, ObjEmp oe){
		switch(ope){
			//dans le cas ou ope="add"
			case "add":
				//initialisation
				for (int i=0; i<values.length; i++)
					//on ajoute (+=) a la case de values qui correspond a l'index i, la case de oe qui correspond a l'index i
					values[i] += oe.getValues()[i];
				break;
			case "sub":
				//initialisation
				for (int i=0; i<values.length; i++)
					//on retire (-=) a la case de values qui correspond a l'index i, la case de oe qui correspond a l'index i
					values[i] -= oe.getValues()[i];
				break;
			case "mul":
				//initialisation
				for (int i=0; i<values.length; i++)
					//on multiplie (*=) a la case de values qui correspond a l'index i, la case de oe qui correspond a l'index i
					values[i] *= oe.getValues()[i];
				break;
			case "div":
				//initialisation
				for (int i=0; i<values.length; i++)
					//on  divises la case de values qui correspond a l'index i, par la case de oe qui correspond a l'index i
					values[i] = values[i] / oe.getValues()[i];
				break;
			default:
				this.toString();
		}
	}

	//retourne le résultat du contenu d'une case
	public String toString(){
		String result="[ ";
		for (int i=0; i<values.length; i++)
			result += values[i] + " ";
		result += "]";
		return result;
	}
}
