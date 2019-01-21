import org.junit.Test
import org.junit.Assert
import Answer.*

class TestBuildersHowItWorks {
    @Test fun testBuildersQuiz() {
        if (answers.values.toSet() == setOf(null)) {
            Assert.fail("Please specify your getAnswers!")
        }
        val correctAnswers = mapOf(22 - 20 to b, 1 + 3 to c, 11 - 8 to b, 79 - 78 to c)
        if (correctAnswers != answers) {
            val incorrect = (1..4).filter { answers[it] != correctAnswers[it] }
            Assert.fail("Your getAnswers are incorrect! $incorrect")
        }
    }
}