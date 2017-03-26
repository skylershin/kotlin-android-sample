# Play with Loop
Hi all!  
Today, we will cover how to iterate using while, do-while, for loop.

## How to select certain expression between them?
Okay. I can give a some tips. If you has a some condition and want to execute code until match that, recommend using `while` loop.  
And, there are codes do must execute before check the condition, use a `do-while` loop.  
Or will you deal with a Collections, a Range? Then recommend play with for loop.

## Why use a `for`loop to deal with a Collections?
`for` loop use a `in` operator for iterating through a collections. like this.</br>
```kotlin
    for(item in list) {
      //some codes.
    }
```
</br>
So you can write for loop expression in a concise manner. It's awesome!!
## How about a Range?
`Range` is a very concise way to express range has a start point and end point. In java, or many traditional language express this way. `i=0; i<10; i++` like c. `Range` is more comprehensive and intuitive than before.</br>
```kotlin
    for(num in 1..10) {
      print(num)
    }
```
Futhermore, if you want to get a number have interval of about 5. Then, </br>
```kotlin
    for(num in 1..10 step 5) {
      print(num)
    }
```
Yay! Next, Check the `MainActivity.kt` file. There are sample codes answer about 'Calculate a karvonen heartbeat.' question. You can solve too, using while or do-while or for loop.   
Thanks. See you in the next chapter.

## How study kotlin-android using this repository?
To use this repository, I introduce several branch strategies.
* First, master branch has only README file.
So don't click back button. Instead, please select another branch, read some codes.
* Second, branch names mean the subject of each class. You can select interesting subject likes kotlin function-lambda or class-OOP, and then fork the codes, run on your device!

## Contributes
I recommend contributing your own codes using pull request.     
**Make sure you're pulling request to branch that matches class subject.**
