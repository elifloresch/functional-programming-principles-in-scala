package com.coursera.learning

object Operations {
  def sqrt(x: Double): Double = {
    def isGoodEnough(guess: Double) =
      Math.abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    sqrtIter(1.0)
  }

  def factorial(x: Int): Int = {
    def loop(acc: Int, x: Int): Int = {
      if (x == 0) acc
      else loop(acc * x, x - 1)
    }

    loop(1, x)
  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcd(b, a % b)
  }
}
