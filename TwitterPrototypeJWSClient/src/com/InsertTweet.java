/**
 * InsertTweet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class InsertTweet  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String tweetTextId;

    private java.lang.String tweetData;

    private java.lang.String hashtagData;

    private java.lang.String isCreator;

    private java.lang.String currentDate;

    private java.lang.String userHandle;

    public InsertTweet() {
    }

    public InsertTweet(
           java.lang.String userId,
           java.lang.String tweetTextId,
           java.lang.String tweetData,
           java.lang.String hashtagData,
           java.lang.String isCreator,
           java.lang.String currentDate,
           java.lang.String userHandle) {
           this.userId = userId;
           this.tweetTextId = tweetTextId;
           this.tweetData = tweetData;
           this.hashtagData = hashtagData;
           this.isCreator = isCreator;
           this.currentDate = currentDate;
           this.userHandle = userHandle;
    }


    /**
     * Gets the userId value for this InsertTweet.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this InsertTweet.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the tweetTextId value for this InsertTweet.
     * 
     * @return tweetTextId
     */
    public java.lang.String getTweetTextId() {
        return tweetTextId;
    }


    /**
     * Sets the tweetTextId value for this InsertTweet.
     * 
     * @param tweetTextId
     */
    public void setTweetTextId(java.lang.String tweetTextId) {
        this.tweetTextId = tweetTextId;
    }


    /**
     * Gets the tweetData value for this InsertTweet.
     * 
     * @return tweetData
     */
    public java.lang.String getTweetData() {
        return tweetData;
    }


    /**
     * Sets the tweetData value for this InsertTweet.
     * 
     * @param tweetData
     */
    public void setTweetData(java.lang.String tweetData) {
        this.tweetData = tweetData;
    }


    /**
     * Gets the hashtagData value for this InsertTweet.
     * 
     * @return hashtagData
     */
    public java.lang.String getHashtagData() {
        return hashtagData;
    }


    /**
     * Sets the hashtagData value for this InsertTweet.
     * 
     * @param hashtagData
     */
    public void setHashtagData(java.lang.String hashtagData) {
        this.hashtagData = hashtagData;
    }


    /**
     * Gets the isCreator value for this InsertTweet.
     * 
     * @return isCreator
     */
    public java.lang.String getIsCreator() {
        return isCreator;
    }


    /**
     * Sets the isCreator value for this InsertTweet.
     * 
     * @param isCreator
     */
    public void setIsCreator(java.lang.String isCreator) {
        this.isCreator = isCreator;
    }


    /**
     * Gets the currentDate value for this InsertTweet.
     * 
     * @return currentDate
     */
    public java.lang.String getCurrentDate() {
        return currentDate;
    }


    /**
     * Sets the currentDate value for this InsertTweet.
     * 
     * @param currentDate
     */
    public void setCurrentDate(java.lang.String currentDate) {
        this.currentDate = currentDate;
    }


    /**
     * Gets the userHandle value for this InsertTweet.
     * 
     * @return userHandle
     */
    public java.lang.String getUserHandle() {
        return userHandle;
    }


    /**
     * Sets the userHandle value for this InsertTweet.
     * 
     * @param userHandle
     */
    public void setUserHandle(java.lang.String userHandle) {
        this.userHandle = userHandle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertTweet)) return false;
        InsertTweet other = (InsertTweet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.tweetTextId==null && other.getTweetTextId()==null) || 
             (this.tweetTextId!=null &&
              this.tweetTextId.equals(other.getTweetTextId()))) &&
            ((this.tweetData==null && other.getTweetData()==null) || 
             (this.tweetData!=null &&
              this.tweetData.equals(other.getTweetData()))) &&
            ((this.hashtagData==null && other.getHashtagData()==null) || 
             (this.hashtagData!=null &&
              this.hashtagData.equals(other.getHashtagData()))) &&
            ((this.isCreator==null && other.getIsCreator()==null) || 
             (this.isCreator!=null &&
              this.isCreator.equals(other.getIsCreator()))) &&
            ((this.currentDate==null && other.getCurrentDate()==null) || 
             (this.currentDate!=null &&
              this.currentDate.equals(other.getCurrentDate()))) &&
            ((this.userHandle==null && other.getUserHandle()==null) || 
             (this.userHandle!=null &&
              this.userHandle.equals(other.getUserHandle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getTweetTextId() != null) {
            _hashCode += getTweetTextId().hashCode();
        }
        if (getTweetData() != null) {
            _hashCode += getTweetData().hashCode();
        }
        if (getHashtagData() != null) {
            _hashCode += getHashtagData().hashCode();
        }
        if (getIsCreator() != null) {
            _hashCode += getIsCreator().hashCode();
        }
        if (getCurrentDate() != null) {
            _hashCode += getCurrentDate().hashCode();
        }
        if (getUserHandle() != null) {
            _hashCode += getUserHandle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertTweet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com", ">insertTweet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tweetTextId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com", "tweetTextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tweetData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com", "tweetData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashtagData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com", "hashtagData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCreator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com", "isCreator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com", "currentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://com", "userHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
