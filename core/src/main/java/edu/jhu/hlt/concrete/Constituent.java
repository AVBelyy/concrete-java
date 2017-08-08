/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * A single parse constituent (or "phrase").
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class Constituent implements org.apache.thrift.TBase<Constituent, Constituent._Fields>, java.io.Serializable, Cloneable, Comparable<Constituent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Constituent");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CHILD_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("childList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField HEAD_CHILD_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("headChildIndex", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField START_FIELD_DESC = new org.apache.thrift.protocol.TField("start", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField ENDING_FIELD_DESC = new org.apache.thrift.protocol.TField("ending", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ConstituentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ConstituentTupleSchemeFactory());
  }

  private int id; // required
  private String tag; // optional
  private List<Integer> childList; // required
  private int headChildIndex; // optional
  private int start; // optional
  private int ending; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * A parse-relative identifier for this consistuent. Together
     * with the UUID for a Parse, this can be used to define
     * pointers to specific constituents.
     */
    ID((short)1, "id"),
    /**
     * A description of this constituency node, e.g. the category "NP".
     * For leaf nodes, this should be a word and for pre-terminal nodes
     * this should be a POS tag.
     */
    TAG((short)2, "tag"),
    CHILD_LIST((short)3, "childList"),
    /**
     * The index of the head child of this constituent. I.e., the
     * head child of constituent <tt>c</tt> is
     * <tt>c.children[c.head_child_index]</tt>. A value of -1
     * indicates that no child head was identified.
     */
    HEAD_CHILD_INDEX((short)4, "headChildIndex"),
    /**
     * The first token (inclusive) of this constituent in the
     * parent Tokenization. Almost certainly should be populated.
     */
    START((short)5, "start"),
    /**
     * The last token (exclusive) of this constituent in the
     * parent Tokenization. Almost certainly should be populated.
     */
    ENDING((short)6, "ending");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // TAG
          return TAG;
        case 3: // CHILD_LIST
          return CHILD_LIST;
        case 4: // HEAD_CHILD_INDEX
          return HEAD_CHILD_INDEX;
        case 5: // START
          return START;
        case 6: // ENDING
          return ENDING;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __HEADCHILDINDEX_ISSET_ID = 1;
  private static final int __START_ISSET_ID = 2;
  private static final int __ENDING_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TAG,_Fields.HEAD_CHILD_INDEX,_Fields.START,_Fields.ENDING};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHILD_LIST, new org.apache.thrift.meta_data.FieldMetaData("childList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.HEAD_CHILD_INDEX, new org.apache.thrift.meta_data.FieldMetaData("headChildIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START, new org.apache.thrift.meta_data.FieldMetaData("start", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ENDING, new org.apache.thrift.meta_data.FieldMetaData("ending", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Constituent.class, metaDataMap);
  }

  public Constituent() {
    this.headChildIndex = -1;

  }

  public Constituent(
    int id,
    List<Integer> childList)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.childList = childList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Constituent(Constituent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetTag()) {
      this.tag = other.tag;
    }
    if (other.isSetChildList()) {
      List<Integer> __this__childList = new ArrayList<Integer>(other.childList);
      this.childList = __this__childList;
    }
    this.headChildIndex = other.headChildIndex;
    this.start = other.start;
    this.ending = other.ending;
  }

  public Constituent deepCopy() {
    return new Constituent(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.tag = null;
    this.childList = null;
    this.headChildIndex = -1;

    setStartIsSet(false);
    this.start = 0;
    setEndingIsSet(false);
    this.ending = 0;
  }

  /**
   * A parse-relative identifier for this consistuent. Together
   * with the UUID for a Parse, this can be used to define
   * pointers to specific constituents.
   */
  public int getId() {
    return this.id;
  }

  /**
   * A parse-relative identifier for this consistuent. Together
   * with the UUID for a Parse, this can be used to define
   * pointers to specific constituents.
   */
  public Constituent setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  /**
   * A description of this constituency node, e.g. the category "NP".
   * For leaf nodes, this should be a word and for pre-terminal nodes
   * this should be a POS tag.
   */
  public String getTag() {
    return this.tag;
  }

  /**
   * A description of this constituency node, e.g. the category "NP".
   * For leaf nodes, this should be a word and for pre-terminal nodes
   * this should be a POS tag.
   */
  public Constituent setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public void unsetTag() {
    this.tag = null;
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return this.tag != null;
  }

  public void setTagIsSet(boolean value) {
    if (!value) {
      this.tag = null;
    }
  }

  public int getChildListSize() {
    return (this.childList == null) ? 0 : this.childList.size();
  }

  public java.util.Iterator<Integer> getChildListIterator() {
    return (this.childList == null) ? null : this.childList.iterator();
  }

  public void addToChildList(int elem) {
    if (this.childList == null) {
      this.childList = new ArrayList<Integer>();
    }
    this.childList.add(elem);
  }

  public List<Integer> getChildList() {
    return this.childList;
  }

  public Constituent setChildList(List<Integer> childList) {
    this.childList = childList;
    return this;
  }

  public void unsetChildList() {
    this.childList = null;
  }

  /** Returns true if field childList is set (has been assigned a value) and false otherwise */
  public boolean isSetChildList() {
    return this.childList != null;
  }

  public void setChildListIsSet(boolean value) {
    if (!value) {
      this.childList = null;
    }
  }

  /**
   * The index of the head child of this constituent. I.e., the
   * head child of constituent <tt>c</tt> is
   * <tt>c.children[c.head_child_index]</tt>. A value of -1
   * indicates that no child head was identified.
   */
  public int getHeadChildIndex() {
    return this.headChildIndex;
  }

  /**
   * The index of the head child of this constituent. I.e., the
   * head child of constituent <tt>c</tt> is
   * <tt>c.children[c.head_child_index]</tt>. A value of -1
   * indicates that no child head was identified.
   */
  public Constituent setHeadChildIndex(int headChildIndex) {
    this.headChildIndex = headChildIndex;
    setHeadChildIndexIsSet(true);
    return this;
  }

  public void unsetHeadChildIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HEADCHILDINDEX_ISSET_ID);
  }

  /** Returns true if field headChildIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetHeadChildIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __HEADCHILDINDEX_ISSET_ID);
  }

  public void setHeadChildIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HEADCHILDINDEX_ISSET_ID, value);
  }

  /**
   * The first token (inclusive) of this constituent in the
   * parent Tokenization. Almost certainly should be populated.
   */
  public int getStart() {
    return this.start;
  }

  /**
   * The first token (inclusive) of this constituent in the
   * parent Tokenization. Almost certainly should be populated.
   */
  public Constituent setStart(int start) {
    this.start = start;
    setStartIsSet(true);
    return this;
  }

  public void unsetStart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __START_ISSET_ID);
  }

  /** Returns true if field start is set (has been assigned a value) and false otherwise */
  public boolean isSetStart() {
    return EncodingUtils.testBit(__isset_bitfield, __START_ISSET_ID);
  }

  public void setStartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __START_ISSET_ID, value);
  }

  /**
   * The last token (exclusive) of this constituent in the
   * parent Tokenization. Almost certainly should be populated.
   */
  public int getEnding() {
    return this.ending;
  }

  /**
   * The last token (exclusive) of this constituent in the
   * parent Tokenization. Almost certainly should be populated.
   */
  public Constituent setEnding(int ending) {
    this.ending = ending;
    setEndingIsSet(true);
    return this;
  }

  public void unsetEnding() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDING_ISSET_ID);
  }

  /** Returns true if field ending is set (has been assigned a value) and false otherwise */
  public boolean isSetEnding() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDING_ISSET_ID);
  }

  public void setEndingIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDING_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((String)value);
      }
      break;

    case CHILD_LIST:
      if (value == null) {
        unsetChildList();
      } else {
        setChildList((List<Integer>)value);
      }
      break;

    case HEAD_CHILD_INDEX:
      if (value == null) {
        unsetHeadChildIndex();
      } else {
        setHeadChildIndex((Integer)value);
      }
      break;

    case START:
      if (value == null) {
        unsetStart();
      } else {
        setStart((Integer)value);
      }
      break;

    case ENDING:
      if (value == null) {
        unsetEnding();
      } else {
        setEnding((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case TAG:
      return getTag();

    case CHILD_LIST:
      return getChildList();

    case HEAD_CHILD_INDEX:
      return getHeadChildIndex();

    case START:
      return getStart();

    case ENDING:
      return getEnding();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case TAG:
      return isSetTag();
    case CHILD_LIST:
      return isSetChildList();
    case HEAD_CHILD_INDEX:
      return isSetHeadChildIndex();
    case START:
      return isSetStart();
    case ENDING:
      return isSetEnding();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Constituent)
      return this.equals((Constituent)that);
    return false;
  }

  public boolean equals(Constituent that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_tag = true && this.isSetTag();
    boolean that_present_tag = true && that.isSetTag();
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (!this.tag.equals(that.tag))
        return false;
    }

    boolean this_present_childList = true && this.isSetChildList();
    boolean that_present_childList = true && that.isSetChildList();
    if (this_present_childList || that_present_childList) {
      if (!(this_present_childList && that_present_childList))
        return false;
      if (!this.childList.equals(that.childList))
        return false;
    }

    boolean this_present_headChildIndex = true && this.isSetHeadChildIndex();
    boolean that_present_headChildIndex = true && that.isSetHeadChildIndex();
    if (this_present_headChildIndex || that_present_headChildIndex) {
      if (!(this_present_headChildIndex && that_present_headChildIndex))
        return false;
      if (this.headChildIndex != that.headChildIndex)
        return false;
    }

    boolean this_present_start = true && this.isSetStart();
    boolean that_present_start = true && that.isSetStart();
    if (this_present_start || that_present_start) {
      if (!(this_present_start && that_present_start))
        return false;
      if (this.start != that.start)
        return false;
    }

    boolean this_present_ending = true && this.isSetEnding();
    boolean that_present_ending = true && that.isSetEnding();
    if (this_present_ending || that_present_ending) {
      if (!(this_present_ending && that_present_ending))
        return false;
      if (this.ending != that.ending)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true;
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_tag = true && (isSetTag());
    list.add(present_tag);
    if (present_tag)
      list.add(tag);

    boolean present_childList = true && (isSetChildList());
    list.add(present_childList);
    if (present_childList)
      list.add(childList);

    boolean present_headChildIndex = true && (isSetHeadChildIndex());
    list.add(present_headChildIndex);
    if (present_headChildIndex)
      list.add(headChildIndex);

    boolean present_start = true && (isSetStart());
    list.add(present_start);
    if (present_start)
      list.add(start);

    boolean present_ending = true && (isSetEnding());
    list.add(present_ending);
    if (present_ending)
      list.add(ending);

    return list.hashCode();
  }

  @Override
  public int compareTo(Constituent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTag()).compareTo(other.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, other.tag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChildList()).compareTo(other.isSetChildList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.childList, other.childList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeadChildIndex()).compareTo(other.isSetHeadChildIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeadChildIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.headChildIndex, other.headChildIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStart()).compareTo(other.isSetStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start, other.start);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnding()).compareTo(other.isSetEnding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ending, other.ending);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Constituent(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (isSetTag()) {
      if (!first) sb.append(", ");
      sb.append("tag:");
      if (this.tag == null) {
        sb.append("null");
      } else {
        sb.append(this.tag);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("childList:");
    if (this.childList == null) {
      sb.append("null");
    } else {
      sb.append(this.childList);
    }
    first = false;
    if (isSetHeadChildIndex()) {
      if (!first) sb.append(", ");
      sb.append("headChildIndex:");
      sb.append(this.headChildIndex);
      first = false;
    }
    if (isSetStart()) {
      if (!first) sb.append(", ");
      sb.append("start:");
      sb.append(this.start);
      first = false;
    }
    if (isSetEnding()) {
      if (!first) sb.append(", ");
      sb.append("ending:");
      sb.append(this.ending);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (childList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'childList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ConstituentStandardSchemeFactory implements SchemeFactory {
    public ConstituentStandardScheme getScheme() {
      return new ConstituentStandardScheme();
    }
  }

  private static class ConstituentStandardScheme extends StandardScheme<Constituent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Constituent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tag = iprot.readString();
              struct.setTagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHILD_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list48 = iprot.readListBegin();
                struct.childList = new ArrayList<Integer>(_list48.size);
                int _elem49;
                for (int _i50 = 0; _i50 < _list48.size; ++_i50)
                {
                  _elem49 = iprot.readI32();
                  struct.childList.add(_elem49);
                }
                iprot.readListEnd();
              }
              struct.setChildListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HEAD_CHILD_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.headChildIndex = iprot.readI32();
              struct.setHeadChildIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // START
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.start = iprot.readI32();
              struct.setStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ENDING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ending = iprot.readI32();
              struct.setEndingIsSet(true);
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
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Constituent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.tag != null) {
        if (struct.isSetTag()) {
          oprot.writeFieldBegin(TAG_FIELD_DESC);
          oprot.writeString(struct.tag);
          oprot.writeFieldEnd();
        }
      }
      if (struct.childList != null) {
        oprot.writeFieldBegin(CHILD_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.childList.size()));
          for (int _iter51 : struct.childList)
          {
            oprot.writeI32(_iter51);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetHeadChildIndex()) {
        oprot.writeFieldBegin(HEAD_CHILD_INDEX_FIELD_DESC);
        oprot.writeI32(struct.headChildIndex);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStart()) {
        oprot.writeFieldBegin(START_FIELD_DESC);
        oprot.writeI32(struct.start);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEnding()) {
        oprot.writeFieldBegin(ENDING_FIELD_DESC);
        oprot.writeI32(struct.ending);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ConstituentTupleSchemeFactory implements SchemeFactory {
    public ConstituentTupleScheme getScheme() {
      return new ConstituentTupleScheme();
    }
  }

  private static class ConstituentTupleScheme extends TupleScheme<Constituent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Constituent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.id);
      {
        oprot.writeI32(struct.childList.size());
        for (int _iter52 : struct.childList)
        {
          oprot.writeI32(_iter52);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetTag()) {
        optionals.set(0);
      }
      if (struct.isSetHeadChildIndex()) {
        optionals.set(1);
      }
      if (struct.isSetStart()) {
        optionals.set(2);
      }
      if (struct.isSetEnding()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTag()) {
        oprot.writeString(struct.tag);
      }
      if (struct.isSetHeadChildIndex()) {
        oprot.writeI32(struct.headChildIndex);
      }
      if (struct.isSetStart()) {
        oprot.writeI32(struct.start);
      }
      if (struct.isSetEnding()) {
        oprot.writeI32(struct.ending);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Constituent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI32();
      struct.setIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list53 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.childList = new ArrayList<Integer>(_list53.size);
        int _elem54;
        for (int _i55 = 0; _i55 < _list53.size; ++_i55)
        {
          _elem54 = iprot.readI32();
          struct.childList.add(_elem54);
        }
      }
      struct.setChildListIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.tag = iprot.readString();
        struct.setTagIsSet(true);
      }
      if (incoming.get(1)) {
        struct.headChildIndex = iprot.readI32();
        struct.setHeadChildIndexIsSet(true);
      }
      if (incoming.get(2)) {
        struct.start = iprot.readI32();
        struct.setStartIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ending = iprot.readI32();
        struct.setEndingIsSet(true);
      }
    }
  }

}

