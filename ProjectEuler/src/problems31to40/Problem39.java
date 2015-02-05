package problems31to40;

//correct 
//super easy 
//DONE WITH STEPHANE AROCA-OUELLETTE 
public class Problem39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[1001];
		for(int a=0;a<=500;a++){
			for(int b=a;b<=500;b++){
				int c = (int) Math.sqrt(a*a+b*b);
				double cDouble = Math.sqrt(a*a+b*b);
				if((double) c == cDouble){
					if(a+b+c<=1000){
						array[a+b+c]++;
					}
				}
			}
		}
		int most=0;
		int index=0;
		for(int i=0;i<=1000;i++){
			if (array[i]>most){
				most=array[i];
				index=i;
			}
		}
		System.out.println(index);
	}

}
