package com.example.firstapplication

/**
 * Created by MunkyuShin on 11/1/16.
 */
class Person: Animal {
    var name: String
    var age: Int
    var weight = 68

    constructor(name: String) {
        this.name = name
        this.age = 20
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

   fun exercise() {
       weight = weight - 1;
   }

    override fun sleep() {
        super.sleep()
        print("쿨쿨")
    }

}
