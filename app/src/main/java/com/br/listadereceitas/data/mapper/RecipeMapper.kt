package com.br.listadereceitas.data.mapper

import com.br.listadereceitas.data.entity.RecipeEntity
import com.br.listadereceitas.domain.model.RecipeDomain

fun RecipeDomain.toEntity() = RecipeEntity(
    id = id,
    name = name
)

fun RecipeEntity.toDomain() = RecipeDomain(
    id = id,
    name = name
)
