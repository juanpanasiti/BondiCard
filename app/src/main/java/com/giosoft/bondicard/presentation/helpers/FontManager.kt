package com.giosoft.bondicard.presentation.helpers

import android.content.res.AssetManager
import android.graphics.Typeface


class FontManager {

    companion object{
        val ROOT:String = "fonts/"
        val FONT_AWESOME_BRAND : String = ROOT + "font-awesome-brand-regular.otf"
        val FONT_AWESOME_REGULAR : String = ROOT + "font-awesome-free-regular.otf"
        val FONT_AWESOME_SOLID : String = ROOT + "font-awesome-free-solid.otf"

        fun getTypeface(assets:AssetManager, font:String):Typeface{
            return Typeface.createFromAsset(assets,font)
        }//getTypeface()
    }

}//CLASS
