/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete.summarization;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * A mention of a concept described in a summary which is thought
 * to be informative. Concepts might be named entities, facts, or
 * events which were determined to be salient in the text being
 * summarized.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class SummaryConcept implements org.apache.thrift.TBase<SummaryConcept, SummaryConcept._Fields>, java.io.Serializable, Cloneable, Comparable<SummaryConcept> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SummaryConcept");

  private static final org.apache.thrift.protocol.TField TOKENS_FIELD_DESC = new org.apache.thrift.protocol.TField("tokens", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CONCEPT_FIELD_DESC = new org.apache.thrift.protocol.TField("concept", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONFIDENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("confidence", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField UTILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("utility", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SummaryConceptStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SummaryConceptTupleSchemeFactory();

  private edu.jhu.hlt.concrete.TokenRefSequence tokens; // optional
  private java.lang.String concept; // optional
  private double confidence; // optional
  private double utility; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Location in summaryCommunication of this concept
     */
    TOKENS((short)1, "tokens"),
    /**
     * Short description of the concept being evoked, e.g. "kbrel:bornIn" or "related:ACME_Corp"
     */
    CONCEPT((short)2, "concept"),
    /**
     * How confident is the system that this concept was evoked by this mention, in [0,1]
     */
    CONFIDENCE((short)3, "confidence"),
    /**
     * How informative/important it is that this concept be included in the summary (non-negative).
     */
    UTILITY((short)4, "utility");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOKENS
          return TOKENS;
        case 2: // CONCEPT
          return CONCEPT;
        case 3: // CONFIDENCE
          return CONFIDENCE;
        case 4: // UTILITY
          return UTILITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CONFIDENCE_ISSET_ID = 0;
  private static final int __UTILITY_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOKENS,_Fields.CONCEPT,_Fields.CONFIDENCE,_Fields.UTILITY};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKENS, new org.apache.thrift.meta_data.FieldMetaData("tokens", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.TokenRefSequence.class)));
    tmpMap.put(_Fields.CONCEPT, new org.apache.thrift.meta_data.FieldMetaData("concept", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONFIDENCE, new org.apache.thrift.meta_data.FieldMetaData("confidence", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.UTILITY, new org.apache.thrift.meta_data.FieldMetaData("utility", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SummaryConcept.class, metaDataMap);
  }

  public SummaryConcept() {
    this.confidence = (double)1;

    this.utility = (double)1;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SummaryConcept(SummaryConcept other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTokens()) {
      this.tokens = new edu.jhu.hlt.concrete.TokenRefSequence(other.tokens);
    }
    if (other.isSetConcept()) {
      this.concept = other.concept;
    }
    this.confidence = other.confidence;
    this.utility = other.utility;
  }

  public SummaryConcept deepCopy() {
    return new SummaryConcept(this);
  }

  @Override
  public void clear() {
    this.tokens = null;
    this.concept = null;
    this.confidence = (double)1;

    this.utility = (double)1;

  }

  /**
   * Location in summaryCommunication of this concept
   */
  public edu.jhu.hlt.concrete.TokenRefSequence getTokens() {
    return this.tokens;
  }

  /**
   * Location in summaryCommunication of this concept
   */
  public SummaryConcept setTokens(edu.jhu.hlt.concrete.TokenRefSequence tokens) {
    this.tokens = tokens;
    return this;
  }

  public void unsetTokens() {
    this.tokens = null;
  }

  /** Returns true if field tokens is set (has been assigned a value) and false otherwise */
  public boolean isSetTokens() {
    return this.tokens != null;
  }

  public void setTokensIsSet(boolean value) {
    if (!value) {
      this.tokens = null;
    }
  }

  /**
   * Short description of the concept being evoked, e.g. "kbrel:bornIn" or "related:ACME_Corp"
   */
  public java.lang.String getConcept() {
    return this.concept;
  }

  /**
   * Short description of the concept being evoked, e.g. "kbrel:bornIn" or "related:ACME_Corp"
   */
  public SummaryConcept setConcept(java.lang.String concept) {
    this.concept = concept;
    return this;
  }

  public void unsetConcept() {
    this.concept = null;
  }

  /** Returns true if field concept is set (has been assigned a value) and false otherwise */
  public boolean isSetConcept() {
    return this.concept != null;
  }

  public void setConceptIsSet(boolean value) {
    if (!value) {
      this.concept = null;
    }
  }

  /**
   * How confident is the system that this concept was evoked by this mention, in [0,1]
   */
  public double getConfidence() {
    return this.confidence;
  }

  /**
   * How confident is the system that this concept was evoked by this mention, in [0,1]
   */
  public SummaryConcept setConfidence(double confidence) {
    this.confidence = confidence;
    setConfidenceIsSet(true);
    return this;
  }

  public void unsetConfidence() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CONFIDENCE_ISSET_ID);
  }

  /** Returns true if field confidence is set (has been assigned a value) and false otherwise */
  public boolean isSetConfidence() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CONFIDENCE_ISSET_ID);
  }

  public void setConfidenceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CONFIDENCE_ISSET_ID, value);
  }

  /**
   * How informative/important it is that this concept be included in the summary (non-negative).
   */
  public double getUtility() {
    return this.utility;
  }

  /**
   * How informative/important it is that this concept be included in the summary (non-negative).
   */
  public SummaryConcept setUtility(double utility) {
    this.utility = utility;
    setUtilityIsSet(true);
    return this;
  }

  public void unsetUtility() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UTILITY_ISSET_ID);
  }

  /** Returns true if field utility is set (has been assigned a value) and false otherwise */
  public boolean isSetUtility() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UTILITY_ISSET_ID);
  }

  public void setUtilityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UTILITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOKENS:
      if (value == null) {
        unsetTokens();
      } else {
        setTokens((edu.jhu.hlt.concrete.TokenRefSequence)value);
      }
      break;

    case CONCEPT:
      if (value == null) {
        unsetConcept();
      } else {
        setConcept((java.lang.String)value);
      }
      break;

    case CONFIDENCE:
      if (value == null) {
        unsetConfidence();
      } else {
        setConfidence((java.lang.Double)value);
      }
      break;

    case UTILITY:
      if (value == null) {
        unsetUtility();
      } else {
        setUtility((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKENS:
      return getTokens();

    case CONCEPT:
      return getConcept();

    case CONFIDENCE:
      return getConfidence();

    case UTILITY:
      return getUtility();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOKENS:
      return isSetTokens();
    case CONCEPT:
      return isSetConcept();
    case CONFIDENCE:
      return isSetConfidence();
    case UTILITY:
      return isSetUtility();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SummaryConcept)
      return this.equals((SummaryConcept)that);
    return false;
  }

  public boolean equals(SummaryConcept that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tokens = true && this.isSetTokens();
    boolean that_present_tokens = true && that.isSetTokens();
    if (this_present_tokens || that_present_tokens) {
      if (!(this_present_tokens && that_present_tokens))
        return false;
      if (!this.tokens.equals(that.tokens))
        return false;
    }

    boolean this_present_concept = true && this.isSetConcept();
    boolean that_present_concept = true && that.isSetConcept();
    if (this_present_concept || that_present_concept) {
      if (!(this_present_concept && that_present_concept))
        return false;
      if (!this.concept.equals(that.concept))
        return false;
    }

    boolean this_present_confidence = true && this.isSetConfidence();
    boolean that_present_confidence = true && that.isSetConfidence();
    if (this_present_confidence || that_present_confidence) {
      if (!(this_present_confidence && that_present_confidence))
        return false;
      if (this.confidence != that.confidence)
        return false;
    }

    boolean this_present_utility = true && this.isSetUtility();
    boolean that_present_utility = true && that.isSetUtility();
    if (this_present_utility || that_present_utility) {
      if (!(this_present_utility && that_present_utility))
        return false;
      if (this.utility != that.utility)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTokens()) ? 131071 : 524287);
    if (isSetTokens())
      hashCode = hashCode * 8191 + tokens.hashCode();

    hashCode = hashCode * 8191 + ((isSetConcept()) ? 131071 : 524287);
    if (isSetConcept())
      hashCode = hashCode * 8191 + concept.hashCode();

    hashCode = hashCode * 8191 + ((isSetConfidence()) ? 131071 : 524287);
    if (isSetConfidence())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(confidence);

    hashCode = hashCode * 8191 + ((isSetUtility()) ? 131071 : 524287);
    if (isSetUtility())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(utility);

    return hashCode;
  }

  @Override
  public int compareTo(SummaryConcept other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTokens()).compareTo(other.isSetTokens());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokens()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokens, other.tokens);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetConcept()).compareTo(other.isSetConcept());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConcept()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.concept, other.concept);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetConfidence()).compareTo(other.isSetConfidence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfidence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confidence, other.confidence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUtility()).compareTo(other.isSetUtility());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUtility()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.utility, other.utility);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SummaryConcept(");
    boolean first = true;

    if (isSetTokens()) {
      sb.append("tokens:");
      if (this.tokens == null) {
        sb.append("null");
      } else {
        sb.append(this.tokens);
      }
      first = false;
    }
    if (isSetConcept()) {
      if (!first) sb.append(", ");
      sb.append("concept:");
      if (this.concept == null) {
        sb.append("null");
      } else {
        sb.append(this.concept);
      }
      first = false;
    }
    if (isSetConfidence()) {
      if (!first) sb.append(", ");
      sb.append("confidence:");
      sb.append(this.confidence);
      first = false;
    }
    if (isSetUtility()) {
      if (!first) sb.append(", ");
      sb.append("utility:");
      sb.append(this.utility);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (tokens != null) {
      tokens.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SummaryConceptStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SummaryConceptStandardScheme getScheme() {
      return new SummaryConceptStandardScheme();
    }
  }

  private static class SummaryConceptStandardScheme extends org.apache.thrift.scheme.StandardScheme<SummaryConcept> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SummaryConcept struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKENS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tokens = new edu.jhu.hlt.concrete.TokenRefSequence();
              struct.tokens.read(iprot);
              struct.setTokensIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONCEPT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.concept = iprot.readString();
              struct.setConceptIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONFIDENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.confidence = iprot.readDouble();
              struct.setConfidenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UTILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.utility = iprot.readDouble();
              struct.setUtilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SummaryConcept struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tokens != null) {
        if (struct.isSetTokens()) {
          oprot.writeFieldBegin(TOKENS_FIELD_DESC);
          struct.tokens.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.concept != null) {
        if (struct.isSetConcept()) {
          oprot.writeFieldBegin(CONCEPT_FIELD_DESC);
          oprot.writeString(struct.concept);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetConfidence()) {
        oprot.writeFieldBegin(CONFIDENCE_FIELD_DESC);
        oprot.writeDouble(struct.confidence);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUtility()) {
        oprot.writeFieldBegin(UTILITY_FIELD_DESC);
        oprot.writeDouble(struct.utility);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SummaryConceptTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SummaryConceptTupleScheme getScheme() {
      return new SummaryConceptTupleScheme();
    }
  }

  private static class SummaryConceptTupleScheme extends org.apache.thrift.scheme.TupleScheme<SummaryConcept> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SummaryConcept struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTokens()) {
        optionals.set(0);
      }
      if (struct.isSetConcept()) {
        optionals.set(1);
      }
      if (struct.isSetConfidence()) {
        optionals.set(2);
      }
      if (struct.isSetUtility()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTokens()) {
        struct.tokens.write(oprot);
      }
      if (struct.isSetConcept()) {
        oprot.writeString(struct.concept);
      }
      if (struct.isSetConfidence()) {
        oprot.writeDouble(struct.confidence);
      }
      if (struct.isSetUtility()) {
        oprot.writeDouble(struct.utility);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SummaryConcept struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.tokens = new edu.jhu.hlt.concrete.TokenRefSequence();
        struct.tokens.read(iprot);
        struct.setTokensIsSet(true);
      }
      if (incoming.get(1)) {
        struct.concept = iprot.readString();
        struct.setConceptIsSet(true);
      }
      if (incoming.get(2)) {
        struct.confidence = iprot.readDouble();
        struct.setConfidenceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.utility = iprot.readDouble();
        struct.setUtilityIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

