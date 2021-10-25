package com.jetpack.listitemdeletion.model

data class Fruit(
    val name: String,
    val count: Int
)

fun getFruitList() = listOf(
    Fruit("Apple", 1),
    Fruit("Bananas", 2),
    Fruit("Cherries", 3),
    Fruit("Damson plum", 4),
    Fruit("Elderberry", 5),
    Fruit("Finger Lime", 6),
    Fruit("Grapefruit", 7),
    Fruit("Honeydew Melon", 8),
    Fruit("Indonesian Lime", 9),
    Fruit("Jack Fruit", 10),
    Fruit("Kaffir Lime", 11),
    Fruit("Longan, Lychee", 12),
    Fruit("Mandarin Orange", 13),
    Fruit("Navel Orange", 14),
    Fruit("Oval Kumquat", 15),
)
