```scala
class MyClass(val name: String) {
  private var privateVar = 0

  def updatePrivateVar(newValue: Int): Unit = {
    privateVar = newValue
  }

  def getPrivateVar(): Int = privateVar
}

object Main extends App{
  val obj = new MyClass("test")
  obj.updatePrivateVar(5)
  println(obj.getPrivateVar()) //5
  println(obj.privateVar) //Error: value privateVar is not a member of MyClass
}
```