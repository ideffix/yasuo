package com.ideffix.yasuo.dto.lolstaticdata;

import java.util.List;

/**
 * @author IdeFFiX
 *
 * Jul 20, 2017
 */
public class SummonerSpellDTO {
	
	private List<SpellVarsDTO> vars;
	private ImageDTO image;
	private String costBurn;
	private List<Double> cooldown;
	private List<String> effectBurn;
	private int id;
	private String cooldownBurn;
	private String tooltip;
	private int maxrank;
	private String rangeBurn;
	private String description;
	private List<Double> effect;
	private String key;
	private LevelTipDTO leveltip;
	private List<String> modes;
	private String resource;
	private String name;
	private String costType;
	private String sanitizedDescription;
	private String sanitizedTooltip;
	private Object range;
	private List<Integer> cost;
	private int summonerLevel;

	public List<SpellVarsDTO> getVars() {
		return vars;
	}

	public void setVars(List<SpellVarsDTO> vars) {
		this.vars = vars;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}

	public String getCostBurn() {
		return costBurn;
	}

	public void setCostBurn(String costBurn) {
		this.costBurn = costBurn;
	}

	public List<Double> getCooldown() {
		return cooldown;
	}

	public void setCooldown(List<Double> cooldown) {
		this.cooldown = cooldown;
	}

	public List<String> getEffectBurn() {
		return effectBurn;
	}

	public void setEffectBurn(List<String> effectBurn) {
		this.effectBurn = effectBurn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCooldownBurn() {
		return cooldownBurn;
	}

	public void setCooldownBurn(String cooldownBurn) {
		this.cooldownBurn = cooldownBurn;
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

	public String getRangeBurn() {
		return rangeBurn;
	}

	public void setRangeBurn(String rangeBurn) {
		this.rangeBurn = rangeBurn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Double> getEffect() {
		return effect;
	}

	public void setEffect(List<Double> effect) {
		this.effect = effect;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public LevelTipDTO getLeveltip() {
		return leveltip;
	}

	public void setLeveltip(LevelTipDTO leveltip) {
		this.leveltip = leveltip;
	}

	public List<String> getModes() {
		return modes;
	}

	public void setModes(List<String> modes) {
		this.modes = modes;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCostType() {
		return costType;
	}

	public void setCostType(String costType) {
		this.costType = costType;
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

	public Object getRange() {
		return range;
	}

	public void setRange(Object range) {
		this.range = range;
	}

	public List<Integer> getCost() {
		return cost;
	}

	public void setCost(List<Integer> cost) {
		this.cost = cost;
	}

	public int getSummonerLevel() {
		return summonerLevel;
	}

	public void setSummonerLevel(int summonerLevel) {
		this.summonerLevel = summonerLevel;
	}

}
