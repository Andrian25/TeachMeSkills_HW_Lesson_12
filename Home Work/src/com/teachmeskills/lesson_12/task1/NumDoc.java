package com.teachmeskills.lesson_12.task1;

public class NumDoc {

    public static String checkNumDoc(String str) {

        String numdoc = "";

        if (str.length() != 15) {
            numdoc = "The length of the document number must be 15 characters";
        } else if (!((str.contains("docnum")) || (str.contains("сontract")))) {
            numdoc = "The document number does not contain docnum or сontract";
        } else {
            numdoc = "";
        }
        return numdoc;
    }
}