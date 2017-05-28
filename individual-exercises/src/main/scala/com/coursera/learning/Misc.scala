package com.coursera.learning

object Misc {

  def main(args: Array[String]): Unit = {
    println(sum(x => x)(1, 5))
    println(product(x => x)(1, 5))
    println(fact(5))
  }

  def sum(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x + y, 0)(a, b)

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  def fact(n: Int): Int = {
    product(x => x)(1, n)
  }

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, combine(f(a), acc))
    }

    loop(a, zero)
  }

}
