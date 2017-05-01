package com.coursera.learning

import org.scalatest.FunSuite

class Operations$Test extends FunSuite {

  test("testFactorial") {
    assert(Operations.factorial(0) == 1)
    assert(Operations.factorial(1) == 1)
    assert(Operations.factorial(2) == 2)
    assert(Operations.factorial(5) == 120)
  }

}
