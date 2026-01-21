package it.uniroma3.siw.siw_recipes.dto;

import java.util.ArrayList;
import java.util.List;

import it.uniroma3.siw.siw_recipes.model.Difficulty;

public class RecipeDTO {
	
	private String title;
	private String description;
	private int preparationTime;
	private Difficulty difficulty;
	private Long categoryId;
	private List<IngredientDTO> ingredients = new ArrayList<>();
	
	public RecipeDTO() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public List<IngredientDTO> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<IngredientDTO> ingredients) {
		this.ingredients = ingredients;
	}
}
