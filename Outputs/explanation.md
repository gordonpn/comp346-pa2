# Phase I

In this phase, we decided to use synchronized blocks to protect the critical sections when editing the account information.

The object we are protecting is the account array. 

Before each block where the account information is queried (getBalance()) and set (setBalance()), we use a synchronized block around it.

# Phase II

The average running time when using semaphores is a greater than purely using busy-waiting with yield().

Busy-waiting is better for performance of threads because the threads can respond quickly.

On the other hand, semaphores are better for overall system performance because CPU *cycles* are not wasted.