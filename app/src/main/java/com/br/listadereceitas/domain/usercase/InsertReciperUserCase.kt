package com.br.listadereceitas.domain.usercase

import com.br.listadereceitas.domain.repository.RecipeRepository


class InsertReciperUserCase constructor(
    private val repository: RecipeRepository
){
    suspend operator fun invoke(recipe: RecipeRepository) = repository.insert(recipe)
}