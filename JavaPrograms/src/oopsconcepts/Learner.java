package oopsconcepts;

public class Learner {


		int id;
		String name;
		String degree;
		//defulat constructor
		 Learner(){
			id=1;
			name="neha";
			degree="Btech";
		}
		//parameterised
		 ClassLearner(int no,String nm,String dg){
			num=no;
			name=nm;
			degree=dg;
		}
	      void display() {
	    	  System.out.println(" Num: "+num+" "  +"Name:" +name +  " "+"Degree:" + degree);
	      }
		
		//copy Constrctor
		ClassLearner(ClassLearner l){
			num=l.no;
			name=l.name;
			degree=l.degree;
		}
		void display() {
			System.out.println(" Num: "+num+" "  +"Name:" +name +  " "+"Degree:" + degree);
		}

		public static void main(String[] args) {
			ClassLearner l=new ClassLearner();//default constructor
			l.num=10;
			l.name="dnfkd";
			l.degree="BE";
			l.display();
			System.out.println("-----------------------");
			ClassDemo d1=new ClassDemo(15,"lekha");
			d1.display();
			System.out.println("-----------------------");
			ClassDemo d2=new ClassDemo("vipul");
			d2.display();
			System.out.println("-----------------------");
			ClassDemo d3=new ClassDemo(d1);
			d3.display();
		}

	}



	}

}
