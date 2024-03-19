package ru.otus.rv.presentation.finish.simple

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class PaddingDecorator(private val dp: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State,
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = dp
        }

        if (parent.getChildAdapterPosition(view) == parent.adapter!!.itemCount) {
            outRect.bottom = dp
        }
    }
}