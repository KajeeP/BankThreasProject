
public class DriverMain {

	public static void main(String[] args) {
	   Bank obj = new Bank(500.0);

		        // Create threads for 4 withdrawals and 4 deposits
		        ThreadWithdrawal[] withdrawals = {
		            new ThreadWithdrawal(obj, "Withdrawer1", 100),
		            new ThreadWithdrawal(obj, "Withdrawer2", 100),
		            new ThreadWithdrawal(obj, "Withdrawer3", 100),
		            new ThreadWithdrawal(obj, "Withdrawer4", 100),
		        };

		        ThreadDeposit[] deposits = {
		            new ThreadDeposit(obj, "Depositor1", 50),
		            new ThreadDeposit(obj, "Depositor2", 50),
		            new ThreadDeposit(obj, "Depositor3", 50),
		            new ThreadDeposit(obj, "Depositor4", 50),
		        };

		        // Start all withdrawal threads
		        for (ThreadWithdrawal t : withdrawals) {
		            t.start();
		        }

		        // Start all deposit threads
		        for (ThreadDeposit d : deposits) {
		            d.start();
		        }

		        // Optional: wait for all threads to finish
		        try {
		            for (ThreadWithdrawal t : withdrawals) {
		                t.join();
		            }
		            for (ThreadDeposit d : deposits) {
		                d.join();
		            }
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }	
	}


