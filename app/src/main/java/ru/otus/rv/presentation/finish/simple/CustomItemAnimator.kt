package ru.otus.rv.presentation.finish.simple

import android.animation.AnimatorInflater
import android.content.Context
import android.view.animation.BounceInterpolator
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.R


class CustomItemAnimator(val context: Context): DefaultItemAnimator() {

    override fun animateAdd(holder: RecyclerView.ViewHolder): Boolean {
        val set = AnimatorInflater.loadAnimator(
            context,
            R.animator.zoom_in
        )
        set.interpolator = BounceInterpolator()
        set.setTarget(holder.itemView)
        set.start()
        return true
    }
}
