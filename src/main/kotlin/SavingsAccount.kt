package org.guivic

class SavingsAccount(user: String, amount: Double): Account(user, amount) {
    override fun printData() {
        println("Savings Account")
        super.printData()
    }

}