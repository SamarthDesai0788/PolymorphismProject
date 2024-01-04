package basic;

public class CompileTime {
	int result;
void operation(int a,int b) {
	
		result=a+b;
		System.out.println("Addition of two int "+result);
	}
	
	void operation(int a,int b,int c) {
		
			result=a+b+c;
			System.out.println("Addition of three int "+result);
		}
	
		void operation(float a,float b) {

				result=(int) (a-b);
				System.out.println("SUb of two float "+result);
			}
	public static void main(String[] args) {
		CompileTime c1=new CompileTime();
		c1.operation(11,12);
		c1.operation(10.51f,20.51f);
		c1.operation(1, 2, 4);
	}
		}

