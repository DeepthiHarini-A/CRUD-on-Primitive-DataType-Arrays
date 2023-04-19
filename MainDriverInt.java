import java.util.Scanner;
class MainDriverInt{
	private static Scanner scn=new Scanner(System.in);
	private static boolean data=true;
	private static int[] intTypeArrays;
	public static void main(String[] args){
		do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Int Type Array");
			System.out.println("2.Read The Int Type Array");
			System.out.println("3.Update The Int Type Array");
			System.out.println("4.Delete The Int Type Array");
			System.out.println("5.Exit");
			int choice=scn.nextInt();
			switch(choice){
			case 1: {
				System.out.println("Enter the size of the int Type Array");
				int size=scn.nextInt();
				intTypeArrays= new int[size];
				System.out.println("Int Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of int type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<intTypeArrays.length;i++){
                	System.out.println(intTypeArrays[i]);
                }
                System.out.println("Int Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<intTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the int type arrays at the "+i+" index");
                	intTypeArrays[i]=scn.nextInt();
                }
                System.out.println("Int Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                intTypeArrays=null;
                System.out.println("Int Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data);
	}
}