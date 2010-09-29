package it.eng.spagobi.kpi.config.metadata;

// Generated 18-feb-2009 17.14.10 by Hibernate Tools 3.2.2.GA

import it.eng.spagobi.commons.metadata.SbiDomains;
import it.eng.spagobi.kpi.threshold.metadata.SbiThreshold;
import it.eng.spagobi.tools.dataset.metadata.SbiDataSetConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * SbiKpi generated by hbm2java
 */
public class SbiKpi implements java.io.Serializable {

	private Integer kpiId;
	private SbiKpi sbiKpi;
	private SbiDataSetConfig sbiDataSet;
	private SbiDomains sbiDomainsByMeasureType;
	private SbiDomains sbiDomainsByKpiType;
	private SbiThreshold sbiThreshold;
	private SbiMeasureUnit sbiMeasureUnit;
	private SbiDomains sbiDomainsByMetricScaleType;
	private String name;
	private String code;
	private String metric;
	private String description;
	private Double weight;
	private Character flgIsFather;
	private Boolean isAdditive;
	private String interpretation;
	private String inputAttributes;
	private String modelReference;
	private String targetAudience;
	private Set sbiKpis = new HashSet(0);
	private Set sbiKpiInstances = new HashSet(0);
	private Set sbiKpiRoles = new HashSet(0);
	private Set sbiKpiModels = new HashSet(0);
	private Set sbiKpiDocumentses = new HashSet(0);

	public SbiKpi() {
	}

	public SbiKpi(String name) {
		this.name = name;
	}
	
	public SbiKpi(Integer id) {
		this.kpiId = id;
	}

	public SbiKpi(SbiKpi sbiKpi, SbiDataSetConfig sbiDataSet,
			SbiDomains sbiDomainsByMeasureType, SbiDomains sbiDomainsByKpiType,
			SbiThreshold sbiThreshold, SbiMeasureUnit sbiMeasureUnit,
			SbiDomains sbiDomainsByMetricScaleType, String name,
			Set sbiKpiDocumentses, String code, String metric,
			String description, Double weight, Character flgIsFather,
			String interpretation, String inputAttributes,
			String modelReference, String targetAudience, Set sbiKpis,
			Set sbiKpiInstances, Set sbiKpiRoles, Set sbiKpiModels) {
		this.sbiKpi = sbiKpi;
		this.sbiDataSet = sbiDataSet;
		this.sbiDomainsByMeasureType = sbiDomainsByMeasureType;
		this.sbiDomainsByKpiType = sbiDomainsByKpiType;
		this.sbiThreshold = sbiThreshold;
		this.sbiMeasureUnit = sbiMeasureUnit;
		this.sbiDomainsByMetricScaleType = sbiDomainsByMetricScaleType;
		this.name = name;
		this.code = code;
		this.metric = metric;
		this.description = description;
		this.weight = weight;
		this.flgIsFather = flgIsFather;
		this.interpretation = interpretation;
		this.inputAttributes = inputAttributes;
		this.modelReference = modelReference;
		this.targetAudience = targetAudience;
		this.sbiKpis = sbiKpis;
		this.sbiKpiInstances = sbiKpiInstances;
		this.sbiKpiRoles = sbiKpiRoles;
		this.sbiKpiModels = sbiKpiModels;
		this.sbiKpiDocumentses = sbiKpiDocumentses;
	}	

    public Set getSbiKpiDocumentses() {
        return this.sbiKpiDocumentses;
    }
    
    public void setSbiKpiDocumentses(Set sbiKpiDocumentses) {
        this.sbiKpiDocumentses = sbiKpiDocumentses;
    }

	public Integer getKpiId() {
		return this.kpiId;
	}

	public void setKpiId(Integer kpiId) {
		this.kpiId = kpiId;
	}

	public SbiKpi getSbiKpi() {
		return this.sbiKpi;
	}

	public void setSbiKpi(SbiKpi sbiKpi) {
		this.sbiKpi = sbiKpi;
	}

	public SbiDataSetConfig getSbiDataSet() {
		return this.sbiDataSet;
	}

	public void setSbiDataSet(SbiDataSetConfig sbiDataSet) {
		this.sbiDataSet = sbiDataSet;
	}

	public SbiDomains getSbiDomainsByMeasureType() {
		return this.sbiDomainsByMeasureType;
	}

	public void setSbiDomainsByMeasureType(SbiDomains sbiDomainsByMeasureType) {
		this.sbiDomainsByMeasureType = sbiDomainsByMeasureType;
	}

	public SbiDomains getSbiDomainsByKpiType() {
		return this.sbiDomainsByKpiType;
	}

	public void setSbiDomainsByKpiType(SbiDomains sbiDomainsByKpiType) {
		this.sbiDomainsByKpiType = sbiDomainsByKpiType;
	}

	public SbiThreshold getSbiThreshold() {
		return this.sbiThreshold;
	}

	public void setSbiThreshold(SbiThreshold sbiThreshold) {
		this.sbiThreshold = sbiThreshold;
	}

	public SbiMeasureUnit getSbiMeasureUnit() {
		return this.sbiMeasureUnit;
	}

	public void setSbiMeasureUnit(SbiMeasureUnit sbiMeasureUnit) {
		this.sbiMeasureUnit = sbiMeasureUnit;
	}

	public SbiDomains getSbiDomainsByMetricScaleType() {
		return this.sbiDomainsByMetricScaleType;
	}

	public void setSbiDomainsByMetricScaleType(
			SbiDomains sbiDomainsByMetricScaleType) {
		this.sbiDomainsByMetricScaleType = sbiDomainsByMetricScaleType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Character getFlgIsFather() {
		return this.flgIsFather;
	}

	public void setFlgIsFather(Character flgIsFather) {
		this.flgIsFather = flgIsFather;
	}

	public String getInterpretation() {
		return this.interpretation;
	}

	public void setInterpretation(String interpretation) {
		this.interpretation = interpretation;
	}

	public String getInputAttributes() {
		return this.inputAttributes;
	}

	public void setInputAttributes(String inputAttributes) {
		this.inputAttributes = inputAttributes;
	}

	public String getModelReference() {
		return this.modelReference;
	}

	public void setModelReference(String modelReference) {
		this.modelReference = modelReference;
	}

	public String getTargetAudience() {
		return this.targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public Set getSbiKpis() {
		return this.sbiKpis;
	}

	public void setSbiKpis(Set sbiKpis) {
		this.sbiKpis = sbiKpis;
	}

	public Set getSbiKpiInstances() {
		return this.sbiKpiInstances;
	}

	public void setSbiKpiInstances(Set sbiKpiInstances) {
		this.sbiKpiInstances = sbiKpiInstances;
	}

	public Set getSbiKpiRoles() {
		return this.sbiKpiRoles;
	}

	public void setSbiKpiRoles(Set sbiKpiRoles) {
		this.sbiKpiRoles = sbiKpiRoles;
	}

	public Set getSbiKpiModels() {
		return this.sbiKpiModels;
	}

	public void setSbiKpiModels(Set sbiKpiModels) {
		this.sbiKpiModels = sbiKpiModels;
	}
	
	public Boolean getIsAdditive() {
		return isAdditive;
	}

	public void setIsAdditive(Boolean isAdditive) {
		this.isAdditive = isAdditive;
	}

}

