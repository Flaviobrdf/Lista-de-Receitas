package com.br.listadereceitas.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.br.listadereceitas.data.entity.Recipe
import com.br.listadereceitas.data.entity.RecipeEntity

@Dao
interface RecipeDao {
    @Query("Select * FROM recipe")
    fun getAll() : List <RecipeEntity>

    @Insert
    fun insert(recipe: RecipeEntity)
}