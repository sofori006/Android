# Android

## Programming Language 
We will be using the Kotlin Programming language for this series of 
tutorials because the prefered language for Android now is Kotlin as
stated by Google developers.

Kotlin is now prefered to Java because it offers simplified way of presenting
Java. You may say both Kotlin and Java or similer just that Kotlin is really 
simplified.


## Basics of Kotlin
### val and var

``` 
val is used for variables whose value never change. They can only be reassined.

var is used for variable whose value change.

```

Syntax for variable declaration

```
<key-word> variable_name : variable_type = <value_being_stored> (optional)

eg. var count: Int = 10
    count = 15;

    val languageName : String = "Kotlin"
```

### Type inference

This is when Kotlin just infer the variable type based on the assigned value.
eg. 	 
	val languageName = "Kotline" 

	.toUpperCase() and .inc() can be called on only strings and integers respectively


### Null Stafely
In some programing languages, you can just define a variable and give it a null 
value. This simply does not apply to Kotlin. In Kotlin a variable must be 
nullable to be able to hold a null value. Nullbles have '?' in their definition

	//Fails to compile
	 val languageName : String = null 
must be:	 
	 val lanugage: String? = null

## Conditionals
### if-else conditionals
The following is an example of how the `if/else` conditionals are constructed.
```
if (count == 42){
    println("I have the answer.")
} else {
    println("The answer eludes me.")
}

```

If you have multiple conditions, you will use `if` and `else` for the first
and last conditions respectively and any other condition in between them will
take `else if`. For example;

``` 

if (count == 42){ 
  println("I have the answer.") } 
else if (count > 45){
  println("The answer is close")} 
else { 
  println("The answer eludes me.")}

```

When you are to return the result of a condtional, you dont need to use `return`
keyword. you only assign `if` of the conditional to a variable. 
eg:
```
val answerString: String = if (count == 42) {
    "I have the answer."
} else if (count > 35) {
    "The answer is close."
} else {
    "The answer eludes me."
}

println(answerString)

```

As your conditionals increase and complexity sets, you can use the `arrow notation` to represent
your conditions. For instance, the above can be rewritten as:
```
val answerString = when {
    count == 42 -> "I have the answer."
    count > 35 -> "The answer is close."
    else -> "The answer eludes me."
}

println(answerString)

```

### Functions
In Kotlin, just as other prgramming languages demand a keyword for function 
declaration. The keyword used is `fun`.
Building on the previous examples, here's a complete Kotlin function:

```
fun generateAnswerString(): String {
      val answerString = if (count == 42) {
      "I have the answer."
  }   else {
        "The answer eludes me"
    }

     return answerString
}

```
The above function does not take any input and hence, in calling it, no input 
is passed.
You can assign the value it returns to a variable as follows:

```
val answerString = generateAnswerString()

```

In declaraing a function that takes input, you will have to specify the type of
input it takes, as shown in the following example.

```
fun generateAnswerString(countThreshold: Int): String {
    val answerString = if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }

    return answerString
}

```

Simplifying function declarations 

```
fun generateAnswerString(countThreshold: Int): String {
    return if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }
}

```


## Classes
The keyword `class` is used to create a class. A simple class is as follows;

```
class Car {
    val wheels = listOf<Wheel>()
}
```
Note that wheels is a public val, meaning that wheels can be accessed from 
outside of the Car class, and it can't be reassigned. If you want to obtain 
an instance of Car, you must first call its constructor. From there, 
you can access any of its accessible properties.

```
val car = Car() // construct a Car
val wheels = car.wheels // retrieve the wheels value from the Car

```

