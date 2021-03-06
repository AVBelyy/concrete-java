/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * A theory about the set of situation mentions that are present in a
 * message. See also: SituationMention
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class SituationMentionSet implements org.apache.thrift.TBase<SituationMentionSet, SituationMentionSet._Fields>, java.io.Serializable, Cloneable, Comparable<SituationMentionSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SituationMentionSet");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MENTION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("mentionList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField LINKING_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("linkingList", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SituationMentionSetStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SituationMentionSetTupleSchemeFactory();

  private edu.jhu.hlt.concrete.UUID uuid; // required
  private edu.jhu.hlt.concrete.AnnotationMetadata metadata; // required
  private java.util.List<SituationMention> mentionList; // required
  private java.util.List<edu.jhu.hlt.concrete.Linking> linkingList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Unique identifier for this set.
     */
    UUID((short)1, "uuid"),
    /**
     * Information about where this set came from.
     */
    METADATA((short)2, "metadata"),
    /**
     * List of mentions in this set.
     */
    MENTION_LIST((short)3, "mentionList"),
    /**
     * Entity linking annotations associated with this SituationMentionSet.
     */
    LINKING_LIST((short)4, "linkingList");

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
        case 1: // UUID
          return UUID;
        case 2: // METADATA
          return METADATA;
        case 3: // MENTION_LIST
          return MENTION_LIST;
        case 4: // LINKING_LIST
          return LINKING_LIST;
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
  private static final _Fields optionals[] = {_Fields.LINKING_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AnnotationMetadata.class)));
    tmpMap.put(_Fields.MENTION_LIST, new org.apache.thrift.meta_data.FieldMetaData("mentionList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SituationMention.class))));
    tmpMap.put(_Fields.LINKING_LIST, new org.apache.thrift.meta_data.FieldMetaData("linkingList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.Linking.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SituationMentionSet.class, metaDataMap);
  }

  public SituationMentionSet() {
  }

  public SituationMentionSet(
    edu.jhu.hlt.concrete.UUID uuid,
    edu.jhu.hlt.concrete.AnnotationMetadata metadata,
    java.util.List<SituationMention> mentionList)
  {
    this();
    this.uuid = uuid;
    this.metadata = metadata;
    this.mentionList = mentionList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SituationMentionSet(SituationMentionSet other) {
    if (other.isSetUuid()) {
      this.uuid = new edu.jhu.hlt.concrete.UUID(other.uuid);
    }
    if (other.isSetMetadata()) {
      this.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata(other.metadata);
    }
    if (other.isSetMentionList()) {
      java.util.List<SituationMention> __this__mentionList = new java.util.ArrayList<SituationMention>(other.mentionList.size());
      for (SituationMention other_element : other.mentionList) {
        __this__mentionList.add(new SituationMention(other_element));
      }
      this.mentionList = __this__mentionList;
    }
    if (other.isSetLinkingList()) {
      java.util.List<edu.jhu.hlt.concrete.Linking> __this__linkingList = new java.util.ArrayList<edu.jhu.hlt.concrete.Linking>(other.linkingList.size());
      for (edu.jhu.hlt.concrete.Linking other_element : other.linkingList) {
        __this__linkingList.add(new edu.jhu.hlt.concrete.Linking(other_element));
      }
      this.linkingList = __this__linkingList;
    }
  }

  public SituationMentionSet deepCopy() {
    return new SituationMentionSet(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.metadata = null;
    this.mentionList = null;
    this.linkingList = null;
  }

  /**
   * Unique identifier for this set.
   */
  public edu.jhu.hlt.concrete.UUID getUuid() {
    return this.uuid;
  }

  /**
   * Unique identifier for this set.
   */
  public SituationMentionSet setUuid(edu.jhu.hlt.concrete.UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  public void unsetUuid() {
    this.uuid = null;
  }

  /** Returns true if field uuid is set (has been assigned a value) and false otherwise */
  public boolean isSetUuid() {
    return this.uuid != null;
  }

  public void setUuidIsSet(boolean value) {
    if (!value) {
      this.uuid = null;
    }
  }

  /**
   * Information about where this set came from.
   */
  public edu.jhu.hlt.concrete.AnnotationMetadata getMetadata() {
    return this.metadata;
  }

  /**
   * Information about where this set came from.
   */
  public SituationMentionSet setMetadata(edu.jhu.hlt.concrete.AnnotationMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public int getMentionListSize() {
    return (this.mentionList == null) ? 0 : this.mentionList.size();
  }

  public java.util.Iterator<SituationMention> getMentionListIterator() {
    return (this.mentionList == null) ? null : this.mentionList.iterator();
  }

  public void addToMentionList(SituationMention elem) {
    if (this.mentionList == null) {
      this.mentionList = new java.util.ArrayList<SituationMention>();
    }
    this.mentionList.add(elem);
  }

  /**
   * List of mentions in this set.
   */
  public java.util.List<SituationMention> getMentionList() {
    return this.mentionList;
  }

  /**
   * List of mentions in this set.
   */
  public SituationMentionSet setMentionList(java.util.List<SituationMention> mentionList) {
    this.mentionList = mentionList;
    return this;
  }

  public void unsetMentionList() {
    this.mentionList = null;
  }

  /** Returns true if field mentionList is set (has been assigned a value) and false otherwise */
  public boolean isSetMentionList() {
    return this.mentionList != null;
  }

  public void setMentionListIsSet(boolean value) {
    if (!value) {
      this.mentionList = null;
    }
  }

  public int getLinkingListSize() {
    return (this.linkingList == null) ? 0 : this.linkingList.size();
  }

  public java.util.Iterator<edu.jhu.hlt.concrete.Linking> getLinkingListIterator() {
    return (this.linkingList == null) ? null : this.linkingList.iterator();
  }

  public void addToLinkingList(edu.jhu.hlt.concrete.Linking elem) {
    if (this.linkingList == null) {
      this.linkingList = new java.util.ArrayList<edu.jhu.hlt.concrete.Linking>();
    }
    this.linkingList.add(elem);
  }

  /**
   * Entity linking annotations associated with this SituationMentionSet.
   */
  public java.util.List<edu.jhu.hlt.concrete.Linking> getLinkingList() {
    return this.linkingList;
  }

  /**
   * Entity linking annotations associated with this SituationMentionSet.
   */
  public SituationMentionSet setLinkingList(java.util.List<edu.jhu.hlt.concrete.Linking> linkingList) {
    this.linkingList = linkingList;
    return this;
  }

  public void unsetLinkingList() {
    this.linkingList = null;
  }

  /** Returns true if field linkingList is set (has been assigned a value) and false otherwise */
  public boolean isSetLinkingList() {
    return this.linkingList != null;
  }

  public void setLinkingListIsSet(boolean value) {
    if (!value) {
      this.linkingList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case UUID:
      if (value == null) {
        unsetUuid();
      } else {
        setUuid((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((edu.jhu.hlt.concrete.AnnotationMetadata)value);
      }
      break;

    case MENTION_LIST:
      if (value == null) {
        unsetMentionList();
      } else {
        setMentionList((java.util.List<SituationMention>)value);
      }
      break;

    case LINKING_LIST:
      if (value == null) {
        unsetLinkingList();
      } else {
        setLinkingList((java.util.List<edu.jhu.hlt.concrete.Linking>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID:
      return getUuid();

    case METADATA:
      return getMetadata();

    case MENTION_LIST:
      return getMentionList();

    case LINKING_LIST:
      return getLinkingList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case UUID:
      return isSetUuid();
    case METADATA:
      return isSetMetadata();
    case MENTION_LIST:
      return isSetMentionList();
    case LINKING_LIST:
      return isSetLinkingList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SituationMentionSet)
      return this.equals((SituationMentionSet)that);
    return false;
  }

  public boolean equals(SituationMentionSet that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_uuid = true && this.isSetUuid();
    boolean that_present_uuid = true && that.isSetUuid();
    if (this_present_uuid || that_present_uuid) {
      if (!(this_present_uuid && that_present_uuid))
        return false;
      if (!this.uuid.equals(that.uuid))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_mentionList = true && this.isSetMentionList();
    boolean that_present_mentionList = true && that.isSetMentionList();
    if (this_present_mentionList || that_present_mentionList) {
      if (!(this_present_mentionList && that_present_mentionList))
        return false;
      if (!this.mentionList.equals(that.mentionList))
        return false;
    }

    boolean this_present_linkingList = true && this.isSetLinkingList();
    boolean that_present_linkingList = true && that.isSetLinkingList();
    if (this_present_linkingList || that_present_linkingList) {
      if (!(this_present_linkingList && that_present_linkingList))
        return false;
      if (!this.linkingList.equals(that.linkingList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUuid()) ? 131071 : 524287);
    if (isSetUuid())
      hashCode = hashCode * 8191 + uuid.hashCode();

    hashCode = hashCode * 8191 + ((isSetMetadata()) ? 131071 : 524287);
    if (isSetMetadata())
      hashCode = hashCode * 8191 + metadata.hashCode();

    hashCode = hashCode * 8191 + ((isSetMentionList()) ? 131071 : 524287);
    if (isSetMentionList())
      hashCode = hashCode * 8191 + mentionList.hashCode();

    hashCode = hashCode * 8191 + ((isSetLinkingList()) ? 131071 : 524287);
    if (isSetLinkingList())
      hashCode = hashCode * 8191 + linkingList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SituationMentionSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMentionList()).compareTo(other.isSetMentionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMentionList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mentionList, other.mentionList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLinkingList()).compareTo(other.isSetLinkingList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinkingList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.linkingList, other.linkingList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SituationMentionSet(");
    boolean first = true;

    sb.append("uuid:");
    if (this.uuid == null) {
      sb.append("null");
    } else {
      sb.append(this.uuid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.metadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mentionList:");
    if (this.mentionList == null) {
      sb.append("null");
    } else {
      sb.append(this.mentionList);
    }
    first = false;
    if (isSetLinkingList()) {
      if (!first) sb.append(", ");
      sb.append("linkingList:");
      if (this.linkingList == null) {
        sb.append("null");
      } else {
        sb.append(this.linkingList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (uuid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uuid' was not present! Struct: " + toString());
    }
    if (metadata == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadata' was not present! Struct: " + toString());
    }
    if (mentionList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'mentionList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (uuid != null) {
      uuid.validate();
    }
    if (metadata != null) {
      metadata.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SituationMentionSetStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SituationMentionSetStandardScheme getScheme() {
      return new SituationMentionSetStandardScheme();
    }
  }

  private static class SituationMentionSetStandardScheme extends org.apache.thrift.scheme.StandardScheme<SituationMentionSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SituationMentionSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.uuid = new edu.jhu.hlt.concrete.UUID();
              struct.uuid.read(iprot);
              struct.setUuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
              struct.metadata.read(iprot);
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MENTION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list72 = iprot.readListBegin();
                struct.mentionList = new java.util.ArrayList<SituationMention>(_list72.size);
                SituationMention _elem73;
                for (int _i74 = 0; _i74 < _list72.size; ++_i74)
                {
                  _elem73 = new SituationMention();
                  _elem73.read(iprot);
                  struct.mentionList.add(_elem73);
                }
                iprot.readListEnd();
              }
              struct.setMentionListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LINKING_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list75 = iprot.readListBegin();
                struct.linkingList = new java.util.ArrayList<edu.jhu.hlt.concrete.Linking>(_list75.size);
                edu.jhu.hlt.concrete.Linking _elem76;
                for (int _i77 = 0; _i77 < _list75.size; ++_i77)
                {
                  _elem76 = new edu.jhu.hlt.concrete.Linking();
                  _elem76.read(iprot);
                  struct.linkingList.add(_elem76);
                }
                iprot.readListEnd();
              }
              struct.setLinkingListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SituationMentionSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uuid != null) {
        oprot.writeFieldBegin(UUID_FIELD_DESC);
        struct.uuid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        struct.metadata.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.mentionList != null) {
        oprot.writeFieldBegin(MENTION_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.mentionList.size()));
          for (SituationMention _iter78 : struct.mentionList)
          {
            _iter78.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.linkingList != null) {
        if (struct.isSetLinkingList()) {
          oprot.writeFieldBegin(LINKING_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.linkingList.size()));
            for (edu.jhu.hlt.concrete.Linking _iter79 : struct.linkingList)
            {
              _iter79.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SituationMentionSetTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SituationMentionSetTupleScheme getScheme() {
      return new SituationMentionSetTupleScheme();
    }
  }

  private static class SituationMentionSetTupleScheme extends org.apache.thrift.scheme.TupleScheme<SituationMentionSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SituationMentionSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.uuid.write(oprot);
      struct.metadata.write(oprot);
      {
        oprot.writeI32(struct.mentionList.size());
        for (SituationMention _iter80 : struct.mentionList)
        {
          _iter80.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetLinkingList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLinkingList()) {
        {
          oprot.writeI32(struct.linkingList.size());
          for (edu.jhu.hlt.concrete.Linking _iter81 : struct.linkingList)
          {
            _iter81.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SituationMentionSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.uuid = new edu.jhu.hlt.concrete.UUID();
      struct.uuid.read(iprot);
      struct.setUuidIsSet(true);
      struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
      struct.metadata.read(iprot);
      struct.setMetadataIsSet(true);
      {
        org.apache.thrift.protocol.TList _list82 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.mentionList = new java.util.ArrayList<SituationMention>(_list82.size);
        SituationMention _elem83;
        for (int _i84 = 0; _i84 < _list82.size; ++_i84)
        {
          _elem83 = new SituationMention();
          _elem83.read(iprot);
          struct.mentionList.add(_elem83);
        }
      }
      struct.setMentionListIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.linkingList = new java.util.ArrayList<edu.jhu.hlt.concrete.Linking>(_list85.size);
          edu.jhu.hlt.concrete.Linking _elem86;
          for (int _i87 = 0; _i87 < _list85.size; ++_i87)
          {
            _elem86 = new edu.jhu.hlt.concrete.Linking();
            _elem86.read(iprot);
            struct.linkingList.add(_elem86);
          }
        }
        struct.setLinkingListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

