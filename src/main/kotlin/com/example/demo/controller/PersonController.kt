package com.example.demo.controller

import com.example.demo.model.Person
import javafx.collections.ObservableList
import javafx.scene.control.Alert
import tornadofx.*

class PersonController : Controller() {


    fun save(person: Person?) {
        println("Saving ${person?.name} / ${person?.title}")
    }

    fun deletePerson (){

    }

    /*
    * */
    fun persons(): ObservableList<Person> = listOf(
        Person("John", "Manager"),
        Person("Reda", "Sopporter"),
        Person("Fernando", "Developer"),
        Person("Mark", "Developer"),
        Person("Felipe", "Developer"),
        Person("Jay", "Worker bee")).observable()


}