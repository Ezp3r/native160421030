package com.ezper.native160421030

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class ResultFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_home_fragment)
  }
}
