# PowerReviews Backend Code Test

I am excited to have the opportunity to interview for 1World and the PowerReviews team! Enclosed you will find my 
solution to the Backpack Problem. In this README, I will give you a brief overview of the project structure.

### Backpack.java
This file is the model object of the project and represents the concept of a backpack in the code. For this solution,
I decided to let the backpack object to control it's own usage in order to ensure consistency. This file features two
slightly different implementations of it's constructor to demonstrate how the solution might change to fit certain
priorities. For the rest of the project, the assumption is made that additional complexity is not an issue and that the
ability to dynamically handle a wider range of scenarios is more desirable. 

### Service.java
This file mimics the service layer of an application and is the place where the problem's main task is computed. Calling
this function is how the project delivers results to the user for purposes of evaluating this solution. In a larger
implementation of this project, the assumption is multiple different functions would live in this file, each serving as
a solution to a business requirement. 

### Main.java 
This file is a rough-and-ready implementation for demonstrating the correctness of the solution. A capacity and a list
of items is fed to the main function and a result is printed to the terminal. Both can be changed at will. Running this 
file's main method will serve to allow you, the user, to run the solution. 

### TestCode.java 
This file represents a test suite that would be present in the larger implementation. Present in this file are 4 JUnit
tests covering the 3 examples outputs and a 4th edge case. Should you, the user, prefer, running these test cases 
will serve as proof of the solution's correctness. 