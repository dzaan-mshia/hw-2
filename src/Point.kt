class Point(private var x: Int, private var y: Int) {

    override fun toString(): String {
        return "($x , $y)"
    }

    override fun equals(second: Any?): Boolean {
        if (second == null) {
            return false
        }
        if (second !is Point){
            return false
        }
        return (this.x == second.x) && (this.y == second.y)
    }

    fun moveSymmetricallyByOrigin(){
        this.x = -this.x
        this.y = -this.y
    }

}