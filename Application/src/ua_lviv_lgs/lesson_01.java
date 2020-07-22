package ua_lviv_lgs;

public class lesson_01 {

	public static void main(String[] args) {
		
//		1.Написати по одній змінній кожного типу примітивних типів даних

			byte a1 = 5;
			short a2 = 15;
			int a3 = 207;
			long a4 = 1684689L;
			float b1 = 2.3F;
			double b2 = 127.986;
			char c = 'f';
			boolean d = true;
			
//			2. Вивести на консоль мінімальне і максимальне значення типів даних

			System.out.println("Byte =" + Byte.MAX_VALUE);
			System.out.println("Byte =" + Byte.MIN_VALUE);

			System.out.println("Short =" + Short.MAX_VALUE);
	        System.out.println("Short =" + Short.MIN_VALUE);

			System.out.println("Integer =" + Integer.MAX_VALUE);
	        System.out.println("Integer =" + Integer.MIN_VALUE);

			System.out.println("Long =" + Long.MAX_VALUE);
			System.out.println("Long =" + Long.MIN_VALUE);
			
			System.out.println("Float =" + Float.MAX_VALUE);
			System.out.println("Float =" + Float.MIN_VALUE);
			
			System.out.println("Double =" + Double.MAX_VALUE);
			System.out.println("Double =" + Double.MIN_VALUE);
			
			System.out.println("Character =" + Character.MAX_VALUE);
			System.out.println("Character =" + Character.MIN_VALUE);

			
//			3. Створити масив, наповнити його 10 значеннями типу int, знайти максимальне та мінімальне значення в масиві та вивести їх на консоль
			
			int[] array = new int[10];
			for(int a = 1; a < array.length;a++) {
			array[a] = (int)(Math.random()*99 +1);
			}
			
			System.out.println("Maximum value of array: " + max (array));
		    System.out.println("Minimum value of array: " + min (array));

		}

		private static int min(int[] array) {
			 int max = array[1];
		    for (int a = 1; a < array.length; a++) {
		        if(max > array[a]) {
		          max = array[a];
		        }
		    }

			return max;
		}

		private static int max(int[] array) {
			
			 int min = array[1];
			    for (int a = 1; a < array.length; a++) {
			      if (min < array[a]) {
			        min = array[a];
			      }
			    }
			    return min;
			    
			    // First commit to gitHub
				
			  }
			}


