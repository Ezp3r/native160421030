package com.ezper.native160421030

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class GameFragmentArgs(
  public val playerName: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("player_name", this.playerName)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("player_name", this.playerName)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): GameFragmentArgs {
      bundle.setClassLoader(GameFragmentArgs::class.java.classLoader)
      val __playerName : String?
      if (bundle.containsKey("player_name")) {
        __playerName = bundle.getString("player_name")
        if (__playerName == null) {
          throw IllegalArgumentException("Argument \"player_name\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"player_name\" is missing and does not have an android:defaultValue")
      }
      return GameFragmentArgs(__playerName)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): GameFragmentArgs {
      val __playerName : String?
      if (savedStateHandle.contains("player_name")) {
        __playerName = savedStateHandle["player_name"]
        if (__playerName == null) {
          throw IllegalArgumentException("Argument \"player_name\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"player_name\" is missing and does not have an android:defaultValue")
      }
      return GameFragmentArgs(__playerName)
    }
  }
}
