package GasCalculator

import CalculationUnit
import Price
import Requests.get
import Requests.toJsonObject

class Gas: CalculationUnit {
    private val price = Price(0.0)
    override fun calculate(amount: Double): Price {
        val pricePerLiter = getCurrentPrice()
        price.changeValue(amount*pricePerLiter)
        return price
    }

    private fun getCurrentPrice(): Double{
        val jsonString = get("localhost:8080/prices/gas")
        val price = toJsonObject(jsonString).get("Preco")
        return price.asDouble
    }

    override fun toString(): String {
        return "At ${getCurrentPrice()}€/L the cost is ${price.toString()}"
    }
}