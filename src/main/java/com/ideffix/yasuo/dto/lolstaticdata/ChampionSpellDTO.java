package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class ChampionSpellDTO {
	
	private String cooldownBurn;
	private String resource;
	private LevelTipDTO leveltip;
	private List<SpellVarsDTO> vars;
	private String costType;
	private ImageDTO image;
	private String sanitizedDescription;
	private String sanitizedTooltip;
	private List<List<Double>> effect;
	private String tooltip;
	private int maxrank;
	private String costBurn;
	private String rangeBurn;
	private Object range;
	private List<Double> cooldown;
	private List<Integer> cost;
	private String key;
	private String description;
	private List<String> effectBurn;
	private List<ImageDTO> altimages;
	private String name;

	public String getCooldownBurn() {
		return cooldownBurn;
	}

	public void setCooldownBurn(String cooldownBurn) {
		this.cooldownBurn = cooldownBurn;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public LevelTipDTO getLeveltip() {
		return leveltip;
	}

	public void setLeveltip(LevelTipDTO leveltip) {
		this.leveltip = leveltip;
	}

	public List<SpellVarsDTO> getVars() {
		return vars;
	}

	public void setVars(List<SpellVarsDTO> vars) {
		this.vars = vars;
	}

	public String getCostType() {
		return costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}

	public String getSanitizedDescription() {
		return sanitizedDescription;
	}

	public void setSanitizedDescription(String sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}

	public String getSanitizedTooltip() {
		return sanitizedTooltip;
	}

	public void setSanitizedTooltip(String sanitizedTooltip) {
		this.sanitizedTooltip = sanitizedTooltip;
	}

	public List<List<Double>> getEffect() {
		return effect;
	}

	public void setEffect(List<List<Double>> effect) {
		this.effect = effect;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public int getMaxrank() {
		return maxrank;
	}

	public void setMaxrank(int maxrank) {
		this.maxrank = maxrank;
	}

	public String getCostBurn() {
		return costBurn;
	}

	public void setCostBurn(String costBurn) {
		this.costBurn = costBurn;
	}

	public String getRangeBurn() {
		return rangeBurn;
	}

	public void setRangeBurn(String rangeBurn) {
		this.rangeBurn = rangeBurn;
	}

	public Object getRange() {
		return range;
	}

	public void setRange(Object range) {
		this.range = range;
	}

	public List<Double> getCooldown() {
		return cooldown;
	}

	public void setCooldown(List<Double> cooldown) {
		this.cooldown = cooldown;
	}

	public List<Integer> getCost() {
		return cost;
	}

	public void setCost(List<Integer> cost) {
		this.cost = cost;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getEffectBurn() {
		return effectBurn;
	}

	public void setEffectBurn(List<String> effectBurn) {
		this.effectBurn = effectBurn;
	}

	public List<ImageDTO> getAltimages() {
		return altimages;
	}

	public void setAltimages(List<ImageDTO> altimages) {
		this.altimages = altimages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
