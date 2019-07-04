package org.effectivejava.examples.chapter11.item75;

import java.io.Serializable;
//Good candidate for default serialized form
public class Name implements Serializable {
    /**
     * Last name. must be non-null
     * @serial
     */
    private final String lastName;
    /**
     * First name. must be non-null
     * @serial
     */
    private final String firstName;
    /**
     * Middle name. or null if there is none.
     * @serial
     */
    private final String middleName;

    protected Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
