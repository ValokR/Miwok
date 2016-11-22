package com.example.android.miwok;

import android.content.Context;

/**
 * Created by neil on 11/22/16.
 * Represents a word that user wants to learn.  Contains both miwok and default translations
 */

public class Word {

    private String mMiwokWord;
    private String mDefaultWord;

    public Word (String defaultWord, String miwokWord) {
        this.mMiwokWord = miwokWord;
        this.mDefaultWord = defaultWord;
    }

    //getters
    public String getMiwokWord() {
        return mMiwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }
}
