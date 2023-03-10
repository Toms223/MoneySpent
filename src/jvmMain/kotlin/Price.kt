import kotlin.reflect.typeOf

data class Price(var value: Double) {
    fun toPrice(value: Double): Price{
        return Price(value)
    }

    fun toValue(): Double {
        return value
    }

    fun changeValue(newVale: Double){
        value = newVale
    }
    override fun toString(): String {
        return "${value}€"
    }

    override fun equals(other: Any?): Boolean {
        return other is Price && other.value == value
    }


}