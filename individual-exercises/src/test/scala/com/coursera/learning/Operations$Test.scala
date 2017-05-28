package com.coursera.learning

import org.scalatest.FunSuite

class Operations$Test extends FunSuite {

  test("testFactorial") {
    assert(Operations.factorial(0) == 1)
    assert(Operations.factorial(1) == 1)
    assert(Operations.factorial(2) == 2)
    assert(Operations.factorial(5) == 120)
  }

  test("test GDC") {
    assert(Operations.gcd(5, 25) == 5)
    assert(Operations.gcd(7, 49) == 7)
    assert(Operations.gcd(10, 70) == 10)
    assert(Operations.gcd(70, 49) == 7)
  }

}
