BankThreadsProject

This Java project demonstrates thread synchronization using a simple bank account example. It simulates deposit and withdrawal operations using multiple threads.

Features

- Bank class with synchronized `deposit()` and `withdraw()` methods
- Custom thread classes for deposit and withdrawal
- Demonstrates thread-safe access to shared data
- Console output shows account balance updates

Dummy Run Details

- Initial Balance: `$500`
- 4 Withdrawals of `$100` each
- 4 Deposits of `$50` each

Files

| File                 | Description                                  |
|----------------------|----------------------------------------------|
| `Bank.java`          | Contains the synchronized account methods    |
| `ThreadWithdrawal.java` | Withdraw thread class                     |
| `ThreadDeposit.java` | Deposit thread class                         |
| `DriverMain.java`    | Driver class to create and start threads     |

 How to Run

```bash
javac *.java
java DriverMain
