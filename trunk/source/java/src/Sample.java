
public class Sample {
	String name;
	String classe;
	int[] camp;

	public Sample(String name, String classe, int[] camp) {
		super();
		this.name = name;
		this.classe = classe;
		this.camp = camp;
	}
	public Sample() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int[] getCamp() {
		return camp;
	}
	public void setCamp(String camp) {
		String []ciao=camp.split(" ");
		this.camp=new int[ciao.length];
		for(int i=0;i<(this.camp.length);i++){
			this.camp[i]=Integer.parseInt(ciao[i]);
		}
		//	System.out.println(this.camp);
		//this.camp = camp;
	}


}
