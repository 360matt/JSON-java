package org.json.junit.data;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Used in testing when a Bean containing big numbers is needed
 */
public interface MyBigNumberBean {
    public BigInteger getBigInteger();

    public BigDecimal getBigDecimal();
}