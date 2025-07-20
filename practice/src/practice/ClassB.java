package practice;

public  class ClassB {
	
	public static void main(String[] args) {
		
		String A="Java";
		String B="Python";
		
		Thread t1=new Thread() {
			
			public void run()
			{
				synchronized(A){
					System.out.println("Thread 1 locked on A");
					
					try {
						System.out.println("sleep");
						Thread.sleep(10000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					synchronized(B)
					{
						System.out.println("Thread 1 locked on B");
					}
				}
				System.out.println("No dead lock");
			}
		};
		
		Thread t2=new Thread()
				{
			public void run()
			{
				synchronized (B)
				{
					System.out.println("Thread 2 blocked on A");
					
					try {
						System.out.println("sleep");
						Thread.sleep(10000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					
					synchronized(A)
					{
						System.out.println("Thread 2 blocked on B");
					}
				}
				System.out.println("No dead lock");
			}
			
				};
				
	
			t1.start();
			t2.start();
	}
}

