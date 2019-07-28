class VotingMachine{
	String [] names;
	int [] votes;

		public void addCandidates(String names[])
		{
			this.names=names;
			votes=new int[names.length];
		}
		public void castVote(int age,String voteTo){
			if(age<18){
				throw new ArithmeticException("Invalid");
					  }
			for(int i=0;i<names.length;i++){
				if(names[i]==voteTo){
					votes[i]++;
					  				}
											}		  
			}
		
		public void printResult(){
			for(int i=0;i<names.length;i++){
				System.out.println(names[i]+" got "+votes[i]+" votes");
			}
		}	



		}
class Task3{
	public static void main(String[] args) {
		String [] names={"Hassan","Saeed","Sameer"};
		VotingMachine obj=new VotingMachine();
		obj.addCandidates(names);

		obj.castVote(25,"Hassan");
		obj.castVote(18,"Saeed");
		obj.castVote(20,"Sameer");

	System.out.println("   Result   ");
	obj.printResult();	
	}
}

