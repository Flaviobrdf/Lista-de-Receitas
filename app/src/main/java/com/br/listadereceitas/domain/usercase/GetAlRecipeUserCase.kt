package com.br.listadereceitas.domain.usercase

import com.br.listadereceitas.domain.repository.RecipeRepository

class GetAlRecipeUserCase constructor(
    private val repository: RecipeRepository
){
    suspend operator fun invoke() = repository.getAll()
}