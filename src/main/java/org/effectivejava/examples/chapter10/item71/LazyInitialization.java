package org.effectivejava.examples.chapter10.item71;

import sun.jvm.hotspot.debugger.*;
import sun.jvm.hotspot.oops.FieldType;
import sun.jvm.hotspot.oops.Symbol;

public class LazyInitialization {
    //Normal initialization of an instance field
    private final FieldType fieldType = computeFieldValue();

    private static FieldType computeFieldValue() {
        return new FieldType(Symbol.create(new Address() {
            @Override
            public long getCIntegerAt(long l, long l1, boolean b) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public Address getAddressAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return null;
            }

            @Override
            public Address getCompOopAddressAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return null;
            }

            @Override
            public Address getCompKlassAddressAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return null;
            }

            @Override
            public boolean getJBooleanAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return false;
            }

            @Override
            public byte getJByteAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public char getJCharAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public double getJDoubleAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public float getJFloatAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public int getJIntAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public long getJLongAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public short getJShortAt(long l) throws UnmappedAddressException, UnalignedAddressException {
                return 0;
            }

            @Override
            public OopHandle getOopHandleAt(long l) throws UnmappedAddressException, UnalignedAddressException, NotInHeapException {
                return null;
            }

            @Override
            public OopHandle getCompOopHandleAt(long l) throws UnmappedAddressException, UnalignedAddressException, NotInHeapException {
                return null;
            }

            @Override
            public void setCIntegerAt(long l, long l1, long l2) {

            }

            @Override
            public void setAddressAt(long l, Address address) {

            }

            @Override
            public void setJBooleanAt(long l, boolean b) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setJByteAt(long l, byte b) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setJCharAt(long l, char c) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setJDoubleAt(long l, double v) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setJFloatAt(long l, float v) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setJIntAt(long l, int i) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setJLongAt(long l, long l1) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setJShortAt(long l, short i) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public void setOopHandleAt(long l, OopHandle oopHandle) throws UnmappedAddressException, UnalignedAddressException {

            }

            @Override
            public Address addOffsetTo(long l) throws UnsupportedOperationException {
                return null;
            }

            @Override
            public OopHandle addOffsetToAsOopHandle(long l) throws UnsupportedOperationException {
                return null;
            }

            @Override
            public long minus(Address address) {
                return 0;
            }

            @Override
            public boolean lessThan(Address address) {
                return false;
            }

            @Override
            public boolean lessThanOrEqual(Address address) {
                return false;
            }

            @Override
            public boolean greaterThan(Address address) {
                return false;
            }

            @Override
            public boolean greaterThanOrEqual(Address address) {
                return false;
            }

            @Override
            public Address andWithMask(long l) throws UnsupportedOperationException {
                return null;
            }

            @Override
            public Address orWithMask(long l) throws UnsupportedOperationException {
                return null;
            }

            @Override
            public Address xorWithMask(long l) throws UnsupportedOperationException {
                return null;
            }
        }));
    }

    //lazy initialization of instance field - synchronized accessor

    private FieldType field;
    private FieldType getFieldType() {
        if (field == null) {
            field = computeFieldValue();
        }
        return field;
    }

    //lazy initialization holder class idiom for static fields
    private static class FieldHolder{
        static final FieldType field = computeFieldValue();
        static FieldType getField() {return FieldHolder.field;}
    }

    //double-check idiom for lazy initialization of instance field
    private volatile FieldType doubleCheckField;
    FieldType getField() {
        FieldType result = doubleCheckField;
        if (result==null) {//first check no locking
            synchronized (this){
                result = doubleCheckField;
                if (result==null){//second check with locking
                    field=result=computeFieldValue();
                }
            }
        }
        return  result;
    }

    //if you are okay with initialization replacement, use single-check idiom
    private volatile FieldType singleCheckField;
    private FieldType getSingleCheckField() {
        FieldType result = singleCheckField;
        if (result == null) {
            singleCheckField = result = computeFieldValue();
        }
        return result;
    }
}
