package br.com.fim_de_feira.util

import br.com.fim_de_feira.entities.OrderHistory;
import br.com.fim_de_feira.entities.Costumer;
import br.com.fim_de_feira.entities.OrderDetails;
import br.com.fim_de_feira.entities.Product;
import br.com.fim_de_feira.entities.Supermarket;


object Session {
    var costumer: Costumer? = null
    var orderHistory: OrderHistory? = null
    var orderDetails: OrderDetails? = null
    var product: Product? = null
    var supermarket: Supermarket? = null

    val orderHistoryList = mutableListOf<OrderHistory>(

    )
}