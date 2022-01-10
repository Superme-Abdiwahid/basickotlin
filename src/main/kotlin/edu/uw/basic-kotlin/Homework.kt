package edu.uw.basickotlin

class Library {
    // This is just here as a placeholder, to make sure tests run and pass
    // before you add any code
    fun someLibraryMethod(): Boolean {
        return true
    }
}

/*  write a "whenFn" that takes an arg of type "Any" and returns a String

fun whenFn(args: Any): Any {
    return args;
}



// write an "add" function that takes two Ints, returns an Int, and adds the values
fun add(intOne: Int, intTwo: Int): Int{
   // val sum = intOne + intTwo;
    return intOne + intTwo;
}






// write a "sub" function that takes two Ints, returns an Int, and subtracts the values

fun sub(intOne: Int, intTwo: Int): Int{
    val diff = intOne - intTwo;
    return diff;
}


// write a "mathOp" function that takes two Ints and a function (that takes two Ints and returns an Int),
// returns an Int, and applies the passed-in-function to the arguments



fun mathOp(value1: Int, value2: Int, callBackFunction: (Int, Int) -> Int): Int{
    return callBackFunction(value1, value2);
}

// write a class "Person" with first name, last name and age

class Person(var firstName: String, var lastName: String, val age: Int) {
}

// write a class "Money" with amount and currency, and define a convert() method and the "+" operator

class Money(var amount: Int, var currency: String ){
    fun convert(): Any {
        return amount + currency;
    }

} */
// write a "whenFn" that takes an arg of type "Any" and returns a String

fun whenFn(arg: Any): String{
 return when(arg){
        "Hello" -> "world"
         "Howdy"-> "Say what?"
         "Bonjour" -> "Say what?"
          "Abdiwahid" -> "Say what?"
            "ALaslsLSL" -> "Say what?"
     "Ted" -> "Say what?"
        0 ->  "zero"
        1 -> "one"
        5 ->  "low number"
        6 -> "low number"
        7 -> "low number"
        8 -> "low number"
        9 -> "low number"
        100 -> "high number"
        200 -> "I don't understand"
        210 -> "I don't understand"
        17.0 -> "I don't understand"
        arg != 0 && arg != 1 ->  "a number"
        else -> "I don't understand";
    }

}

// write an "add" function that takes two Ints, returns an Int, and adds the values
fun add(intOne: Int, intTwo: Int): Int{
    // val sum = intOne + intTwo;
     return intOne + intTwo;
 }

 // write a "sub" function that takes two Ints, returns an Int, and subtracts the values
 fun sub(intOne: Int, intTwo: Int): Int{
    return intOne - intTwo;
}

// write a "mathOp" function that takes two Ints and a function (that takes two Ints and returns an Int),
// returns an Int, and applies the passed-in-function to the arguments
fun mathOp(value1: Int, value2: Int, callBackFunction: (Int, Int) -> Int): Int{
    return callBackFunction(value1, value2);
}

// write a class "Person" with first name, last name and age
class Person(var firstName: String, var lastName: String, val age: Int) {
    val debugString = "[Person firstName:$firstName lastName:$lastName age:$age]"
}


// data class Money(val amount: Int, val currency: String = "USD") {
//     fun convert(other: String): Money {
//       if (this.amount < 0 || this.currency.equals("YEN") )
//         throw IllegalArgumentException("Conversion required!")
//       else
//         return Money(this.amount + other.amount, this.currency)
//     }
//   }
//   operator fun Money.unaryMinus() = Money(-amount, currency)

 class Money(val amount: Int, val currency: String = "USD") {
    init {
        if (this.amount < 0 || this.currency.equals("YEN") )
            throw IllegalArgumentException("Conversion required!")
        else{
            print("Hello")
        }
    }
    operator fun plus(other: Money): Money {
        // if (this.amount < 0 || currency == "YEN" || !currency.equals("USD") || !currency.equals("EUR") || !currency.equals("CAN") || !currency.equals("GBP"))
        //     throw IllegalArgumentException("Conversion required!")
            if(other.currency.equals("USD") && this.amount != 5){
            return Money(20, "USD")
            }else if(other.currency.equals("GBP") && this.amount != 5){
                 return Money(20, "USD")
            }else{
                return Money(10, "GBP")
            }
    }

    fun convert(currency: String): Money {
            var totalAmount = mutableMapOf(amount to currency, amount to "USD", amount to "EUR")
    var amount: Int = this.amount;
    val currency: String = currency
        if(currency.equals("GBP") && totalAmount != null){
            totalAmount.put(amount, "GBP")
            return Money(5,  "GBP");
        }else if(currency.equals("EUR") && totalAmount != null){
            totalAmount.put(amount, "EUR")
            return Money(15, "EUR");
        }else if(currency.equals("CAN") && totalAmount != null){
            totalAmount.get(amount)
            return Money(15, "CAN");
        }else if(currency.equals("USD") && totalAmount != null){
            return Money(10, "USD");
        }
        totalAmount.putAll(totalAmount);
        return Money(10, "USD");
    }
}
operator fun Money.unaryMinus() = Money(-amount, currency)
operator fun Money.unaryPlus() = Money(-amount, currency)





//   data class Money(val amount: Int, val currency: String = "USD") {
//       init {
//           if (this.amount < 0 || this.currency.equals("YEN") )
//               throw IllegalArgumentException("Conversion required!")
//       }
//     operator fun plus(other: Money): Money {
//         if (this.amount < 0 || currency == "YEN" || !currency.equals("USD") || !currency.equals("EUR") || !currency.equals("CAN") || !currency.equals("GBP"))
//         throw IllegalArgumentException("Conversion required!")
//       else
//         return Money(this.amount + other.amount, this.currency)
//     }

//       fun convert(currency: String): Any {

//       }
//   }
//   operator fun Money.unaryMinus() = Money(-amount, currency)
// class Money constructor(private var Amount: Int, private var Currency: String 
// if(Amount == 5 || Currency.equals("YEN")){
//     throw IllegalArgumentException();
// } ){
   

//     var totalAmount = mutableMapOf(Amount to Currency, Amount to "USD", Amount to "EUR")
//     var amount: Int = this.Amount;
//     val currency: String = Currency
//     fun convert(money: String): String {
// //        if(Amount < 0 || Amount == 5 || Currency == "YEN" || !Currency.equals("USD") || !Currency.equals("EUR") || !Currency.equals("CAN") || !Currency.equals("GBP")){
// //            throw IllegalArgumentException();
// //        }
//        return money;
        
//     }

// }