/* First created by JCasGen Thu Feb 05 10:12:58 GMT 2015 */
// Dstl (c) Crown Copyright 2017
package uk.gov.dstl.baleen.types;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * A base class for annotations used by Baleen. Includes things like an internal ID and a function
 * to generate an external ID. Updated by JCasGen Wed Apr 13 13:23:15 BST 2016
 *
 * @generated
 */
public class BaleenAnnotation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings("hiding")
  public static final int typeIndexID = BaleenAnnotation.typeIndexID;
  /**
   * @generated
   * @modifiable
   */
  @SuppressWarnings("hiding")
  public static final boolean featOkTst =
      JCasRegistry.getFeatOkTst("uk.gov.dstl.baleen.types.BaleenAnnotation");

  /** @generated */
  final Feature casFeat_internalId;
  /** @generated */
  final int casFeatCode_internalId;
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public long getInternalId(int addr) {
    if (featOkTst && casFeat_internalId == null)
      jcas.throwFeatMissing("internalId", "uk.gov.dstl.baleen.types.BaleenAnnotation");
    return ll_cas.ll_getLongValue(addr, casFeatCode_internalId);
  }
  /**
   * @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setInternalId(int addr, long v) {
    if (featOkTst && casFeat_internalId == null)
      jcas.throwFeatMissing("internalId", "uk.gov.dstl.baleen.types.BaleenAnnotation");
    ll_cas.ll_setLongValue(addr, casFeatCode_internalId, v);
  }

  /**
   * initialize variables to correspond with Cas Type and Features
   *
   * @generated
   * @param jcas JCas
   * @param casType Type
   */
  public BaleenAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());

    casFeat_internalId =
        jcas.getRequiredFeatureDE(casType, "internalId", "uima.cas.Long", featOkTst);
    casFeatCode_internalId =
        (null == casFeat_internalId)
            ? JCas.INVALID_FEATURE_CODE
            : ((FeatureImpl) casFeat_internalId).getCode();
  }
}
