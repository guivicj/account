package org.guivic

fun main() {

    val savingsAccount = SavingsAccount("Joseph", 1500.5)
    savingsAccount.printData()
    println("---")
    val fixedTerm = FixedTerm("Joseph Mary", 2100.5, 10, 50.0)
    fixedTerm.printData()

}