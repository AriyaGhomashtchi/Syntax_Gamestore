package com.example.syntax_gamestore.data

import com.example.syntax_gamestore.R
import com.example.syntax_gamestore.data.model.Category
import com.example.syntax_gamestore.data.model.Game

class Datasource {

    fun getGames(): List<Category>{
        return listOf(
            Category(
                "Action",
                listOf(
                    Game(
                        "Zombie City",
                        R.drawable.action1,
                        3.6
                    ),
                    Game(
                        "Hunger",
                        R.drawable.action2,
                        4.2
                    ),
                    Game(
                        "Prince of War",
                        R.drawable.action3,
                        4.8
                    )
                )
            ),
            Category(
                "Adventure",
                listOf(
                    Game(
                        "Foggy Streets",
                        R.drawable.adventure1,
                        3.9
                    ),
                    Game(
                        "Mystic Quest",
                        R.drawable.adventure2,
                        4.7
                    ),
                    Game(
                        "Kingslayer",
                        R.drawable.adventure3,
                        3.2
                    )
                )
            ),
            Category(
                "Simulation",
                listOf(
                    Game(
                        "Holiday Simulator (Teheran Edition)",
                        R.drawable.sim1,
                        4.6
                    ),
                    Game(
                        "Goat Simulator",
                        R.drawable.sim2,
                        5.0
                    ),
                    Game(
                        "Veggie Farmer Deluxe",
                        R.drawable.sim3,
                        3.9
                    ),
                    Game(
                        "City Builder",
                        R.drawable.sim4,
                        2.1
                    )
                )
            )
        )
    }
}