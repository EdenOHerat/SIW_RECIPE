package it.uniroma3.siw.siw_recipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.siw_recipes.model.Recipe;
import it.uniroma3.siw.siw_recipes.repo.RecipeRepo;

@Service
public class RecipeService {
	
	@Autowired
	private RecipeRepo rr;
	
	//Get all
	public Iterable<Recipe> getAllRecipes() {
		return rr.findAll();
	}
	//Get single by id
	public Recipe getRecipeById(Long id) {
		return rr.findById(id).get();
	}
	//Save
	public void saveRecipe(Recipe recipe) {
		rr.save(recipe);
	}
}
