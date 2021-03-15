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
eg. 	``` val languageName = "Kotline" ```

	.toUpperCase() and .inc() can be called on only strings and integers respectively


### Null Stafely
In some programing languages, you can just define a variable and give it a null 
value. This simply does not apply to Kotlin. In Kotlin a variable must be 
nullable to be able to hold a null value. Nullbles have '?' in their definition

	//Fails to compile
	``` val languageName : String = null ```
	
	must be ``` val lanugage: String? = null ```

## Conditionals
