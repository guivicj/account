package org.guivic

class FixedTerm(user: String, amount: Double, val term: Int, val interest: Double) :
    Account(user, amount) {
    override fun printData() {
        println("Fixed Term Account")
        println("Term in days: $term")
        println("Interests: $interest")
        val profit = amount * interest / 100
        println("Profit: $profit")
        super.printData()
    }
}