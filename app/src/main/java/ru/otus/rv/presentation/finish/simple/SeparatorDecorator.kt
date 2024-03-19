package ru.otus.rv.presentation.finish.simple

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView


class SeparatorDecorator(private val separatorHeightDp: Int) : RecyclerView.ItemDecoration() {

    private val paint = Paint()

    init {
        paint.isAntiAlias = true
        paint.isDither = true
        paint.color = Color.GRAY
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State,
    ) {
        super.getItemOffsets(outRect, view, parent, state)

        outRect.bottom = separatorHeightDp
    }

    override fun onDrawOver(canvas: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDrawOver(canvas, parent, state)

        val layoutManager = parent.layoutManager ?: return
        for (i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)

            canvas.drawRect(
                layoutManager.getDecoratedLeft(child).toFloat(),
                layoutManager.getDecoratedBottom(child).toFloat() - separatorHeightDp,
                layoutManager.getDecoratedRight(child).toFloat(),
                layoutManager.getDecoratedBottom(child).toFloat(),
                paint,
            )
        }
    }
}
