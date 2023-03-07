import kotlin.reflect.typeOf

data class Price(var value: Int) {
    fun toPrice(value: Int): Price{
        return Price(value)
    }

    fun toValue(): Int {
        return value
    }
    override fun toString(): String {
        return "${value}€"
    }

    override fun equals(other: Any?): Boolean {
        return other is Price && other.value == value
    }


}