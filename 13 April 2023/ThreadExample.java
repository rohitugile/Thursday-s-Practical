// Ques 3. Create two threads.
//one thread is finding average of first 50 numbers and 
//other thread is printing square of number store in array arr={10,15,20,25,30}.

package April13;

class thread1 extends Thread{		// Extending Thread class to create a thread to find average
	public void run() {				// overriding run method 
		float sum = 0;			 
        for (int i = 1; i <= 50; i++) {
            sum = sum + i;
        }
        float avg = sum / 50;
        System.out.println("Average of the first 50 numbers: " + avg);
	}
}

class thread2 extends Thread {			// Extending Thread class to create a thread to print squares
	public void run() {					// overriding run method 
		int arr[] = {10, 15, 20, 25, 30};		 
		for (int i=0 ; i< arr.length; i++) {
            int square = arr[i] * arr[i];
            System.out.println("Square of " + arr[i] + " is " + square);
        }
	}
}

public class ThreadExample 
{
    public static void main(String[] args) // main thread
    {
    	thread1 t1 = new thread1();		// creating thread t1
    	thread2 t2 = new thread2();		// creating thread t2
    	
    	t1.start();						// calling start()
    	t2.start();
    	
    }
}