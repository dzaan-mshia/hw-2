class Fraction(private var numerator : Int, private var denumerator: Int){

    fun add(fraction: Fraction): Fraction {
        val numerator = this.numerator * fraction.denumerator + fraction.numerator * this.denumerator
        val denumerator = this.denumerator * fraction.denumerator
        return Fraction(numerator,denumerator)
    }

    fun multiply(fraction: Fraction):Fraction{
        val numerator = this.numerator * fraction.numerator
        val denumerator = this.denumerator * fraction.denumerator
        return Fraction(numerator, denumerator)
    }

    fun shekveca(): Fraction {
        var denumerator = this.denumerator
        var numerator = this.numerator

        val min = numerator.coerceAtMost(denumerator)
        for (i in 2 until min){
            while (denumerator % i == 0 && numerator % i == 0){
                denumerator /= i
                numerator /= i
            }
        }
        return Fraction(numerator, denumerator)
    }

    override fun toString(): String {
        return "$numerator / $denumerator"
    }

    override fun equals(any:Any?): Boolean{
        if (any == null) {
            return false
        }
        if (any !is Fraction) {
            return false
        }
        return (this.denumerator / this.numerator ) == (any.denumerator / any.numerator)
    }

}