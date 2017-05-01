package com.coursera.learning

import org.scalatest.FunSuite

class Operators$Test extends FunSuite {

  test("testAnd") {
    assert(Operators.and(true, true))
    assert(!Operators.and(true, false))
    assert(!Operators.and(false, true))
    assert(!Operators.and(false, false))
  }

  test("testOr") {
    assert(Operators.or(true, true))
    assert(Operators.or(true, false))
    assert(Operators.or(false, true))
    assert(!Operators.or(false, false))
  }
}
