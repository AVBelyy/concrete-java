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
 * Metadata specific to a particular Communication object.
 * This might include corpus-specific metadata (from the Twitter API),
 * attributes associated with the Communication (the author),
 * or other information about the Communication.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class CommunicationMetadata implements org.apache.thrift.TBase<CommunicationMetadata, CommunicationMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<CommunicationMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CommunicationMetadata");

  private static final org.apache.thrift.protocol.TField TWEET_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("tweetInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField EMAIL_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("emailInfo", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NITF_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("nitfInfo", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommunicationMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommunicationMetadataTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.TweetInfo tweetInfo; // optional
  private edu.jhu.hlt.concrete.EmailCommunicationInfo emailInfo; // optional
  private edu.jhu.hlt.concrete.NITFInfo nitfInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Extra information for communications where kind==TWEET:
     * Information about this tweet that is provided by the Twitter
     * API.  For information about the Twitter API, see:
     * https://dev.twitter.com/docs/platform-objects
     */
    TWEET_INFO((short)1, "tweetInfo"),
    /**
     * Extra information for communications where kind==EMAIL
     */
    EMAIL_INFO((short)2, "emailInfo"),
    /**
     * Extra information that may come from the NITF
     * (News Industry Text Format) schema. See 'nitf.thrift'.
     */
    NITF_INFO((short)3, "nitfInfo");

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
        case 1: // TWEET_INFO
          return TWEET_INFO;
        case 2: // EMAIL_INFO
          return EMAIL_INFO;
        case 3: // NITF_INFO
          return NITF_INFO;
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
  private static final _Fields optionals[] = {_Fields.TWEET_INFO,_Fields.EMAIL_INFO,_Fields.NITF_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TWEET_INFO, new org.apache.thrift.meta_data.FieldMetaData("tweetInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.TweetInfo.class)));
    tmpMap.put(_Fields.EMAIL_INFO, new org.apache.thrift.meta_data.FieldMetaData("emailInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.EmailCommunicationInfo.class)));
    tmpMap.put(_Fields.NITF_INFO, new org.apache.thrift.meta_data.FieldMetaData("nitfInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.NITFInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommunicationMetadata.class, metaDataMap);
  }

  public CommunicationMetadata() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommunicationMetadata(CommunicationMetadata other) {
    if (other.isSetTweetInfo()) {
      this.tweetInfo = new edu.jhu.hlt.concrete.TweetInfo(other.tweetInfo);
    }
    if (other.isSetEmailInfo()) {
      this.emailInfo = new edu.jhu.hlt.concrete.EmailCommunicationInfo(other.emailInfo);
    }
    if (other.isSetNitfInfo()) {
      this.nitfInfo = new edu.jhu.hlt.concrete.NITFInfo(other.nitfInfo);
    }
  }

  public CommunicationMetadata deepCopy() {
    return new CommunicationMetadata(this);
  }

  @Override
  public void clear() {
    this.tweetInfo = null;
    this.emailInfo = null;
    this.nitfInfo = null;
  }

  /**
   * Extra information for communications where kind==TWEET:
   * Information about this tweet that is provided by the Twitter
   * API.  For information about the Twitter API, see:
   * https://dev.twitter.com/docs/platform-objects
   */
  public edu.jhu.hlt.concrete.TweetInfo getTweetInfo() {
    return this.tweetInfo;
  }

  /**
   * Extra information for communications where kind==TWEET:
   * Information about this tweet that is provided by the Twitter
   * API.  For information about the Twitter API, see:
   * https://dev.twitter.com/docs/platform-objects
   */
  public CommunicationMetadata setTweetInfo(edu.jhu.hlt.concrete.TweetInfo tweetInfo) {
    this.tweetInfo = tweetInfo;
    return this;
  }

  public void unsetTweetInfo() {
    this.tweetInfo = null;
  }

  /** Returns true if field tweetInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetTweetInfo() {
    return this.tweetInfo != null;
  }

  public void setTweetInfoIsSet(boolean value) {
    if (!value) {
      this.tweetInfo = null;
    }
  }

  /**
   * Extra information for communications where kind==EMAIL
   */
  public edu.jhu.hlt.concrete.EmailCommunicationInfo getEmailInfo() {
    return this.emailInfo;
  }

  /**
   * Extra information for communications where kind==EMAIL
   */
  public CommunicationMetadata setEmailInfo(edu.jhu.hlt.concrete.EmailCommunicationInfo emailInfo) {
    this.emailInfo = emailInfo;
    return this;
  }

  public void unsetEmailInfo() {
    this.emailInfo = null;
  }

  /** Returns true if field emailInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetEmailInfo() {
    return this.emailInfo != null;
  }

  public void setEmailInfoIsSet(boolean value) {
    if (!value) {
      this.emailInfo = null;
    }
  }

  /**
   * Extra information that may come from the NITF
   * (News Industry Text Format) schema. See 'nitf.thrift'.
   */
  public edu.jhu.hlt.concrete.NITFInfo getNitfInfo() {
    return this.nitfInfo;
  }

  /**
   * Extra information that may come from the NITF
   * (News Industry Text Format) schema. See 'nitf.thrift'.
   */
  public CommunicationMetadata setNitfInfo(edu.jhu.hlt.concrete.NITFInfo nitfInfo) {
    this.nitfInfo = nitfInfo;
    return this;
  }

  public void unsetNitfInfo() {
    this.nitfInfo = null;
  }

  /** Returns true if field nitfInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetNitfInfo() {
    return this.nitfInfo != null;
  }

  public void setNitfInfoIsSet(boolean value) {
    if (!value) {
      this.nitfInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TWEET_INFO:
      if (value == null) {
        unsetTweetInfo();
      } else {
        setTweetInfo((edu.jhu.hlt.concrete.TweetInfo)value);
      }
      break;

    case EMAIL_INFO:
      if (value == null) {
        unsetEmailInfo();
      } else {
        setEmailInfo((edu.jhu.hlt.concrete.EmailCommunicationInfo)value);
      }
      break;

    case NITF_INFO:
      if (value == null) {
        unsetNitfInfo();
      } else {
        setNitfInfo((edu.jhu.hlt.concrete.NITFInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TWEET_INFO:
      return getTweetInfo();

    case EMAIL_INFO:
      return getEmailInfo();

    case NITF_INFO:
      return getNitfInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TWEET_INFO:
      return isSetTweetInfo();
    case EMAIL_INFO:
      return isSetEmailInfo();
    case NITF_INFO:
      return isSetNitfInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommunicationMetadata)
      return this.equals((CommunicationMetadata)that);
    return false;
  }

  public boolean equals(CommunicationMetadata that) {
    if (that == null)
      return false;

    boolean this_present_tweetInfo = true && this.isSetTweetInfo();
    boolean that_present_tweetInfo = true && that.isSetTweetInfo();
    if (this_present_tweetInfo || that_present_tweetInfo) {
      if (!(this_present_tweetInfo && that_present_tweetInfo))
        return false;
      if (!this.tweetInfo.equals(that.tweetInfo))
        return false;
    }

    boolean this_present_emailInfo = true && this.isSetEmailInfo();
    boolean that_present_emailInfo = true && that.isSetEmailInfo();
    if (this_present_emailInfo || that_present_emailInfo) {
      if (!(this_present_emailInfo && that_present_emailInfo))
        return false;
      if (!this.emailInfo.equals(that.emailInfo))
        return false;
    }

    boolean this_present_nitfInfo = true && this.isSetNitfInfo();
    boolean that_present_nitfInfo = true && that.isSetNitfInfo();
    if (this_present_nitfInfo || that_present_nitfInfo) {
      if (!(this_present_nitfInfo && that_present_nitfInfo))
        return false;
      if (!this.nitfInfo.equals(that.nitfInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tweetInfo = true && (isSetTweetInfo());
    list.add(present_tweetInfo);
    if (present_tweetInfo)
      list.add(tweetInfo);

    boolean present_emailInfo = true && (isSetEmailInfo());
    list.add(present_emailInfo);
    if (present_emailInfo)
      list.add(emailInfo);

    boolean present_nitfInfo = true && (isSetNitfInfo());
    list.add(present_nitfInfo);
    if (present_nitfInfo)
      list.add(nitfInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(CommunicationMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTweetInfo()).compareTo(other.isSetTweetInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTweetInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tweetInfo, other.tweetInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmailInfo()).compareTo(other.isSetEmailInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmailInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emailInfo, other.emailInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNitfInfo()).compareTo(other.isSetNitfInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNitfInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nitfInfo, other.nitfInfo);
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
    StringBuilder sb = new StringBuilder("CommunicationMetadata(");
    boolean first = true;

    if (isSetTweetInfo()) {
      sb.append("tweetInfo:");
      if (this.tweetInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.tweetInfo);
      }
      first = false;
    }
    if (isSetEmailInfo()) {
      if (!first) sb.append(", ");
      sb.append("emailInfo:");
      if (this.emailInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.emailInfo);
      }
      first = false;
    }
    if (isSetNitfInfo()) {
      if (!first) sb.append(", ");
      sb.append("nitfInfo:");
      if (this.nitfInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.nitfInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (tweetInfo != null) {
      tweetInfo.validate();
    }
    if (emailInfo != null) {
      emailInfo.validate();
    }
    if (nitfInfo != null) {
      nitfInfo.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CommunicationMetadataStandardSchemeFactory implements SchemeFactory {
    public CommunicationMetadataStandardScheme getScheme() {
      return new CommunicationMetadataStandardScheme();
    }
  }

  private static class CommunicationMetadataStandardScheme extends StandardScheme<CommunicationMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CommunicationMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TWEET_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tweetInfo = new edu.jhu.hlt.concrete.TweetInfo();
              struct.tweetInfo.read(iprot);
              struct.setTweetInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EMAIL_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.emailInfo = new edu.jhu.hlt.concrete.EmailCommunicationInfo();
              struct.emailInfo.read(iprot);
              struct.setEmailInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NITF_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nitfInfo = new edu.jhu.hlt.concrete.NITFInfo();
              struct.nitfInfo.read(iprot);
              struct.setNitfInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CommunicationMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tweetInfo != null) {
        if (struct.isSetTweetInfo()) {
          oprot.writeFieldBegin(TWEET_INFO_FIELD_DESC);
          struct.tweetInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.emailInfo != null) {
        if (struct.isSetEmailInfo()) {
          oprot.writeFieldBegin(EMAIL_INFO_FIELD_DESC);
          struct.emailInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.nitfInfo != null) {
        if (struct.isSetNitfInfo()) {
          oprot.writeFieldBegin(NITF_INFO_FIELD_DESC);
          struct.nitfInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommunicationMetadataTupleSchemeFactory implements SchemeFactory {
    public CommunicationMetadataTupleScheme getScheme() {
      return new CommunicationMetadataTupleScheme();
    }
  }

  private static class CommunicationMetadataTupleScheme extends TupleScheme<CommunicationMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CommunicationMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTweetInfo()) {
        optionals.set(0);
      }
      if (struct.isSetEmailInfo()) {
        optionals.set(1);
      }
      if (struct.isSetNitfInfo()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTweetInfo()) {
        struct.tweetInfo.write(oprot);
      }
      if (struct.isSetEmailInfo()) {
        struct.emailInfo.write(oprot);
      }
      if (struct.isSetNitfInfo()) {
        struct.nitfInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CommunicationMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.tweetInfo = new edu.jhu.hlt.concrete.TweetInfo();
        struct.tweetInfo.read(iprot);
        struct.setTweetInfoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.emailInfo = new edu.jhu.hlt.concrete.EmailCommunicationInfo();
        struct.emailInfo.read(iprot);
        struct.setEmailInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nitfInfo = new edu.jhu.hlt.concrete.NITFInfo();
        struct.nitfInfo.read(iprot);
        struct.setNitfInfoIsSet(true);
      }
    }
  }

}

