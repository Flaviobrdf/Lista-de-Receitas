package com.br.listadereceitas.data.repository

import com.br.listadereceitas.data.dao.RecipeDao
import com.br.listadereceitas.data.mapper.toDomain
import com.br.listadereceitas.data.mapper.toEntity
import com.br.listadereceitas.domain.model.RecipeDomain
import com.br.listadereceitas.domain.repository.RecipeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipeRepositoryImpl(private val dao: RecipeDao) : RecipeRepository {
    override suspend fun getAll(): List<RecipeDomain> = withContext(Dispatchers.IO){
        dao.getAll().map {
            it.toDomain()
        }
    }

    override suspend fun insert(recipe: RecipeDomain) = withContext(Dispatchers.IO){
        dao.insert(recipe.toEntity())
    }

}