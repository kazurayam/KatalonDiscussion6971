package my.a
import com.kms.katalon.core.annotation.Keyword
class Greeting {
	@Keyword
	def greet(String someone) {
		return my.b.AI.sayHelloTo(someone)
	}
}