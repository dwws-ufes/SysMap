package br.ufes.inf.nemo.marvin.sysmap.domain;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-05-22T16:51:23.685-0300")
@StaticMetamodel(Criteria.class)
public class Criteria_ extends PersistentObjectSupport_ {
	public static volatile SingularAttribute<Criteria, String> identifier;
	public static volatile SingularAttribute<Criteria, String> description;
	public static volatile SingularAttribute<Criteria, CriteriaType> criteriaType;
}
