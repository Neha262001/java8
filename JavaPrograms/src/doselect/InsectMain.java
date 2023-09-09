package doselect;

import java.util.ArrayList;
import java.util.List;

class Insect{
	private String insectName;
	private int insectWeight;
	
	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName=insectName;
		this.insectWeight=insectWeight;
	}

	public String getInsectName() {
		return insectName;
	}

	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}

	public int getInsectWeight() {
		return insectWeight;
	}

	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	public String toString() {
		return "Insect [insectName=" +  insectName + " ,insectWeight= " + insectWeight + " ]";
	}
}
class Insecticides{
	public List<String> mapInsectName(List<Insect> list){
		List<String> s=new ArrayList<String>();
		for(Insect i:list) {
			s.add(i.getInsectName());
		}
		return s;
	}
}
public class InsectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Insect> l=new ArrayList<Insect>();

	}

}
