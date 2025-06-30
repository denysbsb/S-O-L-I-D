// O.
// Open Closed Principle
// Principio aberto e fechado, aberto para externsâo fechado para modificação
// pode acrescentar coisas, mas nâo precisa mexer no que funciona

/* Exemplo errado */

fun calculateDiscount(discount : String): Int {
    return when(discount){
        "vip"-> 10
        "worker"-> 20
        else -> 0
    }
}

/* Exemplo certo */

interface DiscountStrategy{
    fun getDiscount(): Double
}

class VipDiscount : DiscountStrategy {
    override fun getDiscount(): Int{
        return 10
    }
}

class WorkerDiscount : DiscountStrategy {
    override fun getDiscount():Int {
        return 20
    }
}

fun calculateDiscount(discount: DiscountStrategy): Int{
    discount.getDiscount()
}