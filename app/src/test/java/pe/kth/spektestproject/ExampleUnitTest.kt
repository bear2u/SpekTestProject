package pe.kth.spektestproject

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

object ExampleUnitTest : Spek({

    val x = 2
    val y = 3

    given("x = $x and y = $y") {

        on("calculator") {
            val sum = x + y
            it("sholud be that x + y = 5") {
                assertEquals(5 , sum)
            }

            it("should be that x - y = -1") {
                val subtract = x - y
                assertEquals(-1  , subtract)
            }
        }

    }
})
