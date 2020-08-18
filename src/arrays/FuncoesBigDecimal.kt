package arrays

import java.math.BigDecimal

fun bigDecimalArrauOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { indice ->
        valores[indice].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()){
        BigDecimal.ZERO
    }else{
        this.somatoria() / this.size.toBigDecimal()
    }
}