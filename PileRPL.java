public class PileRPL{

//variables de classe
int nbObj;
ObjEmp[] pile;

//constructeur
	public PileRPL(int size){
		nbObj = 0;
		pile=new ObjEmp[size];
	}

	//eviter stack overflow puisque taille fixee a 4
	//retour vide; argument oe de type ObjEmp
	public void push(ObjEmp oe){
		//attribue a la case de la pile qui correspond a l'index nbObj la valeur oe (de type ObjEmp)
		pile[nbObj]=oe;
		//nbObj prend alors la valeur de nbObj+1: on incremente nbObj de 1
		nbObj=nbObj+1;
	}


	//erreur dans le cas ou il n'y a plus rien a poper
	public ObjEmp pop(){
		//réduit de 1 nbObj
		nbObj=nbObj-1;
		//retourne la case de la pile qui correspond à l'index de nbObj
		return pile[nbObj];
	}


	public void operation(String ope){
		//objet de classe ObjEmp

		//pop réduit de 1 nbObj et retourne la case de la pile qui correspond à l'index de nbObj
		ObjEmp oe1=this.pop();
		//pop réduit de 1 nbObj et retourne la case de la pile qui correspond à l'index de nbObj
		ObjEmp oe2=this.pop();
		//on applique l'operation de type ope de oe2 sur values de oe1
		oe1.operation(ope,oe2);
		//on push oe1 dans la pile
		this.push(oe1);
	}

	// la methode toString de type chaine de characteres, fonction qui convertit la pile en element affichable(String)
	public String toString(){
		//Nous sommes dans le cas ou le resultat est une chaine de charactere vide
		String result = "";
		//pour index i egale au nombre de cases de la pile-1 puisqu'il commence a 0, supérieur a zero, decrementable
		for (int i =pile.length-1; i>=0;i--)
			//on affiche i ajoute a (+=) result ":" ???
			result += i + ": " + (i<nbObj? pile[i]+"\n":"\n");
		return result;
	}
	
}
