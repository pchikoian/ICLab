
class Rational(n: Int, d: Int) { // This won’t compile
	require(d != 0)

	// enscapsulate for that
	val number:Int = n;
	val denom:Int = d;

	// private field
	private val g = gcd(n.abs, d.abs)

	def this(n: Int) = this(n, 1) // auxiliary constructor
	println("Created "+ n +"/"+ d)
	
	override def toString = n +"/"+ d

	// keep rational immutable
	def add(that: Rational): Rational = new Rational(number * that.denom + that.number * denom, denom * that.denom)

	// self use
	def lessThan(that: Rational) = this.number* that.denom < that.number * this.denom

	def max(that: Rational) = if (this.lessThan(that)) that else this

	// private method
	private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
