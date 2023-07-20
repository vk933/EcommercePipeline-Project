// ORM class for table 'purchase_data'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jul 19 03:17:08 PDT 2023
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class purchase_data extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer userid;
  public Integer get_userid() {
    return userid;
  }
  public void set_userid(Integer userid) {
    this.userid = userid;
  }
  public purchase_data with_userid(Integer userid) {
    this.userid = userid;
    return this;
  }
  private java.sql.Timestamp timestamp;
  public java.sql.Timestamp get_timestamp() {
    return timestamp;
  }
  public void set_timestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }
  public purchase_data with_timestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  private Integer amount;
  public Integer get_amount() {
    return amount;
  }
  public void set_amount(Integer amount) {
    this.amount = amount;
  }
  public purchase_data with_amount(Integer amount) {
    this.amount = amount;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof purchase_data)) {
      return false;
    }
    purchase_data that = (purchase_data) o;
    boolean equal = true;
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.timestamp == null ? that.timestamp == null : this.timestamp.equals(that.timestamp));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof purchase_data)) {
      return false;
    }
    purchase_data that = (purchase_data) o;
    boolean equal = true;
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.timestamp == null ? that.timestamp == null : this.timestamp.equals(that.timestamp));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.userid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.timestamp = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.amount = JdbcWritableBridge.readInteger(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.userid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.timestamp = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.amount = JdbcWritableBridge.readInteger(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(userid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(timestamp, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(amount, 3 + __off, 4, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(userid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(timestamp, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(amount, 3 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.userid = null;
    } else {
    this.userid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.timestamp = null;
    } else {
    this.timestamp = new Timestamp(__dataIn.readLong());
    this.timestamp.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.amount = null;
    } else {
    this.amount = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.userid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.userid);
    }
    if (null == this.timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.timestamp.getTime());
    __dataOut.writeInt(this.timestamp.getNanos());
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.amount);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.userid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.userid);
    }
    if (null == this.timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.timestamp.getTime());
    __dataOut.writeInt(this.timestamp.getNanos());
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.amount);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(userid==null?"null":"" + userid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(timestamp==null?"null":"" + timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(userid==null?"null":"" + userid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(timestamp==null?"null":"" + timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.userid = null; } else {
      this.userid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.timestamp = null; } else {
      this.timestamp = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.userid = null; } else {
      this.userid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.timestamp = null; } else {
      this.timestamp = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    purchase_data o = (purchase_data) super.clone();
    o.timestamp = (o.timestamp != null) ? (java.sql.Timestamp) o.timestamp.clone() : null;
    return o;
  }

  public void clone0(purchase_data o) throws CloneNotSupportedException {
    o.timestamp = (o.timestamp != null) ? (java.sql.Timestamp) o.timestamp.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("timestamp", this.timestamp);
    __sqoop$field_map.put("amount", this.amount);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("timestamp", this.timestamp);
    __sqoop$field_map.put("amount", this.amount);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("userid".equals(__fieldName)) {
      this.userid = (Integer) __fieldVal;
    }
    else    if ("timestamp".equals(__fieldName)) {
      this.timestamp = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("amount".equals(__fieldName)) {
      this.amount = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("userid".equals(__fieldName)) {
      this.userid = (Integer) __fieldVal;
      return true;
    }
    else    if ("timestamp".equals(__fieldName)) {
      this.timestamp = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("amount".equals(__fieldName)) {
      this.amount = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
