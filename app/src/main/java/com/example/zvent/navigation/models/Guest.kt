package com.example.zvent.navigation.models

import android.provider.ContactsContract
import androidx.navigation.NavArgs

data class Guest(val name: String = "Invitado", val phone: String = "0000-0000", val email: String = "email@email.com")

object Supplier
{
    val guest = listOf<Guest>(
        Guest("Priscilla", "7689-6789", "gon@gmail.com"),
        Guest("Francisco", "3456-6789", "gue@gmail.com"),
        Guest("Mildred", "7689-9876", "san@gmail.com"),
        Guest("Javier", "6454-7878", "liz@gmail.com"),
        Guest("Alejandra", "6546-0989", "irv@gmail.com"),
        Guest("Jenifer", "9980-0009", "cas@gmail.com"),
        Guest("Azucena", "6656-7674", "pre@gmail.com"),
        Guest("Diego", "3134-5345", "gut@gmail.com"),
        Guest("David", "3243-7353", "ret@gmail.com"),
        Guest("Melanie", "3679-0414", "lop@gmail.com")
    )
}
