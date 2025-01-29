# Direct Access to Private Variable in Scala

This example demonstrates a common error in Scala: attempting to directly access a private variable from outside the class.  Private variables are, by design, only accessible within the defining class.  This example shows how to correctly access and modify the private variable via the provided methods. 

## How to Reproduce

1. Compile and run the code in `bug.scala`.  
2. Observe the compilation error when trying to access `privateVar` directly.
3. Compare this to the correct method provided in `bugSolution.scala`.