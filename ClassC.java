public class ClassC {
	
void meth1(int i) {
		System.out.println("-------meth1()----");
		while(i<=5)
		{
			System.out.println("i value:"+i);
			i++;
		}
		System.out.println("meth() execution completed");
		}
	//-----------------------------------------------------------
	void meth2(int i) {
		System.out.println("-------meth2()----");
		while(i>=1)
		{
			System.out.println("i value:"+i);
			i++;
		}
		System.out.println("meth() execution completed");
	}
	//_________________________________
	void meth3(int i) {
		System.out.println("-------meth3()----");
		while(i>=1)
		{
			System.out.println("i value:"+i++ + " "+ ++i);
			i++;
		}
		System.out.println("meth() execution completed");
		}
	//=============================
		void meth4(int i) {
		System.out.println("-------meth4()----");
		while(i>=11)
		{
			System.out.println("i value:"+i);
			i++;
		}
		System.out.println("meth() execution completed");
		}
		void meth5(int i) {
			System.out.println("-------meth5()----");
			while(true)
			{
				System.out.println("i value:"+i);
				i++;
			}
			//System.out.println("meth() execution completed");
			}
		void meth6(int i,int j) {
			System.out.println("-------meth1()----");
			while(i<=5)
			{
				System.out.println("i value:"+i);
				i++;
			}
			System.out.println("meth() execution completed");
			}
		void meth7(int i) {
			System.out.println("-------meth1()----");
			do {
				System.out.println("i value:"+i);
				i++;
				}
			while(i<=5);
			{
				System.out.println("i value:"+i);
				i++;
			}
			System.out.println("meth() execution completed");
			}
	public static void main(String[] args) {
		ClassC aobj=new ClassC();
		//aobj.meth1(1);
		//aobj.meth2(10);
		//aobj.meth3(5);
		//aobj.meth4(10);
		//aobj.meth5(1);
		//aobj.meth6(1,4);
		aobj.meth7(10);  
	}
	}


