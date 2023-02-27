import PokemonType.*
class Pokemon(

    val id: Int, val name: String, val type: PokemonType
)

class Trainer(
    val id: Int, val name: String
)

class Team(
    val trainerId: Int, val pokemonId: Int, val fightLevel: Int
)

class League {
    private val trainers = listOf(
        Trainer(1, "Ash Ketchup"),
        Trainer(2, "Misty Star"),
        Trainer(3, "Brok Rock"),
        Trainer(4, "Max Powell"),
        Trainer(5, "Mu from Aries"),
        Trainer(6, "Milhouse"),
        Trainer(7, "Karla Morrison"),
        Trainer(8, "Peter Parker"),
        Trainer(9, "Ivan Motoa"),

        )

    private val pokemons = listOf(
        Pokemon(1, "Bulbasaur", PLANT),
        Pokemon(2, "Ivysaur", PLANT),
        Pokemon(3, "Venasaur", PLANT),
        Pokemon(4, "Charmander", FIRE),
        Pokemon(5, "Charmeleon", FIRE),
        Pokemon(6, "Charizard", FIRE),
        Pokemon(7, "Squirtle", WATER),
        Pokemon(8, "Wartortle", WATER),
        Pokemon(9, "Blastoise", WATER),
        Pokemon(10, "Caterpie", BUG),
        Pokemon(11, "Metapod", BUG),
        Pokemon(12, "Butterfree", BUG),
        Pokemon(13, "Parkysauro", FIGHTER),
        Pokemon(14, "Chocometon", FLYER)

    )

    private var teams = listOf(
        Team(1, 1, 23),
        Team(4, 11, 31),
        Team(7, 9, 58),
        Team(5, 7, 19),
        Team(1, 4, 52),
        Team(6, 12, 11),
        Team(8, 1, 90),
        Team(6, 11, 85),
        Team(4, 3, 94),
        Team(2, 12, 72),
        Team(6, 3, 7),
        Team(7, 10, 69),
        Team(4, 9, 78),
        Team(5, 6, 90),
        Team(8, 4, 72),
        Team(3, 4, 96),
        Team(1, 11, 96),
        Team(1, 2, 8),
        Team(3, 11, 69),
        Team(1, 7, 58),
        Team(5, 9, 48),
        Team(5, 5, 74),
        Team(4, 7, 12),
        Team(8, 12, 33),
        Team(4, 8, 26),
        Team(4, 5, 84),
        Team(3, 12, 96),
        Team(9, 13, 100),
        Team(5, 1, 26),
        Team(1, 10, 66),
        Team(8, 10, 77),
        Team(6, 9, 66),
        Team(8, 11, 96),
        Team(3, 1, 21),
        Team(4, 12, 13),
        Team(5, 12, 79),
        Team(1, 9, 96),
        Team(5, 10, 16),
        Team(4, 6, 97),
        Team(7, 6, 39),
        Team(7, 4, 35),
        Team(9, 14, 99),



    )

    //Returns descending list of trainers ID
    fun listTrainersIds():List<Int?>
    {
        val trainersId= listOf(null)
        return trainersId
    }

    //Returns trainer with more pokemons
    fun trainerMorePokemons():String{
        return ""
    }

    fun trainerLessPokemons():String{
        return ""
    }

    //Most common pokemon
    fun mostCommonPokemon():String{
        return ""
    }

    //List of most rare pokemons ordered by increasing level
    fun mostRarePokemons():List<String?>
    {
        val rarePokemons = listOf(null)
        return rarePokemons
    }

    //Return the level of the pokemonteam. The total of level of the pokemons of the trainer.
    fun teamPokemonLevel(trainerId: Int):Int
    {
        return 0
    }

    //Returns the Name of the trainer who wins
    fun pokemonBattle(team1: Int, team2: Int):String
    {

        //Pokemon battle winner is a team who total of pokemmon level divided by quantity(average) is bigger than the other team

        //i.e. Team A has 2 pokemons with total level of 300 -> average is 150 The battle will be calculated with this
        // Team B has 3 pokemons with a total level of 315 -> average is  105.

        // In the example Team A wins.

        // Use float or Double for the calculation of average

        return ""
    }

}