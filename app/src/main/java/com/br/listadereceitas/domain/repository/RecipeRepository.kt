package com.br.listadereceitas.domain.repository

import com.br.listadereceitas.domain.model.RecipeDomain

interface RecipeRepository {
    suspend fun getAll(): List<RecipeDomain>
    suspend fun insert(recipe: RecipeDomain)
}