package com.ezper.native160421030

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class MainFragmentDirections private constructor() {
  private data class ActionGameFragment(
    public val playerName: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_game_fragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("player_name", this.playerName)
        return result
      }
  }

  public companion object {
    public fun actionGameFragment(playerName: String): NavDirections =
        ActionGameFragment(playerName)
  }
}
