/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.linkedin.pinot.common.request;

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
 * AUTO GENERATED: DO NOT EDIT
 * Instance Request
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-4-1")
public class InstanceRequest implements org.apache.thrift.TBase<InstanceRequest, InstanceRequest._Fields>, java.io.Serializable, Cloneable, Comparable<InstanceRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InstanceRequest");

  private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("requestId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField QUERY_FIELD_DESC = new org.apache.thrift.protocol.TField("query", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SEARCH_SEGMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("searchSegments", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ENABLE_TRACE_FIELD_DESC = new org.apache.thrift.protocol.TField("enableTrace", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField BROKER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerId", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InstanceRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InstanceRequestTupleSchemeFactory());
  }

  private long requestId; // required
  private BrokerRequest query; // required
  private List<String> searchSegments; // optional
  private boolean enableTrace; // optional
  private String brokerId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST_ID((short)1, "requestId"),
    QUERY((short)2, "query"),
    SEARCH_SEGMENTS((short)3, "searchSegments"),
    ENABLE_TRACE((short)4, "enableTrace"),
    BROKER_ID((short)5, "brokerId");

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
        case 1: // REQUEST_ID
          return REQUEST_ID;
        case 2: // QUERY
          return QUERY;
        case 3: // SEARCH_SEGMENTS
          return SEARCH_SEGMENTS;
        case 4: // ENABLE_TRACE
          return ENABLE_TRACE;
        case 5: // BROKER_ID
          return BROKER_ID;
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
  private static final int __REQUESTID_ISSET_ID = 0;
  private static final int __ENABLETRACE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.SEARCH_SEGMENTS,_Fields.ENABLE_TRACE,_Fields.BROKER_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("requestId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.QUERY, new org.apache.thrift.meta_data.FieldMetaData("query", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BrokerRequest.class)));
    tmpMap.put(_Fields.SEARCH_SEGMENTS, new org.apache.thrift.meta_data.FieldMetaData("searchSegments", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ENABLE_TRACE, new org.apache.thrift.meta_data.FieldMetaData("enableTrace", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.BROKER_ID, new org.apache.thrift.meta_data.FieldMetaData("brokerId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InstanceRequest.class, metaDataMap);
  }

  public InstanceRequest() {
  }

  public InstanceRequest(
    long requestId,
    BrokerRequest query)
  {
    this();
    this.requestId = requestId;
    setRequestIdIsSet(true);
    this.query = query;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InstanceRequest(InstanceRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.requestId = other.requestId;
    if (other.isSetQuery()) {
      this.query = new BrokerRequest(other.query);
    }
    if (other.isSetSearchSegments()) {
      List<String> __this__searchSegments = new ArrayList<String>(other.searchSegments);
      this.searchSegments = __this__searchSegments;
    }
    this.enableTrace = other.enableTrace;
    if (other.isSetBrokerId()) {
      this.brokerId = other.brokerId;
    }
  }

  public InstanceRequest deepCopy() {
    return new InstanceRequest(this);
  }

  @Override
  public void clear() {
    setRequestIdIsSet(false);
    this.requestId = 0;
    this.query = null;
    this.searchSegments = null;
    setEnableTraceIsSet(false);
    this.enableTrace = false;
    this.brokerId = null;
  }

  public long getRequestId() {
    return this.requestId;
  }

  public void setRequestId(long requestId) {
    this.requestId = requestId;
    setRequestIdIsSet(true);
  }

  public void unsetRequestId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUESTID_ISSET_ID);
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return EncodingUtils.testBit(__isset_bitfield, __REQUESTID_ISSET_ID);
  }

  public void setRequestIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUESTID_ISSET_ID, value);
  }

  public BrokerRequest getQuery() {
    return this.query;
  }

  public void setQuery(BrokerRequest query) {
    this.query = query;
  }

  public void unsetQuery() {
    this.query = null;
  }

  /** Returns true if field query is set (has been assigned a value) and false otherwise */
  public boolean isSetQuery() {
    return this.query != null;
  }

  public void setQueryIsSet(boolean value) {
    if (!value) {
      this.query = null;
    }
  }

  public int getSearchSegmentsSize() {
    return (this.searchSegments == null) ? 0 : this.searchSegments.size();
  }

  public java.util.Iterator<String> getSearchSegmentsIterator() {
    return (this.searchSegments == null) ? null : this.searchSegments.iterator();
  }

  public void addToSearchSegments(String elem) {
    if (this.searchSegments == null) {
      this.searchSegments = new ArrayList<String>();
    }
    this.searchSegments.add(elem);
  }

  public List<String> getSearchSegments() {
    return this.searchSegments;
  }

  public void setSearchSegments(List<String> searchSegments) {
    this.searchSegments = searchSegments;
  }

  public void unsetSearchSegments() {
    this.searchSegments = null;
  }

  /** Returns true if field searchSegments is set (has been assigned a value) and false otherwise */
  public boolean isSetSearchSegments() {
    return this.searchSegments != null;
  }

  public void setSearchSegmentsIsSet(boolean value) {
    if (!value) {
      this.searchSegments = null;
    }
  }

  public boolean isEnableTrace() {
    return this.enableTrace;
  }

  public void setEnableTrace(boolean enableTrace) {
    this.enableTrace = enableTrace;
    setEnableTraceIsSet(true);
  }

  public void unsetEnableTrace() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENABLETRACE_ISSET_ID);
  }

  /** Returns true if field enableTrace is set (has been assigned a value) and false otherwise */
  public boolean isSetEnableTrace() {
    return EncodingUtils.testBit(__isset_bitfield, __ENABLETRACE_ISSET_ID);
  }

  public void setEnableTraceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENABLETRACE_ISSET_ID, value);
  }

  public String getBrokerId() {
    return this.brokerId;
  }

  public void setBrokerId(String brokerId) {
    this.brokerId = brokerId;
  }

  public void unsetBrokerId() {
    this.brokerId = null;
  }

  /** Returns true if field brokerId is set (has been assigned a value) and false otherwise */
  public boolean isSetBrokerId() {
    return this.brokerId != null;
  }

  public void setBrokerIdIsSet(boolean value) {
    if (!value) {
      this.brokerId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((Long)value);
      }
      break;

    case QUERY:
      if (value == null) {
        unsetQuery();
      } else {
        setQuery((BrokerRequest)value);
      }
      break;

    case SEARCH_SEGMENTS:
      if (value == null) {
        unsetSearchSegments();
      } else {
        setSearchSegments((List<String>)value);
      }
      break;

    case ENABLE_TRACE:
      if (value == null) {
        unsetEnableTrace();
      } else {
        setEnableTrace((Boolean)value);
      }
      break;

    case BROKER_ID:
      if (value == null) {
        unsetBrokerId();
      } else {
        setBrokerId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_ID:
      return Long.valueOf(getRequestId());

    case QUERY:
      return getQuery();

    case SEARCH_SEGMENTS:
      return getSearchSegments();

    case ENABLE_TRACE:
      return Boolean.valueOf(isEnableTrace());

    case BROKER_ID:
      return getBrokerId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_ID:
      return isSetRequestId();
    case QUERY:
      return isSetQuery();
    case SEARCH_SEGMENTS:
      return isSetSearchSegments();
    case ENABLE_TRACE:
      return isSetEnableTrace();
    case BROKER_ID:
      return isSetBrokerId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InstanceRequest)
      return this.equals((InstanceRequest)that);
    return false;
  }

  public boolean equals(InstanceRequest that) {
    if (that == null)
      return false;

    boolean this_present_requestId = true;
    boolean that_present_requestId = true;
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (this.requestId != that.requestId)
        return false;
    }

    boolean this_present_query = true && this.isSetQuery();
    boolean that_present_query = true && that.isSetQuery();
    if (this_present_query || that_present_query) {
      if (!(this_present_query && that_present_query))
        return false;
      if (!this.query.equals(that.query))
        return false;
    }

    boolean this_present_searchSegments = true && this.isSetSearchSegments();
    boolean that_present_searchSegments = true && that.isSetSearchSegments();
    if (this_present_searchSegments || that_present_searchSegments) {
      if (!(this_present_searchSegments && that_present_searchSegments))
        return false;
      if (!this.searchSegments.equals(that.searchSegments))
        return false;
    }

    boolean this_present_enableTrace = true && this.isSetEnableTrace();
    boolean that_present_enableTrace = true && that.isSetEnableTrace();
    if (this_present_enableTrace || that_present_enableTrace) {
      if (!(this_present_enableTrace && that_present_enableTrace))
        return false;
      if (this.enableTrace != that.enableTrace)
        return false;
    }

    boolean this_present_brokerId = true && this.isSetBrokerId();
    boolean that_present_brokerId = true && that.isSetBrokerId();
    if (this_present_brokerId || that_present_brokerId) {
      if (!(this_present_brokerId && that_present_brokerId))
        return false;
      if (!this.brokerId.equals(that.brokerId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_requestId = true;
    list.add(present_requestId);
    if (present_requestId)
      list.add(requestId);

    boolean present_query = true && (isSetQuery());
    list.add(present_query);
    if (present_query)
      list.add(query);

    boolean present_searchSegments = true && (isSetSearchSegments());
    list.add(present_searchSegments);
    if (present_searchSegments)
      list.add(searchSegments);

    boolean present_enableTrace = true && (isSetEnableTrace());
    list.add(present_enableTrace);
    if (present_enableTrace)
      list.add(enableTrace);

    boolean present_brokerId = true && (isSetBrokerId());
    list.add(present_brokerId);
    if (present_brokerId)
      list.add(brokerId);

    return list.hashCode();
  }

  @Override
  public int compareTo(InstanceRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequestId()).compareTo(other.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestId, other.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQuery()).compareTo(other.isSetQuery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.query, other.query);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSearchSegments()).compareTo(other.isSetSearchSegments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSearchSegments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.searchSegments, other.searchSegments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnableTrace()).compareTo(other.isSetEnableTrace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnableTrace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.enableTrace, other.enableTrace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBrokerId()).compareTo(other.isSetBrokerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrokerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.brokerId, other.brokerId);
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
    StringBuilder sb = new StringBuilder("InstanceRequest(");
    boolean first = true;

    sb.append("requestId:");
    sb.append(this.requestId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("query:");
    if (this.query == null) {
      sb.append("null");
    } else {
      sb.append(this.query);
    }
    first = false;
    if (isSetSearchSegments()) {
      if (!first) sb.append(", ");
      sb.append("searchSegments:");
      if (this.searchSegments == null) {
        sb.append("null");
      } else {
        sb.append(this.searchSegments);
      }
      first = false;
    }
    if (isSetEnableTrace()) {
      if (!first) sb.append(", ");
      sb.append("enableTrace:");
      sb.append(this.enableTrace);
      first = false;
    }
    if (isSetBrokerId()) {
      if (!first) sb.append(", ");
      sb.append("brokerId:");
      if (this.brokerId == null) {
        sb.append("null");
      } else {
        sb.append(this.brokerId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetRequestId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestId' is unset! Struct:" + toString());
    }

    if (!isSetQuery()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'query' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (query != null) {
      query.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InstanceRequestStandardSchemeFactory implements SchemeFactory {
    public InstanceRequestStandardScheme getScheme() {
      return new InstanceRequestStandardScheme();
    }
  }

  private static class InstanceRequestStandardScheme extends StandardScheme<InstanceRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InstanceRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.requestId = iprot.readI64();
              struct.setRequestIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUERY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.query = new BrokerRequest();
              struct.query.read(iprot);
              struct.setQueryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEARCH_SEGMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list86 = iprot.readListBegin();
                struct.searchSegments = new ArrayList<String>(_list86.size);
                String _elem87;
                for (int _i88 = 0; _i88 < _list86.size; ++_i88)
                {
                  _elem87 = iprot.readString();
                  struct.searchSegments.add(_elem87);
                }
                iprot.readListEnd();
              }
              struct.setSearchSegmentsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENABLE_TRACE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.enableTrace = iprot.readBool();
              struct.setEnableTraceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BROKER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.brokerId = iprot.readString();
              struct.setBrokerIdIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, InstanceRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
      oprot.writeI64(struct.requestId);
      oprot.writeFieldEnd();
      if (struct.query != null) {
        oprot.writeFieldBegin(QUERY_FIELD_DESC);
        struct.query.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.searchSegments != null) {
        if (struct.isSetSearchSegments()) {
          oprot.writeFieldBegin(SEARCH_SEGMENTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.searchSegments.size()));
            for (String _iter89 : struct.searchSegments)
            {
              oprot.writeString(_iter89);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetEnableTrace()) {
        oprot.writeFieldBegin(ENABLE_TRACE_FIELD_DESC);
        oprot.writeBool(struct.enableTrace);
        oprot.writeFieldEnd();
      }
      if (struct.brokerId != null) {
        if (struct.isSetBrokerId()) {
          oprot.writeFieldBegin(BROKER_ID_FIELD_DESC);
          oprot.writeString(struct.brokerId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InstanceRequestTupleSchemeFactory implements SchemeFactory {
    public InstanceRequestTupleScheme getScheme() {
      return new InstanceRequestTupleScheme();
    }
  }

  private static class InstanceRequestTupleScheme extends TupleScheme<InstanceRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InstanceRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.requestId);
      struct.query.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetSearchSegments()) {
        optionals.set(0);
      }
      if (struct.isSetEnableTrace()) {
        optionals.set(1);
      }
      if (struct.isSetBrokerId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSearchSegments()) {
        {
          oprot.writeI32(struct.searchSegments.size());
          for (String _iter90 : struct.searchSegments)
          {
            oprot.writeString(_iter90);
          }
        }
      }
      if (struct.isSetEnableTrace()) {
        oprot.writeBool(struct.enableTrace);
      }
      if (struct.isSetBrokerId()) {
        oprot.writeString(struct.brokerId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InstanceRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.requestId = iprot.readI64();
      struct.setRequestIdIsSet(true);
      struct.query = new BrokerRequest();
      struct.query.read(iprot);
      struct.setQueryIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list91 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.searchSegments = new ArrayList<String>(_list91.size);
          String _elem92;
          for (int _i93 = 0; _i93 < _list91.size; ++_i93)
          {
            _elem92 = iprot.readString();
            struct.searchSegments.add(_elem92);
          }
        }
        struct.setSearchSegmentsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.enableTrace = iprot.readBool();
        struct.setEnableTraceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.brokerId = iprot.readString();
        struct.setBrokerIdIsSet(true);
      }
    }
  }

}

