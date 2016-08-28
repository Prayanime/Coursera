def fibo(n: Int) : Long =
  if (n <= 1) n
  else fibo(n - 1) + fibo(n - 2)

fibo(0)
fibo(1)
fibo(2)
fibo(3)
fibo(4)
fibo(10)
fibo(40)

def fibonacci(n: Int) : Long = {
  def fibonacciIter(n: Int, twoLast: List[Long]): Long = {
    val n2 = twoLast(0)
    val n1 = twoLast(1)
    if (n == 1) n1 + n2
    else fibonacciIter(n - 1, List(n1, n1 + n2))
  }
  if (n <= 1) n
  else fibonacciIter(n - 1, List(0, 1))
}

fibonacci(0)
fibonacci(1)
fibonacci(2)
fibonacci(3)
fibonacci(4)
fibonacci(10)
fibonacci(40)

def fiboLastDigit(n: Int) : Long =
  if (n <= 1) n
  else {
    val res = fiboLastDigit(n - 1) + fiboLastDigit(n - 2)
    res % 10
  }

fiboLastDigit(0)
fiboLastDigit(1)
fiboLastDigit(2)
fiboLastDigit(3)
fiboLastDigit(4)
fiboLastDigit(10)
fiboLastDigit(40)

def fibonacciLastDigit(n: Int) : Int = {
  def fibonacciIter(n: Int, twoLast: List[Int]): Int = {
    val n2 = twoLast(0)
    val n1 = twoLast(1)
    if (n == 1) n1 + n2
    else fibonacciIter(n - 1, List(n1, (n1 + n2) % 10))
  }
  if (n <= 1) n
  else fibonacciIter(n - 1, List(0, 1))
}

fibonacciLastDigit(3)
fibonacciLastDigit(331)
fibonacciLastDigit(327305)