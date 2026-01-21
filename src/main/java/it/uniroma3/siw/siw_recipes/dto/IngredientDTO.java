package it.uniroma3.siw.siw_recipes.dto;

import it.uniroma3.siw.siw_recipes.model.ingredients.Unit;

public class IngredientDTO {
	
	private Long ingredientId;
	private float quantity;
	private Unit unit;
	
	public IngredientDTO() {}

	public Long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long id) {
		this.ingredientId = id;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
}
