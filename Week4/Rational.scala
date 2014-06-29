object Rational{
	implicit def intToRational(x: Int) = new Rational(x)
}

class Rational(n:Int, d:Int){
	require(d != 0);	
	
	private val g = gcd(n.abs, d.abs)

	// variable
	val numer = n / g
	val denom = d / g

	def this(n:Int) = this(n, 1)

	def + (x:Int) = new Rational(numer + x * denom, denom)

	def + (x:Rational) = new Rational(numer * x.denom + x.numer * denom, denom * x.denom)

	def - (x:Int) = new Rational(numer - x * denom, denom)
	
	def - (x:Rational) = new Rational(numer * x.denom - x.numer * denom, denom * x.denom)

	def * (x:Int) = new Rational(numer * x, denom)

	def * (x:Rational) = new Rational(numer * x.numer, denom * x.denom)
		
	def / (x:Int) = new Rational(numer, x * denom)
	
	def / (x:Rational) = new Rational(numer * x.denom, denom * x.numer)

	override def toString = numer + "/" + denom	

	private def gcd(a: Int, b: Int): Int = 
		if (b == 0) a else gcd(b, a % b)
}
