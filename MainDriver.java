import java.util.Scanner;
class MainDriver {
	private static Scanner scn=new Scanner(System.in);
	private static boolean data=true;
	private static boolean data1=true;
	private static boolean data2=true;
	private static boolean data3=true;
	private static boolean data4=true;
	private static boolean data5=true;
	private static boolean data6=true;
	private static boolean data7=true;
	private static boolean data8=true;

	private static int[] intTypeArrays;
	private static byte[] byteTypeArrays;
	private static short[] shortTypeArrays;
	private static long[] longTypeArrays;
	private static float[] floatTypeArrays;
	private static double[] doubleTypeArrays;
	private static char[] charTypeArrays;
	private static boolean[] booleanTypeArrays;
	public static void main(String[] args){
		do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1. Byte Type Array");
			System.out.println("2. Short Type Array");
			System.out.println("3. Int Type Array");
			System.out.println("4. Long Type Array");
			System.out.println("5. Float Type Arrays");
			System.out.println("6. Double Type Array");
			System.out.println("7. Char Type Array");
			System.out.println("8. Boolean Type Array");
			System.out.println("9. Exit");
			int choice = scn.nextInt();
			switch(choice){
			case 1:{
				System.out.println("You have selected Byte Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Byte Type Array");
			System.out.println("2.Read The Byte Type Array");
			System.out.println("3.Update The Byte Type Array");
			System.out.println("4.Delete The Byte Type Array");
			System.out.println("5.Exit");
			int choice1=scn.nextInt();
			switch(choice1){
			case 1: {
				System.out.println("Enter the size of the Byte Type Array");
				int size=scn.nextInt();
				byteTypeArrays= new byte[size];
				System.out.println("Byte Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Byte type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<byteTypeArrays.length;i++){
                	System.out.println(byteTypeArrays[i]);
                }
                System.out.println("Byte Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<byteTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Byte type arrays at the "+i+" index");
                	byteTypeArrays[i]=scn.nextByte();
                }
                System.out.println("Byte Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                byteTypeArrays=null;
                System.out.println("Byte Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data1=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data1);
	    }
		break;
	    case 2:{
				System.out.println("You have selected Short Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Short Type Array");
			System.out.println("2.Read The Short Type Array");
			System.out.println("3.Update The Short Type Array");
			System.out.println("4.Delete The Short Type Array");
			System.out.println("5.Exit");
			int choice2=scn.nextInt();
			switch(choice2){
			case 1: {
				System.out.println("Enter the size of the Short Type Array");
				int size=scn.nextInt();
				shortTypeArrays= new short[size];
				System.out.println("Short Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Short type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<shortTypeArrays.length;i++){
                	System.out.println(shortTypeArrays[i]);
                }
                System.out.println("Short Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<shortTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Short type arrays at the "+i+" index");
                	shortTypeArrays[i]=scn.nextShort();
                }
                System.out.println("Short Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                shortTypeArrays=null;
                System.out.println("Short Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data2=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data2);
	    }
		break;
        case 3:{
				System.out.println("You have selected Int Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Int Type Array");
			System.out.println("2.Read The Int Type Array");
			System.out.println("3.Update The Int Type Array");
			System.out.println("4.Delete The Int Type Array");
			System.out.println("5.Exit");
			int choice3=scn.nextInt();
			switch(choice3){
			case 1: {
				System.out.println("Enter the size of the Int Type Array");
				int size=scn.nextInt();
				intTypeArrays= new int[size];
				System.out.println("Int Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Int type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<intTypeArrays.length;i++){
                	System.out.println(intTypeArrays[i]);
                }
                System.out.println("Int Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<intTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Int type arrays at the "+i+" index");
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
                data3=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data3);
	    }
		break;
		case 4:{
				System.out.println("You have selected Long Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Long Type Array");
			System.out.println("2.Read The Long Type Array");
			System.out.println("3.Update The Long Type Array");
			System.out.println("4.Delete The Long Type Array");
			System.out.println("5.Exit");
			int choice4=scn.nextInt();
			switch(choice4){
			case 1: {
				System.out.println("Enter the size of the Long Type Array");
				int size=scn.nextInt();
				longTypeArrays= new long[size];
				System.out.println("Long Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Int type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<longTypeArrays.length;i++){
                	System.out.println(longTypeArrays[i]);
                }
                System.out.println("Long Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<longTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Long type arrays at the "+i+" index");
                   longTypeArrays[i]=scn.nextLong();
                }
                System.out.println("Long Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                longTypeArrays=null;
                System.out.println("Long Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data4=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data4);
	    }
		break;
		case 5:{
				System.out.println("You have selected Float Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Float Type Array");
			System.out.println("2.Read The Float Type Array");
			System.out.println("3.Update The Float Type Array");
			System.out.println("4.Delete The Float Type Array");
			System.out.println("5.Exit");
			int choice5=scn.nextInt();
			switch(choice5){
			case 1: {
				System.out.println("Enter the size of the Float Type Array");
				int size=scn.nextInt();
				floatTypeArrays= new float[size];
				System.out.println("Float Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Float type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<floatTypeArrays.length;i++){
                	System.out.println(floatTypeArrays[i]);
                }
                System.out.println("Float Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<floatTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Float type arrays at the "+i+" index");
                   floatTypeArrays[i]=scn.nextFloat();
                }
                System.out.println("Float Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                floatTypeArrays=null;
                System.out.println("Float Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data5=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data5);
	    }
		break;
		case 6:{
				System.out.println("You have selected Double Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Double Type Array");
			System.out.println("2.Read The Double Type Array");
			System.out.println("3.Update The Double Type Array");
			System.out.println("4.Delete The Double Type Array");
			System.out.println("5.Exit");
			int choice6=scn.nextInt();
			switch(choice6){
			case 1: {
				System.out.println("Enter the size of the Double Type Array");
				int size=scn.nextInt();
				doubleTypeArrays= new double[size];
				System.out.println("Double Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Double type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<doubleTypeArrays.length;i++){
                	System.out.println(doubleTypeArrays[i]);
                }
                System.out.println("Double Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<doubleTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Double type arrays at the "+i+" index");
                   doubleTypeArrays[i]=scn.nextDouble();
                }
                System.out.println("Double Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                doubleTypeArrays=null;
                System.out.println("Double Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data6=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data6);
	    }
		break;
		case 7:{
				System.out.println("You have selected Char Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Char Type Array");
			System.out.println("2.Read The Char Type Array");
			System.out.println("3.Update The Char Type Array");
			System.out.println("4.Delete The Char Type Array");
			System.out.println("5.Exit");
			int choice7=scn.nextInt();
			switch(choice7){
			case 1: {
				System.out.println("Enter the size of the Char Type Array");
				int size=scn.nextInt();
				charTypeArrays= new char[size];
				System.out.println("Char Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Char type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<charTypeArrays.length;i++){
                	System.out.println(charTypeArrays[i]);
                }
                System.out.println("Char Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<charTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Char type arrays at the "+i+" index");
                   charTypeArrays[i]=scn.next().charAt(0);
                }
                System.out.println("Char Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                charTypeArrays=null;
                System.out.println("Char Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data7=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data7);
	    }
		break;
		case 8:{
				System.out.println("You have selected Boolean Type Arrays");
                do{
			System.out.println("Select Your Choice");
			System.out.println("--------------------");
			System.out.println("1.Create The Boolean Type Array");
			System.out.println("2.Read The Boolean Type Array");
			System.out.println("3.Update The Boolean Type Array");
			System.out.println("4.Delete The Boolean Type Array");
			System.out.println("5.Exit");
			int choice8=scn.nextInt();
			switch(choice8){
			case 1: {
				System.out.println("Enter the size of the Boolean Type Array");
				int size=scn.nextInt();
				booleanTypeArrays= new boolean[size];
				System.out.println("Boolean Type Arrays Create Operation Performed Successfully");
			}
			break;
		    case 2: {
                System.out.println("Elements of Boolean type arrays!");
                System.out.println("----------------------------");
                for(int i=0;i<booleanTypeArrays.length;i++){
                	System.out.println(booleanTypeArrays[i]);
                }
                System.out.println("Boolean Type Arrays Read Operation Performed Successfully");
			}
			break;
		    case 3: {
                for(int i=0;i<booleanTypeArrays.length;i++){
                	System.out.println("Enter the Elements of the Boolean type arrays at the "+i+" index");
                   booleanTypeArrays[i]=scn.nextBoolean();
                }
                System.out.println("Boolean Type Arrays Update Operation Performed Successfully");
		    }
		    break;
		    case 4: {
                booleanTypeArrays=null;
                System.out.println("Boolean Type Arrays Delete Operation Performed Successfully");
		    }
		    break;
		    case 5:{
                data8=false;
                System.out.println("ThankYou! Visit Again!");
		    }
		    break;
		    default : {
			System.out.println("Invalid Choice ! Try Again!");
		    }
		    break;
		}
		}while(data8);
	    }
		break;
	    case 9:{
          data=false;
          System.out.println("Thank You! Visit Again!");
	    }
	    break;
	    default: {
	    	System.out.println("Invalid Choice! Try Again!");
	    }
	    break;
		}
		}while(data);
	}

}