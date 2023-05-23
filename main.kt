data class Product(val name: String, val price: Double)

class ShoppingCart {
    private val items = mutableListOf<Product>()

    fun addItem(product: Product) {
        items.add(product)
    }

    fun removeItem(product: Product) {
        items.remove(product)
    }

    fun getTotalPrice(): Double {
        var totalPrice = 0.0
        for (product in items) {
            totalPrice += product.price
        }
        return totalPrice
    }

    fun displayItems() {
        println("Shopping Cart Items:")
        for (product in items) {
            println("${product.name} - $${product.price}")
        }
    }
}

fun main() {
    val cart = ShoppingCart()

    val product1 = Product("Item 1", 10.0)
    val product2 = Product("Item 2", 15.0)
    val product3 = Product("Item 3", 5.0)

    cart.addItem(product1)
    cart.addItem(product2)
    cart.addItem(product3)

    cart.displayItems()

    println("Total Price: $${cart.getTotalPrice()}")

    cart.removeItem(product2)

    cart.displayItems()

    println("Total Price: $${cart.getTotalPrice()}")
}
