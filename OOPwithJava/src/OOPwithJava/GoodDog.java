/**
 * 
 */
package OOPwithJava;

/**
 * 
 */
public class GoodDog {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		private int size;
		public int getsize() {
			return size;
		}
		public void setsize(int s) {
			size =s;
		}
		
		void bark() {
			if (size>60) {
				System.out.println("Woof! Woof!");
			}
			else if (size>14) {
				System.out.println("Ruff! Ruff!");
				
			}else { 
				System.out.println("Yip! Yip!");
			}
		} 
		
		}


