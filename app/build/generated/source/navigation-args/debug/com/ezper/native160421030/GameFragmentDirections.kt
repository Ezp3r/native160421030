package com.ezper.native160421030

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int

public class GameFragmentDirections private constructor() {
  private data class ActionResultFragment(
    public val score: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_result_fragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("score", this.score)
        return result
      }
  }

  public companion object {
    public fun actionResultFragment(score: Int): NavDirections = ActionResultFragment(score)
  }
}
