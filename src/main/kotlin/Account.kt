package org.guivic

abstract class Account (val user: String, val amount: Double) {
    open fun printData() {
        println("User: $user, Amount: $amount")
    }
}