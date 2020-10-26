public class FooRPL{


	public static void main(String[]args){
		PileRPL pile=new PileRPL(4);
		ObjEmp oe1=new ObjEmp(new int[]{1,2});
		ObjEmp oe2=new ObjEmp(new int[]{3,4});
		System.out.println(pile);
		pile.push(oe1);
		System.out.println(pile);
		pile.push(oe2);
		System.out.println(pile);
		pile.operation("add");
		System.out.println(pile);


	}


}
	

/*PileRPL pile=new PileRPL(this.size);
		ObjEmp oe1=new ObjEmp(new int[]{o1,o2});
		ObjEmp oe2=new ObjEmp(new int[]{o3,o4});
		System.out.println(pile);
		pile.push(oe1);
		System.out.println(pile);
		pile.push(oe2);
		System.out.println(pile);
		pile.operation("add");
		System.out.println(pile);
		pile.operation("sub");
		System.out.println(pile);
		pile.operation("mul");
		System.out.println(pile);
		pile.operation("div");
		System.out.println(pile);*/
