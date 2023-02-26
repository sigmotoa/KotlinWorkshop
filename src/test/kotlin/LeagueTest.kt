import org.junit.Test

import org.junit.Assert.*

class LeagueTest {

    private val league = League()

    @Test
    fun listTrainersIdsTest() {
        assertEquals(
            "Wrong order",
            listOf(9, 8, 7, 6, 5, 4, 3, 2, 1), league.listTrainersIds()
        )
    }

    @Test
    fun trainerMorePokemonsTest() {
        assertEquals("Wrong Trainer", "Max Powell", league.trainerMorePokemons())
    }

    @Test
    fun trainerLessPokemonTest() {
        assertEquals("Wrong Trainer", "Misty Star", league.trainerLessPokemons())
    }

    @Test
    fun mostCommonPokemonTest() {
        assertEquals("Wrong Pokemon", "Butterfree", league.mostCommonPokemon())
    }

    @Test
    fun mostRarePokemonsListTest() {
        assertEquals(
            "Wrong Order",
            listOf("Ivysaur", "Wartortle", "Chocometon", "Parkysauro"),
            league.mostRarePokemons()
        )
    }

    @Test
    fun teamPokemon2LevelTest()
    {
        assertEquals("Wrong data", 72, league.teamPokemonLevel(2))
    }
@Test
    fun teamPokemon1LevelTest()
    {
        assertEquals("Wrong data", 399, league.teamPokemonLevel(1))
    }
@Test
    fun teamPokemon3LevelTest()
    {
        assertEquals("Wrong data", 282, league.teamPokemonLevel(3))
    }
@Test
    fun teamPokemon9LevelTest()
    {
        assertEquals("Wrong data", 199, league.teamPokemonLevel(9))
    }

}